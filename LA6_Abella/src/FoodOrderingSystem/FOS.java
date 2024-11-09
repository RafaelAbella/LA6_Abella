package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOS {
    private JPanel FOSPanel;
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JButton orderButton;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;

    public FOS() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noneRadioButton);
        buttonGroup.add(a5OffRadioButton);
        buttonGroup.add(a10OffRadioButton);
        buttonGroup.add(a15OffRadioButton);

        noneRadioButton.setSelected(true);
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalPrice = calculateTotalPrice();
                double discount = getDiscount();
                totalPrice = totalPrice - (totalPrice * discount);
                JOptionPane.showMessageDialog(FOSPanel, "The total price is Php " + totalPrice);
            }
        });
    }

    private double calculateTotalPrice() {
        double price = 0;
        if (pizzaCheckBox.isSelected()) {
            price += 100;
        }
        if (burgerCheckBox.isSelected()) {
            price += 80;
        }
        if (friesCheckBox.isSelected()) {
            price += 55;
        }
        if (softDrinksCheckBox.isSelected()) {
            price += 55;
        }
        if (teaCheckBox.isSelected()) {
            price += 50;
        }
        if (sundaeCheckBox.isSelected()) {
            price += 40;
        }
        return price;
    }

    private double getDiscount() {
        if (a5OffRadioButton.isSelected()) {
            return 0.05;
        } else if (a10OffRadioButton.isSelected()) {
            return 0.10;
        } else if (a15OffRadioButton.isSelected()) {
            return 0.15;
        }
        return 0;
    }

    public JPanel getFOSPanel() {
        return FOSPanel;
    }

}