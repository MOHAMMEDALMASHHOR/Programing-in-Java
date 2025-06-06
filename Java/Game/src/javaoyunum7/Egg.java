package javaoyunum7;

import java.awt.event.KeyEvent;

public class Egg extends Chicken {

    private final int BOARD_WIDTH = 900;
    private final int EGG_SPEED = 4;

    public Egg(int x, int y) {
        super(x, y);
        initEgg();
    }

    private void initEgg() {
        loadImage("C:/Users/Lenovo/Documents/NetBeansProjects/Game/src/altinYumurta.png");
        getImageDimensions();
    }

    public void move() {

        if (x > BOARD_WIDTH || x < 0) {
            visible = false;
        }
        
        if (x < 410) {
            x -= EGG_SPEED;
        } else {
            x += EGG_SPEED;
        }
        
        
        /*
        if (Chicken.dir == 4) {
            x -= EGG_SPEED;
        } else if (Chicken.dir == 6) {
            x += EGG_SPEED;
        }
        */
    }

}
