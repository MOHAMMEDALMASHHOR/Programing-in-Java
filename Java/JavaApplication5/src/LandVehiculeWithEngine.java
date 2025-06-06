/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class LandVehiculeWithEngine extends LandVehicule {
    public String horsepower;

    public LandVehiculeWithEngine(String horsepower, String frame_material, String manufacturer) {
        super(frame_material, manufacturer);
        this.horsepower = horsepower;
    }

    
    public String toString() {
        return super.toString() + ", horsepower is " + horsepower;
    }
}