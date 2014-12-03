package pbo.quiz;

/*
 Nama    :   Vinsen Muliadi
 NIM     :   135314003
 */
import pbo.quiz.Cell;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Spreadsheet extends JFrame implements ActionListener {

    JLabel labelA, labelB, labelC, label1, label2, label3;
    JTextField textA1, textA2, textA3, textB1, textB2, textB3, textC1, textC2, textC3;

    public Spreadsheet() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 200);
        setTitle("Spreadsheet");
        setVisible(true);
        setLayout(null);

        labelA = new JLabel("A");
        labelA.setBounds(73, 25, 50, 25);
        add(labelA);

        labelB = new JLabel("B");
        labelB.setBounds(128, 25, 50, 25);
        add(labelB);

        labelC = new JLabel("C");
        labelC.setBounds(183, 25, 50, 25);
        add(labelC);

        label1 = new JLabel("1");
        label1.setBounds(25, 50, 75, 25);
        add(label1);

        label2 = new JLabel("2");
        label2.setBounds(25, 80, 75, 25);
        add(label2);

        label3 = new JLabel("3");
        label3.setBounds(25, 110, 75, 25);
        add(label3);

        textA1 = new JTextField();
        textA1.setBounds(50, 50, 50, 25);
        textA1.addActionListener(this);
        add((textA1));

        textA2 = new JTextField();
        textA2.setBounds(105, 50, 50, 25);
        textA2.addActionListener(this);
        add(textA2);

        textA3 = new JTextField();
        textA3.setBounds(160, 50, 50, 25);
        textA3.addActionListener(this);
        add(textA3);

        textB1 = new JTextField();
        textB1.setBounds(50, 80, 50, 25);
        textB1.addActionListener(this);
        add(textB1);

        textB2 = new JTextField();
        textB2.setBounds(105, 80, 50, 25);
        textB2.addActionListener(this);
        add(textB2);

        textB3 = new JTextField();
        textB3.setBounds(160, 80, 50, 25);
        textB3.addActionListener(this);
        add(textB3);

        textC1 = new JTextField();
        textC1.setBounds(50, 110, 50, 25);
        textC1.addActionListener(this);
        add(textC1);

        textC2 = new JTextField();
        textC2.setBounds(105, 110, 50, 25);
        textC2.addActionListener(this);
        add(textC2);

        textC3 = new JTextField();
        textC3.setBounds(160, 110, 50, 25);
        textC3.addActionListener(this);
        add(textC3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textA1) {
            Cell ca1 = new Cell();
            String cellString = textA1.getText();
            textA1.setText(ca1.process(cellString));
        }

        if (e.getSource() == textA2) {
            Cell ca1 = new Cell();
            String cellString = textA2.getText();
            textA2.setText(ca1.process(cellString));
        }

        if (e.getSource() == textA3) {
            Cell ca1 = new Cell();
            String cellString = textA3.getText();
            textA3.setText(ca1.process(cellString));
        }

        if (e.getSource() == textB1) {
            Cell ca1 = new Cell();
            String cellString = textB1.getText();
            textB1.setText(ca1.process(cellString));
        }

        if (e.getSource() == textB2) {
            Cell ca1 = new Cell();
            String cellString = textB2.getText();
            textB2.setText(ca1.process(cellString));
        }

        if (e.getSource() == textB3) {
            Cell ca1 = new Cell();
            String cellString = textB3.getText();
            textB3.setText(ca1.process(cellString));
        }

        if (e.getSource() == textC1) {
            Cell ca1 = new Cell();
            String cellString = textC1.getText();
            textC1.setText(ca1.process(cellString));
        }

        if (e.getSource() == textC2) {
            Cell ca1 = new Cell();
            String cellString = textC2.getText();
            textC2.setText(ca1.process(cellString));
        }

        if (e.getSource() == textC3) {
            Cell ca1 = new Cell();
            String cellString = textC3.getText();
            textC3.setText(ca1.process(cellString));
        }
    }

}
