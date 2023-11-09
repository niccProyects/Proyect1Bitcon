/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobitcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nicol
 */
public class Bingo extends JFrame {

    private JPanel boardPanel;
    private JButton[][] bingoNumbers;

    public Bingo() {
        setTitle("Bingo Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Initialize the board panel with a 5x5 grid layout
        boardPanel = new JPanel(new GridLayout(6, 6));
        bingoNumbers = new JButton[6][6];

        // Create buttons for each cell on the board
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                bingoNumbers[i][j] = new JButton();
                bingoNumbers[i][j].setText(" ");
                boardPanel.add(bingoNumbers[i][j]);
            }
        }

        // Add the board panel to the frame
        add(boardPanel);

        // Add action listeners to the buttons
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoNumbers[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        // Handle button click event
                        // You can mark the number as called or perform other actions here
                    }
                });
            }
        }
    }
}
