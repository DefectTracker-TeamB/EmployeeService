package com.example.EmolyeeService.Service;

import com.example.EmolyeeService.Dto.AddDesignationDto;
import com.example.EmolyeeService.Dto.DesignationDto;
import com.example.EmolyeeService.Entity.Designations;

import java.util.List;

public interface DesignationService {
    void addDesignation(DesignationDto designationDto);
    List<Designations> getAllDesignations();
    String deleteDesignation(int id);
    String editDesignation(int id,DesignationDto designationDto);
    String addToDefectTracker(AddDesignationDto addDesignationDto);

}
