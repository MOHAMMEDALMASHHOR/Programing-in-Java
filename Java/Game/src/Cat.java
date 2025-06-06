package javaoyunum7;

public class Cat extends Source {

    private final int INITIAL_Y = 2000;

    public Cat(int x, int y) {
        super(x, y);
        initCat();
    }

    private void initCat() {
        loadImage("C:/Users/Lenovo/Documents/NetBeansProjects/Game/src/yawn.png");
        getImageDimensions();
    }

    public void move() {

        if (y < -10) {
            x = (int) (Math.random() * 650) + 80;
            y = (int) (Math.random() * 850) + (Chicken.dy + 300);
        }

        y -= 1;

        if (y > INITIAL_Y) {
            visible = false;
        }
    }

}
