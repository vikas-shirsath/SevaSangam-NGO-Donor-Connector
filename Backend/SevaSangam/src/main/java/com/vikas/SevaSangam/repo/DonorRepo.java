package com.vikas.SevaSangam.repo;

import com.vikas.SevaSangam.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepo extends JpaRepository<Donor, Integer> {
}
