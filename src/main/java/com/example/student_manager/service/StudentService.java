package com.example.student_manager.service;
  
import java.util.List; 
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.student_manager.model.Student;
import com.example.student_manager.repository.StuRepository; 
  
@Service 

public class StudentService {
     private final StuRepository repository; 
  
    public StudentService(StuRepository repository) { 
        this.repository = repository; 
    } 
  
    public List<Student> findAll() { 
        return repository.findAll(); 
    } 
  
    public Optional<Student> findById(Long id) { 
        return repository.findById(id); 
    } 
  
    public Student save(Student student) { 
        return repository.save(student); 
    } 
  
    public void deleteById(Long id) { 
        repository.deleteById(id); 
    } 
  
    public boolean emailExists(String email, Long excludeId) { 
        return excludeId == null 
                ? repository.existsByEmail(email) 
                : repository.existsByEmailAndIdNot(email, excludeId); 
    } 
}
