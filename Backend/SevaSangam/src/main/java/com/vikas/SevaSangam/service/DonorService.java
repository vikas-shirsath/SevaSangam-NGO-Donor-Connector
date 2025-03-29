package com.vikas.SevaSangam.service;


import com.vikas.SevaSangam.model.Donor;
import com.vikas.SevaSangam.repo.DonorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DonorService {

    @Autowired
    DonorRepo donorRepo;

    public ResponseEntity<String> addDonor(Donor donor) {

        try{
            donorRepo.save(donor);
            return new ResponseEntity<>("Donor added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>("Donor didn't get added.", HttpStatus.BAD_REQUEST);
    }
}
