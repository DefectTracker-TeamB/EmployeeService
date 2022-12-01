package com.example.EmolyeeService.Repository;

import com.example.EmolyeeService.Entity.DefectTrackerDesignations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefectDesignationRepo extends JpaRepository<DefectTrackerDesignations,Integer> {
    @Query(value = "select * from defect_designations where designation_id=?",nativeQuery = true)
    public DefectTrackerDesignations getDesignationsByDesignationId(int id);


    @Query(value = "select designation_id from defect_designations",nativeQuery = true)
    public List<Integer> findAllDesignations();
}
