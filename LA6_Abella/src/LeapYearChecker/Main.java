package LeapYearChecker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        LYC checkerPanel = new LYC();

        JFrame frame = new JFrame("Leap Year Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.add(checkerPanel.getCheckerPanel());
        frame.setVisible(true);
    }
}
