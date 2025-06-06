package javaoyunum7;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Chicken extends Source {

    public static int dx;
    public static int dy;
    public static int dir;
    private List<Egg> eggs;

    public Chicken(int x, int y) {
        super(x, y);
        initChicken();
    }

    private void initChicken() {
        eggs = new ArrayList<>();
        loadImage("C:/Users/Lenovo/Documents/NetBeansProjects/Game/src/hen7.png");
        getImageDimensions();

    }

    public void move() {
        x += dx;
        y += dy;

        if (x < 200) {
            x = 200;
        }

        if (x > 630) {
            x = 630;
        }

        if (y < 1) {
            y = 1;
        }

        if (y >= 650) {
            y = 0;
        }
        y += 1;
    }

    public List<Egg> getEggs() {
        return eggs;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            dx = -1;
            dir = 4;
        }

        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            dx = 1;
            dir = 6;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            dy = -3;
            dir = 8;
        }

        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            dy = 2;
            dir = 2;
        }
    }

    public void fire() {
        eggs.add(new Egg(x + width / 7, y + height / 7));
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            dx = 0;       

        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            dy = 0;    
        }

        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            dy = 0;      
        }
    }

}
