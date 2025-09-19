package com.icet.crm.repository;

import com.icet.crm.entity.PatientEntity;
import com.icet.crm.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity,Integer> {

    List<PatientEntity> findByName(String name);
    List<PatientEntity> findByAddress(String address);
    List<PatientEntity> findByContact(String contact);

    List<PatientEntity> findBybloodGroup(String bloodGroup);
}
