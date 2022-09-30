/** ****************************************************************************
 * MilesPerGallonGUI.java
 * Kevin Bell
 *
 * This GUI program is a Miles Per Gallon GUI application.
 **************************************************************************** */
package milespergallongui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class MilesPerGallonGUI extends JFrame {

    private static final int WIDTH = 325;
    private static final int HEIGHT = 150;
    private JTextField howManyMilesBox;
    private JTextField outputBox;
    private JTextField howManyGallonsBox;
    private JButton button1 = new JButton("Calculate");

    public MilesPerGallonGUI() {
        setTitle("MPG Calculator");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end constructor method

    private void createContents() {  // Create components and add them to window
        JLabel howManyMiles = new JLabel("How many miles?");
        Listener listener = new Listener();
        howManyMilesBox = new JTextField(10);
        button1.setBackground(Color.YELLOW);
        JLabel howManyGallons = new JLabel("How many gallons?");
        howManyGallonsBox = new JTextField(10);
        howManyGallonsBox.setEditable(true);
        outputBox = new JTextField(10);
        outputBox.setEditable(false);
        add(howManyMiles);
        add(howManyMilesBox);
        add(howManyGallons);
        add(howManyGallonsBox);
        add(button1);
        add(outputBox);
        howManyMilesBox.addActionListener(listener);
        button1.addActionListener(listener);
    } // end createContents method

    private class Listener implements ActionListener {//InnerClass eventHandling

        public void actionPerformed(ActionEvent e) {
            DecimalFormat output = new DecimalFormat("##.00");
            double miles, gallons = 0;
            String MPG = null;
            if (e.getSource() == howManyMilesBox) {
                JOptionPane.showMessageDialog(null, "Click one of the buttons");
            } else {
                try {
                    miles = Double.parseDouble(howManyMilesBox.getText());
                    gallons = Double.parseDouble(howManyGallonsBox.getText());
                    if (e.getSource() == button1) {
                        Container contentPane = getContentPane();
                        if (e.getSource() == button1) {
                            contentPane.setBackground(Color.PINK);
                        } // end if condition

                        MPG = output.format(miles / gallons);
                    } // end if condition
                    outputBox.setText(MPG);
                } catch (NumberFormatException nfe) {
                    outputBox.setText("does not compute");
                } // end try/catch   
            } // end if/else condition
        } // end actionPerformed
    } // end Listener class

    public static void main(String[] args) {
        new MilesPerGallonGUI();
    }
}
