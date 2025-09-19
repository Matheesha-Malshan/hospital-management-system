package com.icet.crm.service;

import com.icet.crm.model.Patient;

import java.util.List;

public interface PatientService {
    void addPatient(Patient patient);
    List<Patient> getPatient();

    void deleteById(Integer id);

    List<Patient> searchByName(String name);

    List<Patient> searchByAdress(String address);

    List<Patient> searchBycontact(String contact);

    List<Patient> searchByBloodGroup(String bloodGroup);
}
