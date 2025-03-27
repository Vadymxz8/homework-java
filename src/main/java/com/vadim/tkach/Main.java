package com.vadim.tkach;
import com.vadim.tkach.lesson18.Vehicle;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(10.0, 8.0, LocalDate.of(2025, 12, 31));

        System.out.println("Може їхати: " + car.canDrive());
        System.out.println("Допустима до експлуатації: " + car.isAllowedToOperate());
        System.out.println("Максимальна відстань: " + car.getMaxDistance() + " км");
    }
}