package com.cab.service.cab.service;

import com.cab.service.cab.entitiy.Cab;
import com.cab.service.cab.vo.BookCabRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private CabService cabService;
    public String book(BookCabRequest bookCabRequest) {

        List<Cab> cabs = cabService.findByCabVariety(bookCabRequest.getCabChoice());


        return "Success";
    }
}
