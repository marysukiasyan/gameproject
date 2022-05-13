package ui;

/**
 * This class is responsible for creating panel where the two players can register and start a game;
 * @author Hripsime Melikyan
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Players extends JFrame implements ActionListener {
    /**
     * A constant variable for the width of panel.
     */
    private static final int WIDTH = 300;
    /**
     * A constant variable for the height of panel.
     */
    private static final int HEIGHT = 150;
    /**
     * A constant variable for maximum length of Player's name.
     */
    private static final int NUMBER_OF_CHAR = 30;

    /**
     * A static variable for first players name.
     */
    public static JTextField player1;
    /**
     * A static variable for second players name.
     */
    public static JTextField player2;

    /**
     * A no-arg constructor that initializes panel and buttons for players to register and start playing.
     */

    public Players( )
    {
        super("Player Registration Panel");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JPanel namePanel = new JPanel( );
        namePanel.setLayout(new BorderLayout( ));
        namePanel.setBackground(Color.WHITE);

        player1 = new JTextField(NUMBER_OF_CHAR);
        player2 = new JTextField(NUMBER_OF_CHAR);

        namePanel.add(player1,BorderLayout.NORTH);
        namePanel.add(player2,BorderLayout.SOUTH);
        JLabel nameLabel = new JLabel("");
        namePanel.add(nameLabel, BorderLayout.CENTER);
        add(namePanel);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setLayout(new FlowLayout( ));
        buttonPanel.setBackground(Color.GRAY);
        JButton actionButton = new JButton("Start");
        actionButton.addActionListener(this);
        buttonPanel.add(actionButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel);
    }

    /**
     * A method that starts a game if players ready or clear names if they want to make changes.
     * @param e
     */

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );

        if (actionCommand.equals("Start")) {
            QuartoUI ui = new QuartoUI();
            ui.setVisible(true);
        }
        else if (actionCommand.equals("Clear")) {
            player1.setText("");
            player2.setText("");
        }
        else {
            player1.setText("Unexpected error.");
            player2.setText("Unexpected error.");
        }
    }




}
