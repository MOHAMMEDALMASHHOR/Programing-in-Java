/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Rocket extends SpaceVehicule {
    public String thrust;

    public Rocket(String thrust, String rocketFuelType, String manufacturer) {
        super(rocketFuelType, manufacturer);
        this.thrust = thrust;
    }

    public String toString() {
        return super.toString() + ", thrust is " + thrust;
    }
}

