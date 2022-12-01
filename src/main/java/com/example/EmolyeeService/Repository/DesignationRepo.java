package com.example.EmolyeeService.Repository;

import com.example.EmolyeeService.Entity.Designations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignationRepo extends JpaRepository<Designations,Integer> {




}
