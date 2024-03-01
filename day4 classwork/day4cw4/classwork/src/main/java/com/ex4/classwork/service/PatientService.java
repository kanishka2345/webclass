package com.ex4.classwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex4.classwork.model.Patient;
import com.ex4.classwork.repository.PatientRepo;

@Service
public class PatientService {

    private final PatientRepo patientRepo;

    @Autowired
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