/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class SpaceVehicule extends Vehicule {
    public String rocketFuelType;

    public SpaceVehicule(String rocketFuelType, String manufacturer) {
        super(manufacturer);
        this.rocketFuelType = rocketFuelType;
    }

    public String toString() {
        return super.toString() + ", fuel type is " + rocketFuelType;
    }
}
