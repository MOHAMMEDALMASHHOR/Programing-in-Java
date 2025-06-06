/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Tank extends TrackedVehicule {
    public String armour_thickness;
    public Tank(String armour_thickness, String horsepower_2, String horsepower, String frame_material, String manufacturer) {
        super(horsepower_2, horsepower, frame_material, manufacturer);
        this.armour_thickness=armour_thickness;
    }

    @Override
    public String toString() {
        return super.toString() +"With aromur thickness: " + armour_thickness;
    }
}

