package com.vikas.SevaSangam.model;

import jakarta.persistence.*;
        import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ngo_unauthorised")
public class NGOUnauthorised {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ngo_id")
    private int ngoId;

    @Column(name = "ngo_gov_id", nullable = false, unique = true)
    private String ngoGovId;

    @Column(name = "ngo_user_name", nullable = false, unique = true)
    private String ngoUserName;

    @Column(name = "hashed_password", nullable = false)
    private String hashedPassword;

    @Column(name = "ngo_name", nullable = false)
    private String ngoName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String emailId;

    @Column(name = "phone_no", nullable = false, unique = true)
    private String phoneNo;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "map_url", nullable = false)
    private String mapUrl;

    @Column(name = "website_url", nullable = true)
    private String websiteUrl;

    @Column(name = "description", nullable = false)
    private String description;

    @Lob
    @Column(name = "logo", nullable = true)
    private byte[] logo;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name = "verify_status", nullable = false)
    private boolean verifyStatus;

}
