package com.vikas.SevaSangam.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "donation")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donation_id")
    private int donationId;

    @ManyToOne
    @JoinColumn(name = "requirement_id", nullable = false)
    private NGORequirement requirement;

    @ManyToOne
    @JoinColumn(name = "donor_id", nullable = false)
    private Donor donor;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "donation_status", nullable = false)
    private DonationStatus donationStatus;

    @Column(name = "donation_raised_time", nullable = false)
    private LocalDateTime donationRaisedTime;

    @Column(name = "donation_completion_time", nullable = true)
    private LocalDateTime donationCompletionTime;
}
