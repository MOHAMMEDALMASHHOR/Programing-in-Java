/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class LandVehiculeWithoutEngine extends LandVehicule {
    public String power_source;

    public LandVehiculeWithoutEngine(String power_source, String frame_material, String manufacturer) {
        super(frame_material, manufacturer);
        this.power_source = power_source;
    }

    
    public String toString() {
        return super.toString() + ", power source is " + power_source;
    }
}