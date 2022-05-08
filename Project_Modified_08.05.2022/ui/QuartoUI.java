package ui;

import game.Position;
import game.Quarto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuartoUI extends JFrame implements ActionListener {
    private static final int WIDTH = 350;
    private static final int HEIGHT = 580;

    private class CellButton extends JButton implements ActionListener  {
        private int i;
        private int j;
        CellButton(int i, int j) {
            this.i = i;
            this.j = j;
            setIcon(new ImageIcon());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print("I" + i + " ");
            System.out.println("J" + j);


//            Position p = new Position(position.getRow(),position.getColumn());
//            game.addFigureToBoard(p,figures.returnRemovedFigure(chosenPiece-1));
        }
    }


    public QuartoUI() {
        super("QUARTO");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
//        panel.setSize(30,30);
        panel.setLayout(new GridLayout(Quarto.BOARD_ROWS,Quarto.BOARD_COLUMNS));

        for (int i = 0; i < Quarto.BOARD_ROWS;i++){
            for (int j = 0; j< Quarto.BOARD_COLUMNS;j++){
                CellButton button =  new CellButton(i, j);
                button.setActionCommand("Command" + i + j);
                button.setBackground(Color.GRAY);
                button.addActionListener(button);
                panel.add(button);
            }
        }
        add(panel,BorderLayout.CENTER);
        JPanel figurePanel = new JPanel();
        figurePanel.setLayout(new GridLayout(Quarto.BOARD_ROWS,Quarto.BOARD_COLUMNS));
 //       figurePanel.setSize(8,8);
            for (int j = 0; j< Quarto.BOARD_COLUMNS*Quarto.BOARD_ROWS;j++){
                JButton button =  new JButton();
                button.setBackground(Color.WHITE);
                button.addActionListener(this);
                if (j==0) {
                    // test.txt - same dir
                    // test/file.txt - test is in the same directory as this file, has file.txt in it
                    // ui\\pictures\\1.png
//                    button.setIcon(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\OOP_GroupProject\\src\\ui\\pictures\\.jpg"));
                    button.setIcon(new ImageIcon("src\\ui\\pictures\\1.png"));
                }
                if (j==1){
                    button.setIcon(new ImageIcon("src/ui/pictures/2.png"));
                }
                if (j==2){
                    button.setIcon(new ImageIcon("src/ui/pictures/3.png"));
                }
                if (j==3){
                    button.setIcon(new ImageIcon("src/ui/pictures/4.png"));
                }
                if (j==4){
                    button.setIcon(new ImageIcon("src/ui/pictures/5.png"));
                }
                if (j==5){
                    button.setIcon(new ImageIcon("src/ui/pictures/6.png"));
                }
                if (j==6){
                    button.setIcon(new ImageIcon("src/ui/pictures/7.png"));
                }
                if (j==7){
                    button.setIcon(new ImageIcon("src/ui/pictures/8.png"));
                }
                if (j==8){
                    button.setIcon(new ImageIcon("src/ui/pictures/9.png"));
                }
                if (j==9){
                    button.setIcon(new ImageIcon("src/ui/pictures/10.png"));
                }
                if (j==10){
                    button.setIcon(new ImageIcon("src/ui/pictures/11.png"));
                }
                if (j==11){
                    button.setIcon(new ImageIcon("src/ui/pictures/12.png"));
                }
                if (j==12){
                    button.setIcon(new ImageIcon("src/ui/pictures/13.png"));
                }
                if (j==13){
                    button.setIcon(new ImageIcon("src/ui/pictures/14.png"));
                }
                if (j==14){
                    button.setIcon(new ImageIcon("src/ui/pictures/15.png"));
                }
                if (j==15){
                    button.setIcon(new ImageIcon("src/ui/pictures/16.png"));
                }
                figurePanel.add(button);
            }
        add(figurePanel,BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        System.out.println(e.getActionCommand());
        JButton button = (JButton) e.getSource();
        button.getIcon();


    }
}
