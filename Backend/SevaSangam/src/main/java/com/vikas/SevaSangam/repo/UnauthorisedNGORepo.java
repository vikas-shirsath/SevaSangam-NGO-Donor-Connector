package com.vikas.SevaSangam.repo;

import com.vikas.SevaSangam.model.NGOUnauthorised;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnauthorisedNGORepo extends JpaRepository<NGOUnauthorised, Integer> {

}
