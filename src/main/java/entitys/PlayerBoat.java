package entitys;

import javax.swing.*;
import java.awt.*;

public class PlayerBoat {
    private Image playerBoatImg;
    private int position_x;
    private int position_y;



    public PlayerBoat() {
        this.setBoatN();
    }


    public void setBoatW(){
        playerBoatImg = new ImageIcon("src/resources/images/boatW.png").getImage();
    }

    public void setBoatNW(){
        playerBoatImg = new ImageIcon("src/resources/images/boatNW.png").getImage();
    }
    public void setBoatN(){
        playerBoatImg = new ImageIcon("src/resources/images/boatN.png").getImage();
    }
    public void setBoatNE(){
        playerBoatImg = new ImageIcon("src/resources/images/boatNE.png").getImage();
    }

    public void setBoatE(){
        playerBoatImg = new ImageIcon("src/resources/images/boatE.png").getImage();
    }

    public Image getPlayerBoatImg() {
        return playerBoatImg;
    }

    public void setPlayerBoatImg(Image playerBoatImg) {
        this.playerBoatImg = playerBoatImg;
    }

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

}
