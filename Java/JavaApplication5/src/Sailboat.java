/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Sailboat extends LandVehiculeWithoutEngine {
    public String sail_surface;

    public Sailboat(String sail_surface, String power_source, String frame_material, String manufacturer) {
        super(power_source, frame_material, manufacturer);
        this.sail_surface = sail_surface;
    }


    public String toString() {
        return super.toString() + ", sail surface is " + sail_surface;
    }
}