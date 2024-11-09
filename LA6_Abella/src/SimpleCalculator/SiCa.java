package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiCa {
    private JTextField tfNumber1;
    private JComboBox<String> cbOperations;
    private JTextField tfNumber2;
    private JPanel SiCaPanel;
    private JLabel lblResult;
    private JButton btnCompute;
    private JTextField tfResult;
    private JLabel nameNum1;
    private JLabel nameNum2;

    public SiCa() {
        cbOperations.addItem("Choose");
        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    String operation = (String) cbOperations.getSelectedItem();
                    double result;

                    // Perform the selected operation
                    switch (operation) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                tfResult.setText("Error: Cannot divide by zero");
                                return;
                            }
                            break;
                        default:
                            tfResult.setText("Error: Invalid operation");
                            return;
                    }

                    tfResult.setText(" "+result);
                } catch (NumberFormatException ex) {
                    tfResult.setText("Error: Please enter a valid number");
                }
            }
        });
    }

    public JPanel getSiCaPanel() {
        return SiCaPanel;
    }
}