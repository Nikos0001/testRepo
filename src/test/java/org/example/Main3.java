package org.example;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //int a = 1,b = 2,c = 0;
        //c = (a>b) ? a : b;
        //System.out.println(c);
        //int a = 1, b = 2, c = -5, max = 0;
        // max = a > b ? (c = a) : (c = b);
        // System.out.println(max);

        // a += 5; значит a = a+5;

        //String string = "Hello ";
        // System.out.println("Введите свой логин:");
        // Scanner in = new Scanner(System.in);
        //String login = in.next();
        //string += login.equals("Admin") ? "Administrator" : "User";
        // System.out.println(string);

        // int a = 1;
        //double b = 0.0;
        //int max;
        //max = (int) ((a>b) ? a : b);
        //max = (a>b) ? a : (int) b;
        //System.out.println(max);

        //int x = 10, y = -5;
        // String quadrant0, quadrant1, quadrant2;
        //quadrant0 = (x>0) ? ((y>0) ? "1 квадрант" : "4 квадрант") : ((y>0) ? " 2 квадрант" : "3 квадрант");
        //quadrant1 = x>0 ? (y>0 ? "1 квадрант" : "4 квадрант" ) : (y>0 ? "2 квадрант" : "3 квадрант");
        //quadrant2 = x>0 ? y>0 ? "1 квадрант" : "4 квадрант" : y>0 ? "2 квадрант" : "3 квадрант";
        //System.out.println(quadrant0);
        //System.out.println(quadrant1);
        // System.out.println(quadrant2);

        //double quantity = 10;
        //double price = 100;
        //double discount = 0.75;
        //double cost;
        //cost = quantity >= 10 ? quantity * price * discount : quantity * price;
        //System.out.println("Общая стоимость товара составляет: " + cost+ " у.е.");

        //int myDay;
        //System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7:");
        //Scanner in = new Scanner(System.in);
       // myDay = in.nextInt();
        //switch (myDay) {
           // case 1:
           //     System.out.println("Понедельник");
           //     break;
           // case 2:
           //     System.out.println("Вторник");
           //     break;
           // case 3:
           //     System.out.println("Среда");
           //     break;
          //  case 4:
          //      System.out.println("Четверг");
          //      break;
          //  case 5:
          //      System.out.println("Пятница");
          //      break;
          //  case 6:
         //       System.out.println("Суббота");
          //      break;
          //  case 7:
         //       System.out.println("Воскресенье");
         //       break;
        //    default:
        //        System.out.println(" Вы ввели несуществующий день недели.");
       //         break;


        //}
    }
    //public class C14_CoffeeMachine {
    public static class C14_CoffeeMachine {
        public static void main(String[] args) {
            System.out.println("Размеры стаканчиков кофе: 1 = Маленький, 2 = Средний, 3 = Большой");
            System.out.println("Пожалуйста, сделайте свой выбор: ");
            Scanner in = new Scanner(System.in);
            String coffeeSize = in.next();
            int cost = 0;
            switch (coffeeSize) {
                case "3":
                    cost += 50;
                case "2":
                    cost += 25;
                case "1":
                    cost += 25;
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста выберите 1, 2 или 3.");
                    break;
            }
            if (cost!= 0){
                System.out.println("Внесите " + cost + "копеек.");
                System.out.println("Спасибо!");
            } else {
                System.out.println("Пожалуйста, повторите выбор.");

            }
        }
    }
}