package com.vikas.SevaSangam.controller;


import com.vikas.SevaSangam.model.Donor;
import com.vikas.SevaSangam.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/donor")
public class DonorController {

    @Autowired
    DonorService donorService;

    @PostMapping("/add")
    public ResponseEntity<String> addDonor(Donor donor) {
        return donorService.addDonor(donor);
    }




}
