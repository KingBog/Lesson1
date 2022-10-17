package Three;

import javax.swing.*;

public class Calculator {
    public int sum(int a, int b) {
         a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
        return a+b;
    }

    public int min(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int greater(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public int lesser(int a, int b) {
        if (a > b) {
            return b;
        } else if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public int abs(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }


    }



