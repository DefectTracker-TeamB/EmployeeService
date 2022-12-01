package com.example.EmolyeeService.ServiceImpl;

import com.example.EmolyeeService.Dto.AddDesignationDto;
import com.example.EmolyeeService.Dto.DesignationDto;
import com.example.EmolyeeService.Entity.DefectTrackerDesignations;
import com.example.EmolyeeService.Entity.Designations;
import com.example.EmolyeeService.Repository.DefectDesignationRepo;
import com.example.EmolyeeService.Repository.DesignationRepo;
import com.example.EmolyeeService.Service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService {
    @Autowired
    private DesignationRepo designationRepo;
    @Autowired
    private DefectDesignationRepo defectDesignationRepo;
    @Override
    public void addDesignation(DesignationDto designationDto) {
        Designations defectTrackerDesignation=new Designations();
        defectTrackerDesignation.setName(designationDto.getName());
        designationRepo.save(defectTrackerDesignation);
    }
    @Override
    public List<Designations> getAllDesignations() {
        return designationRepo.findAll();
    }

    @Override
    public String deleteDesignation(int id) {
        try{
            designationRepo.deleteById(id);
            DefectTrackerDesignations defectTrackerDesignations=defectDesignationRepo.getDesignationsByDesignationId(id);
            if(defectTrackerDesignations!=null){
                defectDesignationRepo.deleteById(defectTrackerDesignations.getId());
            }

        }catch (Exception e){
            return "No such designation";
        }
        return "Designation deleted";


    }

    @Override
    public String editDesignation(int id, DesignationDto designationDto) {
        try{
            Designations designations=designationRepo.findById(id).get();
            designations.setName(designationDto.getName());
            designationRepo.save(designations);
            DefectTrackerDesignations defectTrackerDesignations=defectDesignationRepo.getDesignationsByDesignationId(id);
            defectTrackerDesignations.setName(designationDto.getName());
            defectDesignationRepo.save(defectTrackerDesignations);
        }catch (Exception e){
            return "No such designations";
        }
        return "Edited";

    }

    @Override
    public String addToDefectTracker(AddDesignationDto addDesignationDto) {
        DefectTrackerDesignations defectTrackerDesignations=new DefectTrackerDesignations();
        try {
            Designations designations=designationRepo.findById(addDesignationDto.getDesignation_id()).get();
            defectTrackerDesignations.setDesignation_id(designations.getId());
            defectTrackerDesignations.setName(designations.getName());
            defectDesignationRepo.save(defectTrackerDesignations);
        }catch (Exception e){
            return "No such designation";
        }
        return "Designation added to defect service";

    }
}
