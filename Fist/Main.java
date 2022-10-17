package Fist;

import Fist.Character;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd= new Random();
        Character[] arr= new Character[5];
        String[] names={"Тор","Валькирия","Супермен"};
        String[] klasses={"Воин","Маг","Лекарь"};
        for (int i = 0; i < arr.length; i++) {
            Character character= new Character();
            int indexName= rnd.nextInt(names.length);
            character.name=names[indexName];
            int indexKlasses= rnd.nextInt(klasses.length);
            character.classes=klasses[indexKlasses];
            character.damage= rnd.nextInt(10,20);
            arr[i]=character;
            arr[i].printInfo();
        }
        System.out.println("----------------------");
            String input;
            Scanner scn=new Scanner(System.in);
            System.out.println("Введите имя персонажа");
            input= scn.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(input)){
                arr[i].printInfo();
            }

        }
        System.out.println("--------------------------");
            System.out.println(" Введите урон персонажа");
            int input1= scn.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].damage==input1){
                    arr[j].printInfo();
                }
            }
        System.out.println("---------------------");
                System.out.print(" Введите клас и урон персонажа: ");
                input= scn.next();
                for (int i = 0; i < arr.length ; i++) {
                    if (arr[i].classes.equals(input)||arr[i].damage==input1){
                        arr[i].printInfo();
                    }

                }

            }


        }













































