package com.Kartavya.app.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kartavya.app.entity.College;
import com.Kartavya.app.service.CollegeService;

@RestController
public class CollegeController {
	
	CollegeService cs = new CollegeService();

	//REST API CRUD Operations
	
	@GetMapping("/getCollege/{id}")
	public College getCollege(@PathVariable int id) throws ClassNotFoundException, SQLException {
		return cs.getCollege(id);
	}
	
	@GetMapping("/getAllColleges")
	public ArrayList<College> getAllColleges() throws Exception{
		return cs.getAllColleges();
	}
	
	@PostMapping("/addCollege")
	public void addCollege(@RequestBody  College c) throws Exception {
		cs.addCollege(c.getClgid(), c.getClg_name(), c.getCity());
	}
	
	@PutMapping("/editCollege")
	public void editCollege(@RequestBody College c ) throws Exception {
		cs.editCollege(c.getClgid(), c.getClg_name(), c.getCity());
	}
	
	@DeleteMapping("/deleteCollege/{id}")
	public void deleteCollege(@PathVariable int id) throws Exception{
		cs.deleteCollege(id);
	}
	
}
