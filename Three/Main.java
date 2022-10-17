package Three;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        boolean start = true;
        while (start) {
            int input = Integer.parseInt(JOptionPane.showInputDialog("1. Сложить\n" +
                    "2. Умножить\n" + "3. Делить\n" + "4. Вычесть\n" + "5. Наибольшее\n" + "6. Наименьшее\n" + "7. Модуль\n" +
                    " 8. Выход"));
            if (input == 1) {
               int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
               int b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
               JOptionPane.showMessageDialog(null,cal.sum(a,b));

            }
            if (input == 2) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
                JOptionPane.showMessageDialog(null, cal.mult(a, b));

            }
            if (input == 3) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
                JOptionPane.showMessageDialog(null, cal.divide(a, b));

            }
            if (input == 4) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
                JOptionPane.showMessageDialog(null, cal.min(a, b));
            }
            if (input==5){
            int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
            JOptionPane.showMessageDialog(null, cal.greater(a, b));
            }
            if (input==6){
                int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
                JOptionPane.showMessageDialog(null, cal.lesser(a, b));
            }
            if (input==7){
                int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число"));
                JOptionPane.showMessageDialog(null, cal.abs(a));
            }
            if (input==8){
                start=false;
                JOptionPane.showMessageDialog(null,"Хорошего дня");
            }

        }
    }
}
