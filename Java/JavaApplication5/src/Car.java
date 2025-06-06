/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Car extends WheeledVehicule {
    public String registration_number;

    public Car(String registration_number, String wheel_number, String horsepower, String frame_material, String manufacturer) {
        super(wheel_number, horsepower, frame_material, manufacturer);
        this.registration_number = registration_number;
    }

    
    public String toString() {
        return super.toString() + ", registration number is " + registration_number;
    }
}