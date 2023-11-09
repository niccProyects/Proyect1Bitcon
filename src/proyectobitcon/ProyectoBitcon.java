/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class ProyectoBitcon {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Bingo board = new Bingo();
            board.setVisible(true);
        });
    }
    

}
