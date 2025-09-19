package com.icet.crm.controller;

import com.icet.crm.model.Patient;
import com.icet.crm.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patient")
@CrossOrigin
public class PatientController {

    final PatientService patient;

    @GetMapping("/all")
    public List<Patient> getPatient(){

        return patient.getPatient();
    }

    @PostMapping()
    public void addPatient(@RequestBody Patient patientData){

        patient.addPatient(patientData);
    }
    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){

        patient.deleteById(id);
    }

    @PutMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatient(@RequestBody Patient patientData){
        patient.addPatient(patientData);
    }
    @GetMapping("/search-by-name/{name}")
    public List<Patient> searchByName(@PathVariable String name){

        return patient.searchByName(name);
    }
    @GetMapping("/search-by-address/{address}")
    public List<Patient> searchByAddress(@PathVariable String address){

        return patient.searchByAdress(address);
    }
    @GetMapping("/search-by-contact/{contact}")
    public List<Patient> searchByContact(@PathVariable String contact){

        return patient.searchBycontact(contact);
    }
    @GetMapping("/search-by-bloodGroup/{bloodGroup}")
    public List<Patient> searchByBloodGroup(@PathVariable String bloodGroup){
        return patient.searchBycontact(bloodGroup);
    }

}
