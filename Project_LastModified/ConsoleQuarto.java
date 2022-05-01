package gameproject.gameproject;

import java.net.Socket;
import java.util.Queue;
import java.util.Scanner;

public class ConsoleQuarto {
    private Quarto game;


    public void play() {
        this.game = new Quarto();
        System.out.println("QUARTO");
        System.out.println("Welcome to the game. \n");
        System.out.println("RULES \n");
        System.out.println("Players take turns choosing a piece which the other player must then place on the board. " +
                "A player wins by placing a piece on the board which forms a horizontal, vertical, or diagonal row of four pieces, all of which have a common attribute (all short, all circular, etc.). ");
        System.out.println();

    }



    public static void main(String[] args) {
        ConsoleQuarto game = new ConsoleQuarto();
//        game.play();
        Position p = new Position(0,0);

    }



}
