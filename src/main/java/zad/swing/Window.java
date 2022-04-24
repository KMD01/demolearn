package zad.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window {

    JLabel outsideLabel = new JLabel();


    public void Game(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Game");
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setLocation(100,100);
        frame.getContentPane().setBackground(Color.GRAY);

        //ImageIcon image = new ImageIcon("logo.png");
        //frame.setIconImage(image.getImage());

        JButton button1 = new JButton("START");
        button1.setBounds(50,50,100,100);
        JButton button2 = new JButton("STOP");
        JButton button3 = new JButton("RESET");

        frame.add(button1);
        //frame.add(button2);
        //frame.add(button3);

        frame.setLayout(new FlowLayout());

        JLabel jLabel = new JLabel();
        ImageIcon image = new ImageIcon("logo.png");
        frame.add(jLabel);
        Border border = BorderFactory.createLineBorder(Color.green,3);
        //jLabel.setOpaque(true);
        jLabel.setBorder(border);
        jLabel.setText("Bro, do You even code");
        jLabel.setIcon(image);
        jLabel.setVerticalTextPosition(JLabel.TOP);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        button1.addActionListener(this::Move);

        outsideLabel.setText("helooooo");
        outsideLabel.setLocation(200,200);
        frame.add(outsideLabel);

    };


    public void Move(ActionEvent actionEvent){
        outsideLabel.setVisible(true);
    }
}
