package entitys;


import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class GameBackground extends Image {
    private Image backgroundImg;

    public GameBackground() {
        this.backgroundImg = new ImageIcon("src/resources/images/background.png").getImage();
    }

    @Override
    public int getWidth(ImageObserver observer) {
        return 0;
    }

    @Override
    public int getHeight(ImageObserver observer) {
        return 0;
    }

    @Override
    public ImageProducer getSource() {
        return null;
    }

    @Override
    public Graphics getGraphics() {
        return null;
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        return null;
    }

    public Image getBackgroundImg() {
        return backgroundImg;
    }
}
