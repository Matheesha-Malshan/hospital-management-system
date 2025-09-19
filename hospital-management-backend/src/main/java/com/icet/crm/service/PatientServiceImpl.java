package com.icet.crm.service;

import com.icet.crm.entity.PatientEntity;
import com.icet.crm.model.Patient;
import com.icet.crm.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    final PatientRepository patientRepository;
    final ModelMapper mapper;


    public void addPatient(Patient patient){

        //entity.setId(null);
        patientRepository.save(mapper.map(patient, PatientEntity.class));

    }
    public List<Patient> getPatient() {
        List<Patient> patientList=new ArrayList<>();


        patientRepository.findAll().forEach(patient->patientList.add
                (mapper.map(patient,Patient.class)));

        return patientList;
    }

    @Override
    public void deleteById(Integer id) {
        patientRepository.deleteById(id);
    }

    @Override
    public List<Patient>searchByName(String name) {
        List<Patient> patientList=new ArrayList<>();

        patientRepository.findByName(name).forEach(patient -> patientList.add
                (mapper.map(patient,Patient.class)));

        return patientList;
    }

    @Override
    public List<Patient> searchByAdress(String address) {
        List<Patient> patientList=new ArrayList<>();

        patientRepository.findByAddress(address).forEach(patient -> patientList.add
                (mapper.map(patient,Patient.class)));

        return patientList;
    }

    @Override
    public List<Patient> searchBycontact(String contact) {
        List<Patient> patientList=new ArrayList<>();

        patientRepository.findByContact(contact).forEach(patient -> patientList.add
                (mapper.map(patient,Patient.class)));

        return patientList;
    }

    @Override
    public List<Patient> searchByBloodGroup(String bloodGroup) {
        List<Patient> patientList=new ArrayList<>();

        patientRepository.findBybloodGroup(bloodGroup).forEach(patient -> patientList.add
                (mapper.map(patient,Patient.class)));

        return patientList;
    }


}
