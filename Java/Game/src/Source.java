
package javaoyunum7;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Source {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;
    
    public Source(int x,int y){
        this.x=x;
        this.y=y;
        visible=true;
    }
    
    public void loadImage(String imageName){
        ImageIcon ii=new ImageIcon(imageName);
        image=ii.getImage();;
    };
    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }   
    
    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
