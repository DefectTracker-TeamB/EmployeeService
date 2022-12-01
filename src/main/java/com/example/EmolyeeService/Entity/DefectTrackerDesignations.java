package com.example.EmolyeeService.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "defect_designations")
public class DefectTrackerDesignations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int designation_id;
    private String name;
}
