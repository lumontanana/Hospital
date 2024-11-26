package com.example.hospital.repositories;

import com.example.hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


    List<Patient> findPatientByAddress(String name);

    List<Patient> findByName(String name);
}
