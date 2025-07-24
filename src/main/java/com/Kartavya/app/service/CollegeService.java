package com.Kartavya.app.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Kartavya.app.Dao.CollegeDao;
import com.Kartavya.app.entity.College;

public class CollegeService {
	
	CollegeDao dao = new CollegeDao();
	
	public College getCollege(int id) throws ClassNotFoundException, SQLException {
		
		return dao.getCollege(id);
	}

	
	public ArrayList<College> getAllColleges() throws Exception{
		return dao.getAllColleges();
	}
	
	public void addCollege(int id, String c_name, String city) throws Exception{
		dao.addCollege(id, c_name, city);
	}
	
	public void editCollege(int id, String new_cname, String new_city) throws Exception{
		dao.editCollege(id, new_cname, new_city);
	}
	
	public void deleteCollege(int id) throws Exception{
		dao.deleteCollege(id);
	}
	
}
