/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoyunum7;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Spawn extends JFrame {

    public Spawn() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setSize(900, 700);
        setResizable(false);

        setTitle("Flying Chicken");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Spawn ex = new Spawn();
            ex.setVisible(true);
        });
    }
}
