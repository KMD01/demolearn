package swing;

import javax.swing.*;
import java.awt.*;

public class Creator extends JFrame{


    public void crateFrameLayoutNull() {
        JFrame frame = new JFrame();
        frame.setTitle("Layout: null");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setVisible(true);
        //panel1.setSize(50,50);
        panel1.setBounds(0,0,200,200);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        panel2.setVisible(true);
        //panel2.setSize(150,150);
        panel2.setBounds(200,0,200,200);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setVisible(true);
        //panel3.setSize(250,250);
        panel3.setBounds(0,200,200,200);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.MAGENTA);
        panel4.setVisible(true);
        //panel4.setSize(350,350);
        panel4.setBounds(200,200,200,200);

        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

    }

    public void crateFrameLayoutGrid() {

        JFrame frame = new JFrame();
        frame.setTitle("Layout: grid");
        frame.setSize(550,550);
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setVisible(true);
        panel1.setSize(50,50);
        panel1.add(new JButton("asdasdasd"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        panel2.setVisible(true);
        panel2.setSize(150,150);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setVisible(true);
        panel3.setSize(250,250);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.MAGENTA);
        panel4.setVisible(true);
        panel4.setSize(350,350);

        LayoutManager layoutManager = new GridLayout(2,2);
        frame.setLayout(layoutManager);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
    }

    public void crateFrameLayoutFlow() {

        JFrame frame = new JFrame();
        frame.setTitle("Layout: flow");
        frame.setSize(550,550);
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setVisible(true);
        panel1.setSize(50,50);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        panel2.setVisible(true);
        panel2.setSize(150,150);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setVisible(true);
        panel3.setSize(250,250);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.MAGENTA);
        panel4.setVisible(true);
        panel4.setSize(350,350);

        LayoutManager layoutManager = new FlowLayout(FlowLayout.RIGHT);
        frame.setLayout(layoutManager);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

    }

    public void crateFrameLayoutBoarder() {

        JFrame frame = new JFrame();
        frame.setTitle("Layout: flow");
        frame.setSize(550,550);
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);
        panel1.setVisible(true);
        panel1.setPreferredSize(new Dimension(100,100));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        panel2.setVisible(true);
        panel2.setPreferredSize(new Dimension(100,100));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setVisible(true);
        panel3.setPreferredSize(new Dimension(100,100));

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.MAGENTA);
        panel4.setVisible(true);
        panel4.setPreferredSize(new Dimension(100,100));


        LayoutManager layoutManager = new BorderLayout();
        frame.setLayout(layoutManager);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);

    }






}
