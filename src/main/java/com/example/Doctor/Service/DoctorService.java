package com.example.Doctor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Doctor.Entity.Doctor;
import com.example.Doctor.Exception.NoSuchDoctorExistsException;
import com.example.Doctor.Repository.DoctorRepository;


@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	public Doctor saveDoctor(Doctor doctor)
	{
		return repository.save(doctor);
	}
	
	public List<Doctor> saveDoctor(List<Doctor> doctor)
	{
		return repository.saveAll(doctor);
	}
	
	private boolean exist(int id)
	{
		return repository.existsById(id);
		
	}
	public boolean addDoctor1(Doctor d)
	{
		if(exist(d.getId()))
			return false;
		repository.save(d);
		return true;
	}
	
	public List<Doctor> getDoctor()
	{
		return repository.findAll();
	}
	
	public Doctor getDoctorById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	
	public List<Doctor> findDoctorWithSorting(String salary)
	{
		return repository.findAll(Sort.by(Sort.Direction.DESC, salary));
	}
	
	public String deleteDoctor(int id)
	{
		repository.deleteById(id);
		return "Deleted Sccessfully " +id;
	}
	
	
	public String updateDoctor(Doctor doctor)
	{
		Doctor existingDoctor=repository.findById(doctor.getId()).orElse(null);
		if(existingDoctor ==null)
			throw new NoSuchDoctorExistsException ("No such employee is exists");
		existingDoctor.setSalary(doctor.getSalary());
		 repository.save(existingDoctor);
		 return "Update Salary successfully ";
		
	}
}
