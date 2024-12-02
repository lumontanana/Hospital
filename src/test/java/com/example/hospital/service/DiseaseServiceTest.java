package com.example.hospital.service;

import com.example.hospital.model.Disease;
import com.example.hospital.repositories.DiseaseRepository;
import com.example.hospital.services.DiseaseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class DiseaseServiceTest {
    @ExtendWith(MockitoExtension.class)
    @InjectMocks
    private DiseaseService diseaseService;
    @Mock
    private DiseaseRepository diseaseRepository;
    @Test
    void testFindAllDisease() {
        Disease disease1 = new Disease(1L, "Gripe", "Infección viral que afecta el sistema respiratorio.");
        Disease disease2 = new Disease(2L, "Migraña", "Dolor de cabeza intenso acompañado de náuseas.");
        List<Disease> mockDisease = List.of(disease1, disease2);

        when(diseaseService.findAll()).thenReturn(mockDisease);

        List<Disease> result = diseaseService.findAll();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Migraña", result.get(1).getName());
    }

    @Test
    void testFindDiseaseByName() {
        Disease mockDisease = new Disease(2L, "Migraña", "Dolor de cabeza intenso acompañado de náuseas.");

        when(diseaseService.findByName("Migraña")).thenReturn(List.of(mockDisease));

        List<Disease> result = diseaseService.findByName("Migraña");
        assertNotNull(result);
        assertEquals("Migraña", result.get(0).getName());
    }

}
