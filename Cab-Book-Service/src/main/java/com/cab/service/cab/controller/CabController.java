package com.cab.service.cab.controller;

import com.cab.service.cab.entitiy.Cab;
import com.cab.service.cab.entitiy.Driver;
import com.cab.service.cab.entitiy.User;
import com.cab.service.cab.service.BookService;
import com.cab.service.cab.service.CabService;
import com.cab.service.cab.service.DriverService;
import com.cab.service.cab.service.UserService;
import com.cab.service.cab.vo.BookCabRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CabController {

    @Autowired
    private DriverService driverService;
    @Autowired
    private UserService userService;
    @Autowired
    private CabService cabService;
    @Autowired
    private BookService bookService;

    @PostMapping("driver/register")
    public Driver saveDriver(@RequestBody Driver driver) {
        return driverService.saveDriver(driver);
    }

    @PostMapping("user/register")
    public User saveDriver(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("cab/add")
    public Cab addCab(@RequestBody Cab cab) {
        return cabService.addCab(cab);
    }
    @PostMapping("/bookcab")
    public String bookCab(@RequestBody BookCabRequest bookCab) {

        return bookService.book(bookCab);
    }

}
