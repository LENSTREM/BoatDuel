package controller;

import entitys.PlayerBoat;

import java.awt.event.KeyEvent;

public class BoatController {
    private static BoatController Instance = new BoatController();



    private PlayerBoat playerBoat;
    private int boatDirection = 0; // North / west / east..

    

    private BoatController() {

    }

    public void pressed(KeyEvent e){
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT){
                if (boatDirection <2){
                    boatDirection++;
                    chooseImg();
                }

            }if(key == KeyEvent.VK_RIGHT){
                if (boatDirection >-2){
                    boatDirection--;
                    chooseImg();
                }
            }
        }


    private void chooseImg() {
        if(boatDirection == 0){
            playerBoat.setBoatN();
        }if(boatDirection == 1){
            playerBoat.setBoatNW();
        }if(boatDirection == 2){
            playerBoat.setBoatW();
        }if(boatDirection == -1){
            playerBoat.setBoatNE();
        }if(boatDirection == -2){
            playerBoat.setBoatE();
        }

    }


    public void setPlayerBoat(PlayerBoat playerBoat) {
        this.playerBoat = playerBoat;
    }

    public static BoatController getInstance() {
        return Instance;
    }

    public int getBoatDirection() {
        return boatDirection;
    }
}
