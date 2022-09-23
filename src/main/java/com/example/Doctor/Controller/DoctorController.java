package com.example.Doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Doctor.Entity.Doctor;
import com.example.Doctor.Exception.DoctorException;
import com.example.Doctor.Service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	
	@PostMapping("/Doctor")
	public Doctor addDoctor(@RequestBody Doctor doctor)
	{
		return service.saveDoctor(doctor);
	}
	@PostMapping("/ListDoctor")
	public List<Doctor> addDoctor(@RequestBody List<Doctor> doctor)
	{
		return service.saveDoctor(doctor);
	}
	
	@GetMapping("/exception")
	public ResponseEntity addDoctor1(@RequestBody Doctor d)
	{
		if(service.addDoctor1(d))
			return new ResponseEntity<>(new DoctorException().getMessage(),HttpStatus.CONFLICT);
		return ResponseEntity.ok(d);
	}
	
	@GetMapping("/getDoctor")
	public List<Doctor> findDoctor()
	{
		return service.getDoctor();
	}
	
	@GetMapping("/getDoctorById/{id}")
	public Doctor findDoctorByid(@PathVariable int id)
	{
		return service.getDoctorById(id);
	}
	
	@GetMapping("/{salary}")
	public List<Doctor> getDoctorBySorting(@PathVariable String salary)
	{
		 List<Doctor> allDoctors = service.findDoctorWithSorting(salary);
		return allDoctors;
	}
	
	
	
	@PutMapping("/updateDoctor")
	public String updateEmployee(@RequestBody Doctor doctor)
	{
		return service.updateDoctor(doctor);
	}
	
	@DeleteMapping("/deleteDoctor/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		return service.deleteDoctor(id);
	}


}
