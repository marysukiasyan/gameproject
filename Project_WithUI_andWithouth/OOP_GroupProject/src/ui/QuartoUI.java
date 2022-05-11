package ui;

/**
 * This class is responsible for creating UI for the game, and keeping the ongoing game status.
 * @author Hripsime Melikyan
 */

import game.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class QuartoUI extends JFrame implements ActionListener {
    /**
     * A constant variable for the width of panel.
     */
    private static final int WIDTH = 350;
    /**
     * A constant variable for the height of panel.
     */
    private static final int HEIGHT = 580;
    /**
     * An integer that keeps the turn of players.
     */
    private int turn;
    /**
     * A string to keep the photo of the figures.
     */
    private String img;
    /**
     * A game of Quarto type to check winner.
     */
    private Quarto game;
    /**
     * Figure that will be used to append to the board.
     */
    private Figure figure;
    /**
     * An array of available figures;
     */
    private Figure[] figures;
    /**
     * A label to keep the name of player whose turn to play on screen.
     */
    private JLabel label;
    /**
     * A button used to append or remove a figure to the board.
     */
    private JButton buttonForFigure;

    /**
     * The inner class created to be used for creating the array of buttons for figures.
     */

    private class ListButton extends JButton implements ActionListener {
        /**
         * Keeps the index of the place where the user clicked.
         */
        private int l;

        /**
         * A constructor.
         * @param l
         */

        ListButton(int l) {
            this.l = l;
            addActionListener(this);
        }

        /**
         * A method that chooses a figure that clicked.
         * @param e
         */

        public void actionPerformed(ActionEvent e) {
            System.out.println("J" + l);
            figure = figures[l];
        }
    }

    /**
     * The inner class created to be used for creating the board from buttons.
     */

    private class CellButton extends JButton implements ActionListener {
        /**
         * The index of the rows of board.
         */
        private int i;
        /**
         * The index of the columns of board.
         */
        private int j;

        /**
         * A constructor.
         * @param i
         * @param j
         */

        CellButton(int i, int j) {
            this.i = i;
            this.j = j;
            //  setIcon(new ImageIcon());
            //  JButton jb = new JButton();
            addActionListener(this);

        }

        /**
         * A method that ads figure to the board and helps to keep the turn of the player.
         * @param e
         */

        public void actionPerformed(ActionEvent e) {
            System.out.print("I" + i + " ");
            System.out.println("J" + j);
           label.setText(getTurn());
            if (game.getBoard()[i][j] == null) {
                game.addFigureToBoard(new Position(i, j), figure);
                setIcon(new ImageIcon(String.valueOf(img)));
                figure = null;
                img = null;
            }
            buttonForFigure.setIcon(null);
            buttonForFigure.setBackground(Color.LIGHT_GRAY);

            System.out.println(Arrays.deepToString(game.getBoard()));
            end();
        }


    }

    /**
     * A no-arg constructor that visually initializes the figures, the board and the list of the figures.
     */

    public QuartoUI() {
        super("QUARTO");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.game = new Quarto(String.valueOf(Players.player1), String.valueOf(Players.player2));
        this.figures = new Figure[16];
        figures[0] = new ShortCircular(Quarto.FigureColor.BLUE, true);
        figures[1] = new ShortCircular(Quarto.FigureColor.BLUE, false);
        figures[2] = new ShortCircular(Quarto.FigureColor.RED, true);
        figures[3] = new ShortCircular(Quarto.FigureColor.RED, false);
        figures[4] = new ShortSquare(Quarto.FigureColor.BLUE, true);
        figures[5] = new ShortSquare(Quarto.FigureColor.BLUE, false);
        figures[6] = new ShortSquare(Quarto.FigureColor.RED, true);
        figures[7] = new ShortSquare(Quarto.FigureColor.RED, false);
        figures[8] = new TallCircular(Quarto.FigureColor.BLUE, true);
        figures[9] = new TallCircular(Quarto.FigureColor.BLUE, false);
        figures[10] = new TallCircular(Quarto.FigureColor.RED, true);
        figures[11] = new TallCircular(Quarto.FigureColor.RED, false);
        figures[12] = new TallSquare(Quarto.FigureColor.BLUE, true);
        figures[13] = new TallSquare(Quarto.FigureColor.BLUE, false);
        figures[14] = new TallSquare(Quarto.FigureColor.RED, true);
        figures[15] = new TallSquare(Quarto.FigureColor.RED, false);

        JPanel pan = new JPanel();
        pan.setName("Players");
        pan.setSize(100, 100);
        pan.setLayout(new FlowLayout());
        this.label = new JLabel(getTurn());
        pan.add(label);
        add(pan, BorderLayout.NORTH);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(Quarto.BOARD_ROWS, Quarto.BOARD_COLUMNS));

        for (int i = 0; i < Quarto.BOARD_ROWS; i++) {
            for (int j = 0; j < Quarto.BOARD_COLUMNS; j++) {
                CellButton button = new CellButton(i, j);
                //    button.setActionCommand("Command" + i + j);
                button.setBackground(Color.GRAY);
                //       button.addActionListener(button);
                panel.add(button);
            }
        }
        add(panel, BorderLayout.CENTER);
        JPanel figurePanel = new JPanel();
        figurePanel.setLayout(new GridLayout(Quarto.BOARD_ROWS, Quarto.BOARD_COLUMNS));
        for (int j = 0; j < Quarto.BOARD_COLUMNS * Quarto.BOARD_ROWS; j++) {
            ListButton button = new ListButton(j);
            button.setBackground(Color.WHITE);
            button.addActionListener(this);
            button.setIcon(new ImageIcon("src\\ui\\pictures\\" + j + ".png"));
            figurePanel.add(button);
        }
        add(figurePanel, BorderLayout.SOUTH);


    }

    /**
     * A method that gets the value of image and helps to keep the turn of the players, also exits if after the winning move
     * someone tries to continue playing.
     * @param e
     */


    public void actionPerformed(ActionEvent e) {
        this.buttonForFigure = (JButton) e.getSource();
        this.img = String.valueOf(buttonForFigure.getIcon());
        this.turn++;
     //   button.setIcon(null);
        label.setText(getTurnToPass());
        buttonForFigure.setBackground(Color.GREEN);
        if (game.isGameOver()){
            System.exit(0);
        }

    }

    /**
     * Print the name of winner.
     */
    public void end() {
        if (game.isGameOver()) {
            System.out.println(getWinner());
            label.setText(getWinner());
        //    System.exit(0);

        }
    }

    /**
     * Gets the name of player whose turn to choose a figure for the opposite player.
     * @return
     */

    public String getTurn() {
        if (turn % 2 == 0) {
            return Players.player1.getText() + " chose figure for " + Players.player2.getText();
        } else {

            return Players.player2.getText() + " chose figure for " + Players.player1.getText();
        }
    }

    /**
     * Gets the name of the winner.
     * @return
     */

    public String getWinner() {
        if (turn % 2 == 0) {
            return "Congratulations " +  Players.player1.getText() +" you won!!!";
        } else {

            return "Congratulations " + Players.player2.getText() + " you won!!!";
        }
    }

    /**
     * Gets name of the player whose turn to add a figure to the board.
     * @return
     */

    public String getTurnToPass() {
        if (turn % 2 == 0) {
            return Players.player1.getText() + " your turn to pass ";
        } else {

            return Players.player2.getText() + " your turn to pass ";
        }
    }

}