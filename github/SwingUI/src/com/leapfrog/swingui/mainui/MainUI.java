/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swingui.mainui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anonymous
 */
public class MainUI extends JFrame {

    private JTextField txtfileName;
    private JButton btnOpenFIle;
    private Container container;
    private JTextArea txtNotepad;

    public MainUI() {
        setTitle("Main UI");
        setSize(500, 400);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        container = getContentPane();
        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        txtfileName = new JTextField(30);
        btnOpenFIle = new JButton("Open me!");
        btnOpenFIle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(txtfileName.getText()));
                    
                    
                    
//     JOptionPane.showMessageDialog(null, fileName.getText(),"Alert Title", JOptionPane.QUESTION_MESSAGE);
                } catch (IOException ioe) {
                    JOptionPane.showMessageDialog(null, ioe.getMessage());
                }
            }
        });
        txtNotepad = new JTextArea(5, 30);
        container.add(txtfileName);
        container.add(btnOpenFIle);
        container.add(txtNotepad);

    }
}
