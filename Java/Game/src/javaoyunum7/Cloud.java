package javaoyunum7;

public class Cloud extends Source {

    public Cloud(int x, int y) {
        super(x, y);
        initCloud();
    }

    public void initCloud() {
        loadImage("C:/Users/Lenovo/Documents/NetBeansProjects/Game/src/cloud.png");
        getImageDimensions();
    }

    public void move() {

        if (y < -10) {
            x = (int) (Math.random() * 750);
            y = (int) (Math.random() * 850);
        }

        y -= 1;

        if (y > 2000) {
            visible = false;
        }
    }

}
