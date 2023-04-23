package games.castorama;

import javax.swing.*;
import java.awt.*;

public class Castorama extends JFrame {

 /*   public Osb(){
    setTitle("Square");
    setSize(400,400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }*/


    public void play() {
        createWindow();

    }

    public void createWindow() {
        JFrame frame;
        JMenuBar menuBar;
        JMenuItem itemFile, itemSave;
        JMenuItem itemOptions;
        JLabel labelTitle;
        JPanel panelTitle, panelDrawing;
        Container container;

        // set the frame
        frame = new JFrame();
        //frame.setLocation(450, 450);
        frame.setTitle("Castorama");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setVisible(true);
        LayoutManager layoutManager = new GridLayout();
        frame.setLayout(layoutManager);

        labelTitle = new JLabel();
        labelTitle.setText("Welcome to castorama");
        labelTitle.setFont(new Font("Verdana", Font.BOLD, 20));
        panelTitle = new JPanel();
        panelTitle.setBackground(Color.RED);
        panelTitle.add(labelTitle);
        frame.add(panelTitle);

        panelDrawing = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D graphics2D = (Graphics2D) g;
                graphics2D.drawRect(100, 100, 200, 100);
                graphics2D.setBackground(Color.YELLOW);
                graphics2D.setBackground(Color.green);
            }

        };
        panelDrawing.setBackground(Color.BLUE);
        frame.add(panelDrawing);


    }


}
