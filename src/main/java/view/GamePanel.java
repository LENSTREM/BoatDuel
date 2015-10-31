package view;

import engine.MainEngine;
import entitys.BoundaryBuoy;
import entitys.GameBackground;
import entitys.PlayerBoat;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    final static int X_ABSOLUTE_BOAT_POSITION = 435;
    final static int Y_ABSOLUTE_BOAT_POSITION = 385;

    private PlayerBoat playerBoat;
    private GameBackground background1;
    private GameBackground background2;
    private MainEngine engine;
	private BoundaryBuoy boundaryBuoys[];


    public GamePanel() {


        this.playerBoat = new PlayerBoat();
        this.background1 = new GameBackground();
        this.background2 = new GameBackground();
        this.engine = new MainEngine();

        this.engine.setPlayerBoat(this.playerBoat);
        this.engine.setGamePanel(this);
        setFocusable(true);

	    boundaryBuoys = engine.getBoundaryBuoy();
    }


    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(background1.getBackgroundImg(), playerBoat.getDxGameBackround1(), playerBoat.getDyGameBackround1(), null);
        graphics.drawImage(background2.getBackgroundImg(), playerBoat.getDxGameBackround2(), playerBoat.getDyGameBackround2(), null);
		    for(int i=0;i<boundaryBuoys.length;i++){
			    graphics.drawImage(boundaryBuoys[i].getBoundaryBuoyImg(),boundaryBuoys[i].getPosition_x(),boundaryBuoys[i].getPosition_y(),null);
			    graphics.drawImage(boundaryBuoys[i].getBoundaryBuoyImg(),boundaryBuoys[i].getPosition_x()+960,boundaryBuoys[i].getPosition_y(),null);
		    }


        graphics.drawImage(playerBoat.getPlayerBoatImg(), X_ABSOLUTE_BOAT_POSITION, Y_ABSOLUTE_BOAT_POSITION, null);
    }

    public PlayerBoat getPlayerBoat() {
        return playerBoat;
    }

    public static int getxAbsoluteBoatPosition() {
        return X_ABSOLUTE_BOAT_POSITION;
    }
}
