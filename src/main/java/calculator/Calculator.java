package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame jFrame;
    JTextField jTextField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel jPanel;

    Font myFont = new Font("Ink free",Font.BOLD,30);
    double num1=0,num2=0,result=0;
    char operator;

    Calculator(){
        jFrame = new JFrame("Calculator 1.0");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(410,550);
        jFrame.setLayout(null);
        jTextField = new JTextField();
        jTextField.setBounds(50,25,300,50);
        jTextField.setFont(myFont);
        jTextField.setEditable(false);
        jTextField.setBackground(Color.white);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton("." );
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
        for (int i = 0; i < 9 ; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for (int i = 0; i < 10 ; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        negButton.setBounds(50,430,80,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(270,430,80,50);

        jPanel = new JPanel();
        jPanel.setBounds(50,100,300,300);
        jPanel.setLayout(new GridLayout(4,4,10,10));


        jPanel.add(numberButtons[1]);
        jPanel.add(numberButtons[2]);
        jPanel.add(numberButtons[3]);
        jPanel.add(addButton);

        jPanel.add(numberButtons[4]);
        jPanel.add(numberButtons[5]);
        jPanel.add(numberButtons[6]);
        jPanel.add(subButton);

        jPanel.add(numberButtons[7]);
        jPanel.add(numberButtons[8]);
        jPanel.add(numberButtons[9]);
        jPanel.add(mulButton);

        jPanel.add(decButton);
        jPanel.add(numberButtons[0]);
        jPanel.add(equButton);
        jPanel.add(divButton);

        jFrame.add(delButton);
        jFrame.add(clrButton);
        jFrame.add(negButton);
        jFrame.add(jTextField);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                jTextField.setText(jTextField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            jTextField.setText(jTextField.getText().concat(String.valueOf(".")));
        }
        if (e.getSource() == clrButton) {
            jTextField.setText("");
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            operator = '+';
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            operator = '*';
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(jTextField.getText());
            jTextField.setText("");
            operator = '/';
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(jTextField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            jTextField.setText(String.valueOf(result));
            num1 = result;
        }
        if(e.getSource()==delButton){
            String str = jTextField.getText();
            jTextField.setText("");
            for (int i = 0; i <str.length()-1 ; i++) {
                jTextField.setText(jTextField.getText()+str.charAt(i));
            }
        }
        if(e.getSource()==negButton){
            double temp = Double.parseDouble(jTextField.getText());
            temp*=-1;
            jTextField.setText(String.valueOf(temp));
        }
    }
}
