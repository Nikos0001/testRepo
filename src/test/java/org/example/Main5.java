package org.example;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        // int counter = 0;
        // do {
        //     counter++;
        //     System.out.println("Counter" + counter );
        //     if (true) break;
        //     System.out.println("OOOOO");

        // }
        // while (counter < 3);{
        //    System.out.println("Произведено "+counter+" итераций");
        //}
        // counter++;
        //System.out.println("Counter" + counter);
        // if (true) continue; //break;
        //System.out.println(" Эта строка не выполнится ");

        //}
        //System.out.println("Произведено " + counter +" итераций");


        //  System.out.println(" Угадай задуманный цвет с пяти попыток.");
        //  System.out.println(" Для выхода из программы введите - exit ");
        //  final  int MAX_ATTEMPT = 5;
        // int attempt = 0;
        // String color = " RED ";
        // Scanner in = new Scanner(System.in);
        // while (attempt < MAX_ATTEMPT){
        //    attempt++;
        //     System.out.println(" Попытка " + attempt + ":");
        //     String value = in.next();
        //      if (value.equals("exit")){
        //         break;

        //     }
        //     if (!value.equals(color)){
        //         continue;
        //     }
        //     System.out.println(" Поздравляем, Вы угадали с " + attempt + " попытки!");
        //     break;
        // }
        // System.out.println(" Конец игры! ");

        for (int counter = 0;counter < 10;counter++){
            System.out.println("Counter = "+ counter);
        }
        for (int i = 0; i < 10; i++);{

            for (int j = 0; j < 10 ; j++){
                System.out.print(" * " );
                System.out.println();

            }
        }
    }
}

