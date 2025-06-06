/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoyunum7;

public class Background extends Source {

    public Background(int x, int y) {
        super(x, y);
        initBackground();
    }

    public void initBackground() {
        loadImage("C:/Users/Lenovo/Documents/NetBeansProjects/Game/src/bg.png");
        getImageDimensions();
    }

}
