package com.vikas.SevaSangam.repo;


import com.vikas.SevaSangam.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepo extends JpaRepository<Donation, Integer> {
}
