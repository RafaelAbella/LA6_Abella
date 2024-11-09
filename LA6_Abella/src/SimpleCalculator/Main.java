package SimpleCalculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SiCa checkerPanel = new SiCa();

        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.add(checkerPanel.getSiCaPanel());
        frame.setVisible(true);
    }
}

