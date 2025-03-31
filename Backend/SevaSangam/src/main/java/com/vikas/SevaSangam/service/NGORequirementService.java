package com.vikas.SevaSangam.service;

import com.vikas.SevaSangam.model.NGORequirement;
import com.vikas.SevaSangam.repo.NGORequirementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NGORequirementService {

    private final NGORequirementRepo ngoRequirementRepo;

    @Autowired
    public NGORequirementService(NGORequirementRepo ngoRequirementRepo) {
        this.ngoRequirementRepo = ngoRequirementRepo;
    }

    public ResponseEntity<String> addNGORequirement(NGORequirement ngoRequirement) {
        try {
            ngoRequirementRepo.save(ngoRequirement);
            return new ResponseEntity<>("Requirement is added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Requirement didn't get added.", HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<?> getAllNGORequirements() {
        try {
            List<NGORequirement> requirements = ngoRequirementRepo.findAll();
            if (requirements.isEmpty()) {
                return new ResponseEntity<>("No requirements found", HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(requirements, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error fetching requirements", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
