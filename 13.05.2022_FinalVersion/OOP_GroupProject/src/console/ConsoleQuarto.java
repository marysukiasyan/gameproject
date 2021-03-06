package console;

import game.AvailableFigures;
import game.Position;
import game.Quarto;

import java.util.Scanner;

public class ConsoleQuarto {
    private Quarto game;


    public void play() {
        ConsoleQuarto.printInstructions();
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 input your name :");
        String player1Name = input.nextLine();
        System.out.println("Player 2 input your name :");
        String player2Name = input.nextLine();
        this.game = new Quarto(player1Name,player2Name);
        AvailableFigures figures = new AvailableFigures();
        while (!game.isGameOver()) {
            System.out.println("The Board");
            System.out.println();
            game.printBoard();

            System.out.println();
            System.out.println("Available figures \n");
            figures.printAvailableFigures();
            System.out.println();
            if (game.getTurn().equals(game.getPlayer1())) {
                System.out.println(game.getPlayer1() + "'s turn ");
            } else {
                System.out.println(game.getPlayer2() + "'s turn ");
            }
            System.out.println("Choose figure for for your rival to pass ");
            int chosenPiece = input.nextInt();
            game.increaseTurn();
            System.out.println(game.getTurn());
            System.out.println("Choose the coordinates to  place the figure");
            Position position = new Position();
            position.setRow(input.nextInt() - 1);
            position.setColumn(input.nextInt() - 1);

            while (game.getBoard()[position.getRow()][position.getColumn()] != null) {
                System.out.println("The place in board of your choose is not empty, chose another one: \n");

                position.setRow(input.nextInt() - 1);
                position.setColumn(input.nextInt() - 1);
            }

            Position p = new Position(position.getRow(), position.getColumn());
            game.addFigureToBoard(p, figures.returnRemovedFigure(chosenPiece - 1));
        }
        System.out.println("Congratulations " + game.getTurn() + " you won");
        game.printBoard();


    }

    private static void printInstructions(){
        System.out.println("QUARTO");
        System.out.println("Welcome to the game. \n");
        System.out.println("RULES \n");
        System.out.println("Players take turns choosing a piece which the other player must then place on the board. \n" +
                "A player wins by placing a piece on the board which forms a horizontal, vertical, or diagonal row of four pieces,\n all of which have a common attribute (all short, all circular, etc.). ");
        System.out.println();

    }

}
