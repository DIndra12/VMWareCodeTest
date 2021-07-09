package com.cab.service.cab.service;

import com.cab.service.cab.entitiy.Cab;
import com.cab.service.cab.repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabService {

    @Autowired
    private CabRepository cabRepository;

    public Cab addCab(Cab cab) {
       return cabRepository.save(cab);
    }

    public List<Cab> findByCabVariety(String variety) {
        return cabRepository.findByVariety(variety);
    }



}
