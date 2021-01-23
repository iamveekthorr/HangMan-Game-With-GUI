package com.company;

import javax.swing.*;
import java.awt.*;

public class Index extends JFrame {
    public Index(String title){
        super(title);
    }


    public void setup(){
        setSize(600, 300 );
        setResizable(false);
        this.addControls();
    }

    private void addControls() {
        JLabel label = new JLabel();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();


        label.setText("Welcome to hangman Game");

        /** The "this" keyword here represents the current extended
         *  Class JFrame
         *  @params object - LayoutManager
         **/
        this.setLayout(new GridBagLayout());

        /** Next Set is to set constrain on the
         * layout saying how to manage it
         **/
        GridBagConstraints constraints = new GridBagConstraints();

        // Welcome label
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weighty = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(label, constraints);

        // Button 1
        button1.setText("Play Game");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(button1, constraints);


        // Button 2
        button2.setText("Read Instructions");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(button2, constraints);

        // Button 3
        button3.setText("Quit Game");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(button3, constraints);
    }
}
