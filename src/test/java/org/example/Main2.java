package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "Password";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин:");
        String userLogin = in.next();
        if (login.equals(userLogin)){
            System.out.println("Введите пароль:");
            String userPassword = in.next();
            if (password.equals(userPassword)){
                System.out.println("Здравствуйте " + userLogin +", Вы вошли в систему!");
            } else {
                System.out.println("Пароль не верный!");
            }
            } else {
            System.out.println("Нет пользователя с таким именем!");
        }
       // int a = 1, b = 2;
       // if (a<b)
        //System.out.println("a menshe b");

       // else
       // System.out.println(" a ne menshe b");

    }

//        int a = 1, b = 2;
//        if (a < b) ;
//
//            System.out.println("a<b");
//
//        } else {
//            System.out.println("a ne menshe b");
//        }
//
//    }
}
