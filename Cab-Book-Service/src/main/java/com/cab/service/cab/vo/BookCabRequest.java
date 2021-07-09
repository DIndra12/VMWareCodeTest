package com.cab.service.cab.vo;

import com.cab.service.cab.entitiy.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookCabRequest {

    private User user;
    private String cabChoice;
    private long userXCoordinate;
    private long userYCoordinate;

}
