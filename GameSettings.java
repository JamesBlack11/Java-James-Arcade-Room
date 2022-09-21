package com.company;
import javax.swing.JFrame;

public class GameSettings extends JFrame{

    GameSettings() {


        this.add(new GameConsole());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
