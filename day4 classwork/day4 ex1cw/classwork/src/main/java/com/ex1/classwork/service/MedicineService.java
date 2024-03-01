package com.ex1.classwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex1.classwork.model.Medicine;
import com.ex1.classwork.repository.MedicineRepo;

@Service
public class MedicineService {
    private final MedicineRepo medicineRepository;
    @Autowired
    
    public MedicineService(MedicineRepo medicineRepository) {
        this.medicineRepository = medicineRepository;
    }    
    public Medicine createMedicine(Medicine medicine){
        return medicineRepository.save(medicine);
    }
    public List<Medicine> getAllMedicines(){
        return medicineRepository.findAll();
    }
    public Medicine getMedicineById(int medicineId){
        return medicineRepository.findById(medicineId).orElse(null);
    }
}