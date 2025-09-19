package com.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer ID;
    private String name;
    private String address;
    private String bloodGroup;
    private String category;
    private String Gender;
    private String contact;
    private String note;
    private String age;
    private String allergies;

}
