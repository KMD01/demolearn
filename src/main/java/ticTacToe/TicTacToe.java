package ticTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TicTacToe implements ActionListener {

    JFrame jFrame;
    JPanel jPanel;
    JButton[] jButtons;
    JMenuBar jMenuBar;
    JMenuItem jMenuFile;
    JMenuItem mNewGame, mExit;

    Font myFont = new Font("Ink free", Font.BOLD, 30);

    TicTacToe() {

        jMenuBar = new JMenuBar();
        jMenuFile = new JMenu("File");
        jMenuBar.add(jMenuFile);
        jMenuFile.setVisible(true);

        mNewGame = new JMenuItem(" New game ");
        mExit = new JMenuItem(" Exit ");

        jMenuFile.add(mNewGame);
        jMenuFile.add(mExit);

        mNewGame.addActionListener(this);
        mExit.addActionListener(this);




        jPanel = new JPanel();
        jPanel.setBounds(0, 0, 300, 300);
        jPanel.setLayout(new GridLayout(3, 3, 1, 1));
        jPanel.setBackground(Color.lightGray);



        jButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            jButtons[i] = new JButton("");
            jButtons[i].setBackground(Color.YELLOW);
            jPanel.add(jButtons[i]);
            jButtons[i].addActionListener(this);
            jButtons[i].setFont(myFont);
            jButtons[i].setFocusable(false);
        }

        jFrame = new JFrame();
        jFrame.setTitle("Tic Tac Toe");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(jPanel);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setSize(400, 400);
        jFrame.setLayout(new GridLayout());
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }


    private void newGame(){

        for (int i = 0; i < 9; i++) {
            jButtons[i].setText("");
            jButtons[i].setBackground(Color.yellow);
            jButtons[i].setEnabled(true);
        }


    }

    private void exit(){
        System.exit(0);
        jFrame.dispose();
        jFrame.setVisible(false);
    }






    boolean turn = true;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==mNewGame){
            newGame();
        }

        if (e.getSource()==mExit){
            exit();
        }

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == jButtons[i] && Objects.equals(jButtons[i].getText(), "")) {
                if (turn) {
                    jButtons[i].setText("X");
                    turn = false;
                    check_X();
                    check_O();

                } else {
                    jButtons[i].setText("O");
                    turn = true;
                    check_X();
                    check_O();
                }

            }
        }
    }

    private void check_X() {
        int[] row1 = {0, 1, 2};
        if (jButtons[row1[0]].getText() == "X" && jButtons[row1[1]].getText() == "X" && jButtons[row1[2]].getText() == "X") {
            jButtons[row1[0]].setBackground(Color.green);
            jButtons[row1[1]].setBackground(Color.green);
            jButtons[row1[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] row2 = {3, 4, 5};
        if (jButtons[row2[0]].getText() == "X" && jButtons[row2[1]].getText() == "X" && jButtons[row2[2]].getText() == "X") {
            jButtons[row2[0]].setBackground(Color.green);
            jButtons[row2[1]].setBackground(Color.green);
            jButtons[row2[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] row3 = {6, 7, 8};
        if (jButtons[row3[0]].getText() == "X" && jButtons[row3[1]].getText() == "X" && jButtons[row3[2]].getText() == "X") {
            jButtons[row3[0]].setBackground(Color.green);
            jButtons[row3[1]].setBackground(Color.green);
            jButtons[row3[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] column1 = {0, 3, 6};
        if (jButtons[column1[0]].getText() == "X" && jButtons[column1[1]].getText() == "X" && jButtons[column1[2]].getText() == "X") {
            jButtons[column1[0]].setBackground(Color.green);
            jButtons[column1[1]].setBackground(Color.green);
            jButtons[column1[2]].setBackground(Color.green);;
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] column2 = {1, 4, 8};
        if (jButtons[column2[0]].getText() == "X" && jButtons[column2[1]].getText() == "X" && jButtons[column2[2]].getText() == "X") {
            jButtons[column2[0]].setBackground(Color.green);
            jButtons[column2[1]].setBackground(Color.green);
            jButtons[column2[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] column3 = {2, 5, 8};
        if (jButtons[column3[0]].getText() == "X" && jButtons[column3[1]].getText() == "X" && jButtons[column3[2]].getText() == "X") {
            jButtons[column3[0]].setBackground(Color.green);
            jButtons[column3[1]].setBackground(Color.green);
            jButtons[column3[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] diagonal1 = {0, 4, 8};
        if (jButtons[diagonal1[0]].getText() == "X" && jButtons[diagonal1[1]].getText() == "X" && jButtons[diagonal1[2]].getText() == "X") {
            jButtons[diagonal1[0]].setBackground(Color.green);
            jButtons[diagonal1[1]].setBackground(Color.green);
            jButtons[diagonal1[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] diagonal2 = {2, 4, 6};
        if (jButtons[diagonal2[0]].getText() == "X" && jButtons[diagonal2[1]].getText() == "X" && jButtons[diagonal2[2]].getText() == "X") {
            jButtons[diagonal2[0]].setBackground(Color.green);
            jButtons[diagonal2[1]].setBackground(Color.green);
            jButtons[diagonal2[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }        
    }
    private void check_O() {
        int[] row1 = {0, 1, 2};
        if (jButtons[row1[0]].getText() == "O" && jButtons[row1[1]].getText() == "O" && jButtons[row1[2]].getText() == "O") {
            jButtons[row1[0]].setBackground(Color.green);
            jButtons[row1[1]].setBackground(Color.green);
            jButtons[row1[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] row2 = {3, 4, 5};
        if (jButtons[row2[0]].getText() == "O" && jButtons[row2[1]].getText() == "O" && jButtons[row2[2]].getText() == "O") {
            jButtons[row2[0]].setBackground(Color.green);
            jButtons[row2[1]].setBackground(Color.green);
            jButtons[row2[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] row3 = {6, 7, 8};
        if (jButtons[row3[0]].getText() == "O" && jButtons[row3[1]].getText() == "O" && jButtons[row3[2]].getText() == "O") {
            jButtons[row3[0]].setBackground(Color.green);
            jButtons[row3[1]].setBackground(Color.green);
            jButtons[row3[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] column1 = {0, 3, 6};
        if (jButtons[column1[0]].getText() == "O" && jButtons[column1[1]].getText() == "O" && jButtons[column1[2]].getText() == "O") {
            jButtons[column1[0]].setBackground(Color.green);
            jButtons[column1[1]].setBackground(Color.green);
            jButtons[column1[2]].setBackground(Color.green);;
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] column2 = {1, 4, 8};
        if (jButtons[column2[0]].getText() == "O" && jButtons[column2[1]].getText() == "O" && jButtons[column2[2]].getText() == "O") {
            jButtons[column2[0]].setBackground(Color.green);
            jButtons[column2[1]].setBackground(Color.green);
            jButtons[column2[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] column3 = {2, 5, 8};
        if (jButtons[column3[0]].getText() == "O" && jButtons[column3[1]].getText() == "O" && jButtons[column3[2]].getText() == "O") {
            jButtons[column3[0]].setBackground(Color.green);
            jButtons[column3[1]].setBackground(Color.green);
            jButtons[column3[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] diagonal1 = {0, 4, 8};
        if (jButtons[diagonal1[0]].getText() == "O" && jButtons[diagonal1[1]].getText() == "O" && jButtons[diagonal1[2]].getText() == "O") {
            jButtons[diagonal1[0]].setBackground(Color.green);
            jButtons[diagonal1[1]].setBackground(Color.green);
            jButtons[diagonal1[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
        int[] diagonal2 = {2, 4, 6};
        if (jButtons[diagonal2[0]].getText() == "O" && jButtons[diagonal2[1]].getText() == "O" && jButtons[diagonal2[2]].getText() == "O") {
            jButtons[diagonal2[0]].setBackground(Color.green);
            jButtons[diagonal2[1]].setBackground(Color.green);
            jButtons[diagonal2[2]].setBackground(Color.green);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
        }
    }
    
    
    
}
