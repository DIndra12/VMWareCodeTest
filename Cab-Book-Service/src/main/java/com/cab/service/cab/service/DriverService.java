package com.cab.service.cab.service;

import com.cab.service.cab.entitiy.Driver;
import com.cab.service.cab.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
