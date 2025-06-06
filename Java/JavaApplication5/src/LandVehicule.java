/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class LandVehicule extends Vehicule {
    public String frame_material;

    public LandVehicule(String frame_material, String manufacturer) {
        super(manufacturer);
        this.frame_material = frame_material;
    }

    @Override
    public String toString() {
        return super.toString() + ", frame material is " + frame_material;
    }
}