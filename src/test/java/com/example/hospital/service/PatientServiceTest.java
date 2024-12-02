package com.example.hospital.service;

import com.example.hospital.model.Disease;
import com.example.hospital.model.Inform;
import com.example.hospital.model.Medication;
import com.example.hospital.model.Patient;
import com.example.hospital.repositories.InformRepository;
import com.example.hospital.repositories.PatientRepository;
import com.example.hospital.services.InformService;
import com.example.hospital.services.PatientService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class PatientServiceTest {
    @ExtendWith(MockitoExtension.class)
    @InjectMocks
    private PatientService patientService;
    @ExtendWith(MockitoExtension.class)
    @InjectMocks
    private InformService informService;
    @Mock
    private PatientRepository patientRepository;
    @Mock
    private InformRepository informRepository;

    @Test
    void testFindAllPatients() {
        Medication medication1 = new Medication(1L, "Paracetamol", "Analgésico y antipirético", "500mg");
        Medication medication2 = new Medication(2L, "Ibuprofeno", "Anti-inflamatorio", "200mg");

        Disease disease1 = new Disease(1L, "Gripe", "Infección viral que afecta el sistema respiratorio.");
        Disease disease2 = new Disease(2L, "Migraña", "Dolor de cabeza intenso acompañado de náuseas.");


        Inform inform1 = new Inform(1L, "Tratamiento para la gripe", "Paracetamol puede ayudar a reducir la fiebre y el malestar.", medication1, disease1);
        Inform inform2 = new Inform(2L, "Tratamiento para migraña", "El ibuprofeno alivia el dolor asociado a la migraña.", medication2, disease2);

        List<Patient> mockPatients = List.of(
                new Patient(1L, "Juan Pérez", 30, "M", "Calle Falsa 123, Ciudad XYZ", inform1),
                new Patient(2L, "Ana Gómez", 25, "F", "Av. Principal 456, Ciudad ABC", inform2),
                new Patient(3L, "Carlos Rodríguez", 45, "F", "Calle Mayor 789, Ciudad DEF", inform1),
                new Patient(4L, "Laura Martínez", 40, "M", "Calle Secundaria 101, Ciudad GHI", inform2),
                new Patient(5L, "José López", 50, "F", "Calle de la Luna 202, Ciudad JKL", inform1)
        );
        when(patientService.findAll()).thenReturn(mockPatients);
        List<Patient> patients = patientService.findAll();

        assertNotNull(patients);
        assertEquals(5, patients.size());
        assertEquals("Juan Pérez", patients.get(0).getName());
        assertEquals("Tratamiento para la gripe", patients.get(0).getInform().getName());

    }

}
