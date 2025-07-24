package com.Kartavya.app.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Kartavya.app.entity.College;

public class CollegeDao {

	private static final String url = "jdbc:mysql://localhost:3306/college"; 
	private static final String uname = "root"; 
	private static final String password = "KartavyaGore@123"; 
	
	private PreparedStatement ps = null;
	Connection con = null;
	
	Connection getdbConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,uname,password);
		return con;
	}
	
	
	
	public College getCollege(int id) throws ClassNotFoundException, SQLException {
		String sql = "select * from college where clg_id=?";
		ps = getdbConnection().prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		College c = null;
		
		while(rs.next()) {
			int clg_id = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			
			c = new College(clg_id,name,city);
			
		}
		return c;
	}
	
	public ArrayList<College> getAllColleges() throws Exception{
		
		ArrayList<College> clgList= new ArrayList<>();
		String sql = "select * from college";
		ps = getdbConnection().prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
			int clg_id = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			
			clgList.add(new College(clg_id,name,city));
			
		}
		return clgList;
	}
	
	
	public void addCollege(int id, String c_name, String city) throws Exception{
		String sql = "insert into college values(?,?,?)";
		ps = getdbConnection().prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, c_name);
		ps.setString(3, city);
		
		ps.executeUpdate();
	}
	
	public void editCollege(int id, String c_name, String city) throws Exception{
		String sql = "update college set clg_name = ?,city = ? where clg_id = ?";
		ps = getdbConnection().prepareStatement(sql);
		ps.setString(1, c_name);
		ps.setString(2, city);
		ps.setInt(3, id);
		
		ps.executeUpdate();
		
	}



	public void deleteCollege(int id) throws Exception {
		String sql = "delete from college where clg_id = ?";
		ps = getdbConnection().prepareStatement(sql);
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
	}
}
