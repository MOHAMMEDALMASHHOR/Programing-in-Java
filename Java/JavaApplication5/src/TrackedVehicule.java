/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class TrackedVehicule extends LandVehiculeWithEngine {
    public String horsepower_2;

    public TrackedVehicule(String horsepower_2, String horsepower, String frame_material, String manufacturer) {
        super(horsepower, frame_material, manufacturer);
        this.horsepower_2 = horsepower_2;
    }

    @Override
    public String toString() {
        return super.toString() + ", armour thickness is " + horsepower_2;
    }
}