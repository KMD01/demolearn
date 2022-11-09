package games.ticTacToe;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TicTacToe implements ActionListener {

    boolean turn = true;
    int step = 0;
    int player1Win = 0;
    int player2Win = 0;

    JFrame jFrame;
    JLabel jLabel1, jLabel2;
    JPanel jPanel1, jPanel2, jPanelGrid;
    Container container;
    JButton[] jButtons;
    JMenuBar jMenuBar;
    JMenuItem jMenuFile;
    JMenuItem jMenuOptions;
    JMenuItem mNewGame, mExit, mAbout, mWinColor, mBackgroundColor, mRestColors;
    Font myFont = new Font("Ink free", Font.BOLD, 30);
    JColorChooser jColorChooser;
    Color winColor = new Color(255, 215, 0);
    Color backgroundColor = new Color(189, 183, 107);

    public int countPlayer1Wins() {
        return player1Win;
    }

    ;

    public int countPlayer2Wins() {
        return player2Win;
    }

    ;

    public void refreshScore() {
        String label1 = "PLAYER 'X': " + String.valueOf(countPlayer1Wins());
        String label2 = "PLAYER 'O': " + String.valueOf(countPlayer2Wins());
        jLabel1.setText(label1);
        jLabel2.setText(label2);
    }

    public void play() {

        jMenuBar = new JMenuBar();

        jMenuFile = new JMenu("File");
        jMenuBar.add(jMenuFile);
        jMenuFile.setVisible(true);

        jMenuOptions = new JMenu("Options");
        jMenuBar.add(jMenuOptions);
        jMenuOptions.setVisible(true);

        mNewGame = new JMenuItem(" New game ");
        jMenuFile.add(mNewGame);
        mNewGame.addActionListener(this);

        mWinColor = new JMenuItem("Win color");
        jMenuOptions.add(mWinColor);
        mWinColor.addActionListener(this);

        mBackgroundColor = new JMenuItem("Background color");
        jMenuOptions.add(mBackgroundColor);
        mBackgroundColor.addActionListener(this);

        mRestColors = new JMenuItem("Reset colors");
        jMenuOptions.add(mRestColors);
        mRestColors.addActionListener(this);

        mAbout = new JMenuItem(" About ");
        jMenuFile.add(mAbout);
        mAbout.addActionListener(this);

        mExit = new JMenuItem(" Exit ");
        jMenuFile.add(mExit);
        mExit.addActionListener(this);

        jLabel1 = new JLabel();
        String label1 = "PLAYER 'X': " + String.valueOf(countPlayer1Wins());
        jLabel1.setText(label1);
        jLabel1.setFont(new Font("Verdana", Font.BOLD, 20));

        jLabel2 = new JLabel("PLAYER 'O': " + String.valueOf(countPlayer2Wins()));
        jLabel2.setFont(new Font("Verdana", Font.BOLD, 20));

        jPanel1 = new JPanel();
        jPanel1.setBounds(0, 0, 450, 50);
        jPanel1.setBackground(new Color(238, 232, 170));
        jPanel1.add(jLabel1);

        jPanel2 = new JPanel();
        jPanel2.setBounds(0, 50, 450, 50);
        jPanel2.setBackground(new Color(240, 230, 140));
        jPanel2.add(jLabel2);

        jPanelGrid = new JPanel();
        jPanelGrid.setBounds(0, 100, 450, 450);
        jPanelGrid.setLayout(new GridLayout(3, 3, 0, 0));
        jPanelGrid.setBackground(Color.GRAY);

        container = new Container();
        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanelGrid);

        jButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            jButtons[i] = new JButton("");
            jButtons[i].setBackground(backgroundColor);
            jPanelGrid.add(jButtons[i]);
            jButtons[i].addActionListener(this);
            jButtons[i].setFont(myFont);
            jButtons[i].setFocusable(false);
        }

        jFrame = new JFrame();
        jFrame.setLocation(450, 450);
        jFrame.setTitle("Tic Tac Toe");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(container);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setSize(450, 610);
        //jFrame.setLayout(new FlowLayout());
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    private void newGame() {
        for (int i = 0; i < 9; i++) {
            step = 0;
            jButtons[i].setText("");
            jButtons[i].setBackground(backgroundColor);
            jButtons[i].setEnabled(true);
        }
    }

    private void refreshBackgroundColor() {
        for (int i = 0; i < 9; i++) {
            step = 0;
            jButtons[i].setBackground(backgroundColor);
        }
    }

    private void about() {
        JOptionPane.showMessageDialog(null, "Author: Krzysztof Dyk \nVersion: 1.0 \n\nSee you soon! ");
    }

    private void exit() {
        System.exit(0);
        jFrame.dispose();
        jFrame.setVisible(false);
    }

    private Color winColorOption() {
        jColorChooser = new JColorChooser();
        return winColor = JColorChooser.showDialog(null, "Pic a win color", Color.green);
    }

    ;

    private Color backgroundColorOption() {
        jColorChooser = new JColorChooser();
        backgroundColor = JColorChooser.showDialog(null, "Pic a background color", Color.green);
        refreshBackgroundColor();
        return backgroundColor;
    }

    ;

    private void resetColors() {
        backgroundColor = new Color(189, 183, 107);
        winColor = new Color(255, 215, 0);
        refreshBackgroundColor();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mNewGame) {
            newGame();
        }

        if (e.getSource() == mWinColor) {
            winColorOption();
        }

        if (e.getSource() == mBackgroundColor) {
            backgroundColorOption();
        }

        if (e.getSource() == mRestColors) {
            resetColors();
        }

        if (e.getSource() == mAbout) {
            about();
        }
        if (e.getSource() == mExit) {
            exit();
        }
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == jButtons[i] && Objects.equals(jButtons[i].getText(), "")) {
                if (turn) {
                    jButtons[i].setText("X");
                    turn = false;
                    step++;
                } else {
                    jButtons[i].setText("O");
                    turn = true;
                    step++;
                }
                check_X(winColor);
                check_O(winColor);
                colorGray();
            }
        }
    }

    private void colorGray() {
        if (step == 9) {
            for (int j = 0; j < 9; j++) {
                jButtons[j].setBackground(Color.GRAY);
            }
        }
    }

    private void check_X(Color color) {
        int[] row1 = {0, 1, 2};
        if (jButtons[row1[0]].getText() == "X" && jButtons[row1[1]].getText() == "X" && jButtons[row1[2]].getText() == "X") {
            jButtons[row1[0]].setBackground(color);
            jButtons[row1[1]].setBackground(color);
            jButtons[row1[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] row2 = {3, 4, 5};
        if (jButtons[row2[0]].getText() == "X" && jButtons[row2[1]].getText() == "X" && jButtons[row2[2]].getText() == "X") {
            jButtons[row2[0]].setBackground(color);
            jButtons[row2[1]].setBackground(color);
            jButtons[row2[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] row3 = {6, 7, 8};
        if (jButtons[row3[0]].getText() == "X" && jButtons[row3[1]].getText() == "X" && jButtons[row3[2]].getText() == "X") {
            jButtons[row3[0]].setBackground(color);
            jButtons[row3[1]].setBackground(color);
            jButtons[row3[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] column1 = {0, 3, 6};
        if (jButtons[column1[0]].getText() == "X" && jButtons[column1[1]].getText() == "X" && jButtons[column1[2]].getText() == "X") {
            jButtons[column1[0]].setBackground(color);
            jButtons[column1[1]].setBackground(color);
            jButtons[column1[2]].setBackground(color);
            ;
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] column2 = {1, 4, 7};
        if (jButtons[column2[0]].getText() == "X" && jButtons[column2[1]].getText() == "X" && jButtons[column2[2]].getText() == "X") {
            jButtons[column2[0]].setBackground(color);
            jButtons[column2[1]].setBackground(color);
            jButtons[column2[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] column3 = {2, 5, 8};
        if (jButtons[column3[0]].getText() == "X" && jButtons[column3[1]].getText() == "X" && jButtons[column3[2]].getText() == "X") {
            jButtons[column3[0]].setBackground(color);
            jButtons[column3[1]].setBackground(color);
            jButtons[column3[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] diagonal1 = {0, 4, 8};
        if (jButtons[diagonal1[0]].getText() == "X" && jButtons[diagonal1[1]].getText() == "X" && jButtons[diagonal1[2]].getText() == "X") {
            jButtons[diagonal1[0]].setBackground(color);
            jButtons[diagonal1[1]].setBackground(color);
            jButtons[diagonal1[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
        int[] diagonal2 = {2, 4, 6};
        if (jButtons[diagonal2[0]].getText() == "X" && jButtons[diagonal2[1]].getText() == "X" && jButtons[diagonal2[2]].getText() == "X") {
            jButtons[diagonal2[0]].setBackground(color);
            jButtons[diagonal2[1]].setBackground(color);
            jButtons[diagonal2[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player1Win++;
            refreshScore();
        }
    }

    private void check_O(Color color) {
        int[] row1 = {0, 1, 2};
        if (jButtons[row1[0]].getText() == "O" && jButtons[row1[1]].getText() == "O" && jButtons[row1[2]].getText() == "O") {
            jButtons[row1[0]].setBackground(color);
            jButtons[row1[1]].setBackground(color);
            jButtons[row1[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] row2 = {3, 4, 5};
        if (jButtons[row2[0]].getText() == "O" && jButtons[row2[1]].getText() == "O" && jButtons[row2[2]].getText() == "O") {
            jButtons[row2[0]].setBackground(color);
            jButtons[row2[1]].setBackground(color);
            jButtons[row2[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] row3 = {6, 7, 8};
        if (jButtons[row3[0]].getText() == "O" && jButtons[row3[1]].getText() == "O" && jButtons[row3[2]].getText() == "O") {
            jButtons[row3[0]].setBackground(color);
            jButtons[row3[1]].setBackground(color);
            jButtons[row3[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] column1 = {0, 3, 6};
        if (jButtons[column1[0]].getText() == "O" && jButtons[column1[1]].getText() == "O" && jButtons[column1[2]].getText() == "O") {
            jButtons[column1[0]].setBackground(color);
            jButtons[column1[1]].setBackground(color);
            jButtons[column1[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] column2 = {1, 4, 7};
        if (jButtons[column2[0]].getText() == "O" && jButtons[column2[1]].getText() == "O" && jButtons[column2[2]].getText() == "O") {
            jButtons[column2[0]].setBackground(color);
            jButtons[column2[1]].setBackground(color);
            jButtons[column2[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] column3 = {2, 5, 8};
        if (jButtons[column3[0]].getText() == "O" && jButtons[column3[1]].getText() == "O" && jButtons[column3[2]].getText() == "O") {
            jButtons[column3[0]].setBackground(color);
            jButtons[column3[1]].setBackground(color);
            jButtons[column3[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] diagonal1 = {0, 4, 8};
        if (jButtons[diagonal1[0]].getText() == "O" && jButtons[diagonal1[1]].getText() == "O" && jButtons[diagonal1[2]].getText() == "O") {
            jButtons[diagonal1[0]].setBackground(color);
            jButtons[diagonal1[1]].setBackground(color);
            jButtons[diagonal1[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
        int[] diagonal2 = {2, 4, 6};
        if (jButtons[diagonal2[0]].getText() == "O" && jButtons[diagonal2[1]].getText() == "O" && jButtons[diagonal2[2]].getText() == "O") {
            jButtons[diagonal2[0]].setBackground(color);
            jButtons[diagonal2[1]].setBackground(color);
            jButtons[diagonal2[2]].setBackground(color);
            for (int i = 0; i < 9; i++) {
                jButtons[i].setEnabled(false);
            }
            player2Win++;
            refreshScore();
        }
    }
}
