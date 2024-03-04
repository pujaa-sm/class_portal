package day4cw3.day4cw3.service;

import java.util.List;


import org.springframework.stereotype.Service;

import day4cw3.day4cw3.model.Patient;
import day4cw3.day4cw3.repository.PatientRepo;

@Service
public class PatientService {

    private final PatientRepo patientRepo;

    
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient createPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Patient getPatientById(int patientId) {
        return patientRepo.findById(patientId).orElse(null);
    }
}