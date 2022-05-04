package gameproject.gameproject;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleQuarto {
    private Quarto game;


    public void play() {
        this.game = new Quarto();
        System.out.println("QUARTO");
        System.out.println("Welcome to the game. \n");
        System.out.println("RULES \n");
        System.out.println("Players take turns choosing a piece which the other player must then place on the board. \n" +
                "A player wins by placing a piece on the board which forms a horizontal, vertical, or diagonal row of four pieces,\n all of which have a common attribute (all short, all circular, etc.). ");
        System.out.println();
        Scanner input = new Scanner(System.in);
        AvailableFigures figures = new AvailableFigures();
        Quarto board = new Quarto();
        System.out.println(figures);
        //System.out.println(Arrays.DeepToString(board.getBoard()));
        while (!game.isGameOver()){
            for (int i = 0; i  < 4; i++){
                for (int j = 0; j < 4; j++){
                    if (game.getBoard()[i][j] == null)
                        System.out.print("( )" + " ");
                    else
                        System.out.println(game.getBoard()[i][j] + " " );
                }
                System.out.println();
            }

            if (game.getTurn().equals(Quarto.PLAYER1)){
                System.out.println("Player 1's turn ");
            }
            else {
                System.out.println("Player 2's turn ");
            }
            System.out.println("Choose figure for for your rival to pass ");
            int chosenPiece = input.nextInt();
            game.increaseTurn();
            System.out.println(game.getTurn());
            System.out.println("Choose the coordinates to  place the figure");
            int x = input.nextInt();
            int  y = input.nextInt();
            game.addFigureToBoard(x,y,figures.returnRemovedFigure(chosenPiece));
            System.out.println(Arrays.deepToString(game.getBoard()));
        }

    }



    public static void main(String[] args) {
        ConsoleQuarto game = new ConsoleQuarto();
        game.play();
        Position p = new Position(0,0);

    }

    public static void print(){
            }

}
