package entitys;

import javax.swing.*;
import java.awt.*;

public class PlayerBoat {

    private static final int MAX_VELOCITY = 100;
    private static final int MAX_LEFT_COORDINATE = 100;
    private static final int MAX_RIGHT_COORDINATE = 900;

    private Image playerBoatImg;

    private int position_x;
    private int position_y;
    private int yVelocity = 10; // velocity of boat, default is 0
    private int acceleration = 0; // acceleration of boat
    private int distance = 0; // distance of boat

    private int dyGameBackround1=0;
    private int dyGameBackround2=-700;

    private int dx = 0;
    private int dy = 0;


    public void move(){
        yVelocity +=acceleration;
        distance += yVelocity;

        dy += distance;

        if (dyGameBackround2 + yVelocity < 0) {
            dyGameBackround1 += yVelocity;
            dyGameBackround2 += yVelocity;
        } else {
            dyGameBackround1 = 0;
            dyGameBackround2 = -700;
        }



    }

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

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDyGameBackround1() {
        return dyGameBackround1;
    }

    public int getDyGameBackround2() {
        return dyGameBackround2;
    }
}
