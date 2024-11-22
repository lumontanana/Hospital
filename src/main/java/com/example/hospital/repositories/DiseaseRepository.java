package com.example.hospital.repositories;

import com.example.hospital.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Long> {
    List<Disease> findDiseaseByName(String name);
}
