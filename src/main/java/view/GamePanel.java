package view;

import engine.MainEngine;
import entitys.GameBackground;
import entitys.PlayerBoat;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private PlayerBoat playerBoat;
    private GameBackground background1;
    private GameBackground background2;
    private MainEngine engine;

    public GamePanel() {


        this.playerBoat = new PlayerBoat();
        this.background1 = new GameBackground();
        this.background2 = new GameBackground();
        this.engine = new MainEngine();

        this.engine.setPlayerBoat(this.playerBoat);
        this.engine.setGamePanel(this);
        setFocusable(true);
    }


    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(background1.getBackgroundImg(), playerBoat.getDxGameBackround1(), playerBoat.getDyGameBackround1(), null);
        graphics.drawImage(background2.getBackgroundImg(), playerBoat.getDxGameBackround2(), playerBoat.getDyGameBackround2(), null);





        graphics.drawImage(playerBoat.getPlayerBoatImg(), 435, 385, null);
    }

    public PlayerBoat getPlayerBoat() {
        return playerBoat;
    }


}
