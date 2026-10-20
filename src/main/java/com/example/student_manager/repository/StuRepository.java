/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.example.student_manager.repository;
  
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_manager.model.Student; 

/**
 *
 * @author ASUS
 */
public interface StuRepository extends JpaRepository<Student, Long>{
    boolean existsByEmail(String email); 
  
    boolean existsByEmailAndIdNot(String email, Long id); 

}
