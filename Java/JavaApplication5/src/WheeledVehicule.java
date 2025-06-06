/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class WheeledVehicule extends LandVehiculeWithEngine {
    public String wheel_number;

    public WheeledVehicule(String wheel_number, String horsepower, String frame_material, String manufacturer) {
        super(horsepower, frame_material, manufacturer);
        this.wheel_number = wheel_number;
    }

    @Override
    public String toString() {
        return super.toString() + ", wheel number is " + wheel_number;
    }
}