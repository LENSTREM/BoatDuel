package view;

import engine.MainEngine;
import entitys.GameBackground;
import entitys.PlayerBoat;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private PlayerBoat playerBoat;
    private GameBackground background;
    private MainEngine engine;

    public GamePanel() {


        this.playerBoat = new PlayerBoat();
        this.background = new GameBackground();
        this.engine = new MainEngine();

        this.engine.setPlayerBoat(this.playerBoat);
        this.engine.setGamePanel(this);
        setFocusable(true);
    }


    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(background.getBackgroundImg(), -400, 0, null);
        graphics.drawImage(playerBoat.getPlayerBoatImg(), 435, 285, null);
    }

    public PlayerBoat getPlayerBoat() {
        return playerBoat;
    }


}
