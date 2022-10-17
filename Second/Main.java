package Second;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random rnd = new Random();
        BankAccount[] arr = new BankAccount[10];
        for (int i = 0; i < arr.length; i++) {
            BankAccount bA = new BankAccount();
            bA.summ = rnd.nextInt(1000, 5000);
            bA.numAccount = i + 10;
            bA.percent = rnd.nextInt(10, 20);
            arr[i] = bA;

        }
        boolean info = true;
        while (info) {
            int input=Integer.parseInt(JOptionPane.showInputDialog("1. Вывести все счета\n"+ "2. Вывести сумму на счете по номеру\n"+ "3. Сделать перевод\n"+
                    "4. Найти счет с самым большим процентом на остаток\n"+ "5. Найти счет владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год\n"+"6. Выход"));
            if (input==1) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i].printInfo();
                }
            }
            if (input==2) {
                input =Integer.parseInt(JOptionPane.showInputDialog("Введите номер счета: "));
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].numAccount == input) {
                        JOptionPane.showMessageDialog(null, "Достунная сумма на указаном счету: " + arr[i].summ + " грн");
                    }
                }
            }
                if(input==3){
                    int min= Integer.parseInt(JOptionPane.showInputDialog("Введите номер счета-отправителя: "));
                    int plus= Integer.parseInt(JOptionPane.showInputDialog("Введите номер счета-получателя: "));
                    int kesh=Integer.parseInt(JOptionPane.showInputDialog("Введите сумму перевода: "));
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i].numAccount==min){
                            if (arr[i].summ<=kesh) {
                               JOptionPane.showMessageDialog(null,"Операция не возможна");
                               break;
                            }
                            }
                        if (arr[i].numAccount==plus){
                            int bank=(arr[i].summ)+kesh;
                            JOptionPane.showMessageDialog(null,"На счету "+plus+" доступно "+bank+" грн");
                        }

                    }
                }
                if (input==4){
                    int max=0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].percent>max){
                           max=arr[i].percent;
                        }
                    }
                          for (int i = 0; i < arr.length; i++) {
                            if (arr[i].percent==max){
                                arr[i].printInfo();
                        }

                    }

                }
                    if (input==5){
                        int maxD=0;
                        int d=0;
                        for (int i = 0; i < arr.length; i++) {
                            d=(arr[i].summ*arr[i].percent)/100;
                            if (maxD<d){
                                maxD=d;
                            }
                        }
                        for (int i = 0; i < arr.length; i++) {
                            if (maxD==arr[i].summ*arr[i].percent/100){
                                arr[i].printInfo();
                            }

                        }
                    }
                        if (input==6){
                            info=false;
                            JOptionPane.showMessageDialog(null, "Хорошего вам дня!!");
                        }

            }

        }
    }
