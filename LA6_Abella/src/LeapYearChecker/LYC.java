package LeapYearChecker;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LYC {
    private JPanel CheckerPanel;
    private JButton checkYearButton;
    private JTextField yearTextField;

    public LYC() {
        CheckerPanel.setName("CheckerPanel");
        yearTextField.setName("YearTextField");
        checkYearButton.setName("CheckYearButton");

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(yearTextField.getText());
                    String message;
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        message = "Leap year";
                    } else {
                        message = "Not a leap year";
                    }
                    JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public JPanel getCheckerPanel() {
        return CheckerPanel;
    }
}