package com.cab.service.cab.repository;

import com.cab.service.cab.entitiy.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CabRepository extends JpaRepository<Cab, Long> {

    @Query("Select c from Cab c where c.cabVariety like %:cabVariety%")
    List<Cab> findByVariety(String variety);

}
