package com.icet.crm.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

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
