package com.example.hospital.service;

import com.example.hospital.model.Medication;
import com.example.hospital.repositories.MedicationRepository;
import com.example.hospital.services.MedicationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class MedicationServiceTest {
    @ExtendWith(MockitoExtension.class)
    @InjectMocks
    private MedicationService medicationService;
    @Mock
    private MedicationRepository medicationRepository;
    @Test
    void testFindAllMedication() {
        Medication medicine1 = new Medication(1L, "Paracetamol", "Analgésico y antipirético", "500mg");
        Medication medicine2 = new Medication(2L, "Ibuprofeno", "Anti-inflamatorio", "200mg");
        List<Medication> mockMedication = List.of(medicine1, medicine2);

        when(medicationService.findAll()).thenReturn(mockMedication);

        List<Medication> result = medicationService.findAll();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Paracetamol", result.get(0).getName());
    }

    @Test
    void testFindMedicationByName() {
        Medication mockMedicine = new Medication(4L, "Paracetamol", "Analgésico y antipirético", "500mg");

        when(medicationService.findByName("Paracetamol")).thenReturn(List.of(mockMedicine));

        List<Medication> result = medicationService.findByName("Paracetamol");
        assertNotNull(result);
        assertEquals("Paracetamol", result.get(0).getName());
    }

}
