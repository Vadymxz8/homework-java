package com.vadim.tkach.lesson18;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Vehicle {
    private double fuelLevel;
    private double consumPer100km;
    private LocalDate nextInspection;


public  Vehicle (double fuelLevel, double consumPer100km, LocalDate nextInspection){
    this.fuelLevel = fuelLevel;
    this.consumPer100km = consumPer100km;
    this.nextInspection = nextInspection;
}

public boolean canDrive(){

    return fuelLevel > 0;
}
public boolean isAllowedToOperate(){
    LocalDate today = LocalDate.now();
    return !today.isAfter(nextInspection);
}
public double getMaxDistance(){
    if(consumPer100km<=0){
        return 0;
    }
    return (fuelLevel/consumPer100km)*100;
}
}