package com.example.hospital.repositories;

import com.example.hospital.model.Inform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformRepository extends JpaRepository<Inform, Long> {
    List<Inform> findInformByName(String name);
}
