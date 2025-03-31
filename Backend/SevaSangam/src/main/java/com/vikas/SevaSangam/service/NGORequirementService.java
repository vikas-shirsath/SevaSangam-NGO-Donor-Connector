package com.vikas.SevaSangam.service;

import com.vikas.SevaSangam.model.NGORequirement;
import com.vikas.SevaSangam.repo.NGORequirementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service  // Marking it as a service component
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
}
