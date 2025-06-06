/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Vehicule {
    public String manufacturer;

    public Vehicule(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "Vehicule produced by " + manufacturer;
    }
}
