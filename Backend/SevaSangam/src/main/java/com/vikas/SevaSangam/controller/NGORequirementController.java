package com.vikas.SevaSangam.controller;

import com.vikas.SevaSangam.model.NGORequirement;
import com.vikas.SevaSangam.service.NGORequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ngorequirement")
public class NGORequirementController {

    @Autowired
    NGORequirementService ngoRequirementService;

    @PostMapping("/add")
    public ResponseEntity<String> addNGORequirement(NGORequirement ngoRequirement) {
        return ngoRequirementService.addNGORequirement(ngoRequirement);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAllNGORequirements() {
        return ngoRequirementService.getAllNGORequirements();
    }

}
