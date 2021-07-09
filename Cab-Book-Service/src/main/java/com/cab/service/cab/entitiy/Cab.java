package com.cab.service.cab.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cab {

    private Long cabId;
    private String cabStatus;
    private String cabVariety;
    private long xCord;
    private long yCord;
}
