/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe_game;
import javax.swing.*;

/**
 *
 * @author asus
 */


public class Main {
    public static void main(String[] args) {

        try {

            TicTacToe_GUI ticTacToeGUI = new TicTacToe_GUI();
            ticTacToeGUI.setTitle("Tic-Tac-Toe-Created_by_SENGRA");
            ticTacToeGUI.setSize(500, 500);
            ticTacToeGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ticTacToeGUI.setVisible(true);

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
