package entitys;

import controller.BoatController;

import javax.swing.*;
import java.awt.*;

public class BoundaryBuoy  {
	private Image boundaryBuoyImg;
	private PlayerBoat playerBoat;

	private int position_x;
	private int position_y = 0;


	private int yVelocity ;
	private int xVelocity ;

	private int currentSpead;

	public BoundaryBuoy(PlayerBoat playerBoat) {
		this.playerBoat = playerBoat;
/*		this.xVelocity = playerBoat.getxVelocity();
		this.yVelocity = playerBoat.getyVelocity();*/
		this.boundaryBuoyImg = new ImageIcon("src/resources/images/BoundaryBuoy.png").getImage();
	}

	public void move(){
		int boatDirection = BoatController.getInstance().getBoatDirection();

		xVelocity = playerBoat.getxVelocity();
		yVelocity = playerBoat.getyVelocity();

		if(boatDirection >=0) position_x +=  xVelocity;
		else  position_x -=  playerBoat.getxVelocity();

		if(position_y > 700) position_y = 0;
		else position_y +=  yVelocity;

	}

	public Image getBoundaryBuoyImg() {
		return boundaryBuoyImg;
	}

	public int getPosition_y() {
		return position_y;
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}
}
