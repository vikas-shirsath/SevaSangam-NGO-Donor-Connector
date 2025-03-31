package com.vikas.SevaSangam.repo;

import com.vikas.SevaSangam.model.NGORequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface NGORequirementRepo extends JpaRepository<NGORequirement, Integer> {

}
