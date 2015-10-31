package entitys;

import controller.BoatController;

import javax.swing.*;
import java.awt.*;

public class PlayerBoat {

    private static final int MAX_VELOCITY = 100;
    private static final int MAX_LEFT_COORDINATE = 100;
    private static final int MAX_RIGHT_COORDINATE = 900;

    private Image playerBoatImg;


    private int yVelocity ;
    private int xVelocity ;
    private int acceleration = 0;
    private int distance = 0;

    private int dyGameBackround1=0;
    private int dyGameBackround2=-700;

    private int dxGameBackround1=-400;
    private int dxGameBackround2=-400;


    private int dx = 0;
    private int dy = 0;


    public void move() {
/*        yVelocity +=acceleration;
        distance += yVelocity;

        dy += distance;*/

	    int boatDirection = BoatController.getInstance().getBoatDirection(); // North / west / east of boat..

	    switch (boatDirection) {
		    case 0: {
			    yVelocity = 10;
			    xVelocity = 0;
			    if (dyGameBackround2 + yVelocity < 0) {
				    dyGameBackround1 += yVelocity;
				    dyGameBackround2 += yVelocity;
			    } else {
				    dyGameBackround1 = 0;
				    dyGameBackround2 = -700;
			    }
			    break;
		    }
		    case -1: {

			    yVelocity = 7;
			    xVelocity = 7;
			    if (dyGameBackround2 + yVelocity < 0 && dxGameBackround1 - xVelocity >= -800) {
				    dyGameBackround1 += yVelocity;
				    dyGameBackround2 += yVelocity;
				    dxGameBackround1 -= xVelocity;
				    dxGameBackround2 -= xVelocity;
			    } else {
				    dxGameBackround1 = -400;
				    dxGameBackround2 = -400;
				    dyGameBackround1 = 0;
				    dyGameBackround2 = -700;
			    }
			    break;
		    }

		    case -2: {

			    yVelocity = 0;
			    xVelocity = 10;
			    if (dxGameBackround1 - xVelocity >= -800) {
				    dxGameBackround1 -= xVelocity;
				    dxGameBackround2 -= xVelocity;
			    } else {
				    dxGameBackround1 = -400;
				    dxGameBackround2 = -400;
			    }
			    break;
		    }
		    case 1: {
			    yVelocity = 7;
			    xVelocity = 7;
			    if (dyGameBackround2 + yVelocity < 0 && dxGameBackround1 + xVelocity < 0) {
				    dyGameBackround1 += yVelocity;
				    dyGameBackround2 += yVelocity;
				    dxGameBackround1 += xVelocity;
				    dxGameBackround2 += xVelocity;
			    } else {
				    dxGameBackround1 = -400;
				    dxGameBackround2 = -400;
				    dyGameBackround1 = 0;
				    dyGameBackround2 = -700;
			    }


			    break;
		    }
		    case 2: {
			    yVelocity = 0;
			    xVelocity = 10;
			    if (dxGameBackround1 + xVelocity < 0) {
				    dxGameBackround1 += xVelocity;
				    dxGameBackround2 += xVelocity;
			    } else {
				    dxGameBackround1 = -400;
				    dxGameBackround2 = -400;

			    }


			break;}
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

    public int getDxGameBackround1() {
        return dxGameBackround1;
    }

    public int getDxGameBackround2() {
        return dxGameBackround2;
    }
}
