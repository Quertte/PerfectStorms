package module1;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //1 Задание : В консоль ничего не будет выведено, т.к. переменной b присваивается значение 6;
        int a = 7;
        int b = --a;
        if (b == 7) {
            System.out.println("b = 7");
        }

        //2 задание : В консоль ничег оне будет выведено(будет ошибка компиляции : в if должно быть выражение boolean)
        //Если же в задании опечатка и в if на самом деле с == d++ то отработает блок else, т.к.
        // только при след. обращении к переменной d она станет равна 3
        int c = 3, d = 2;
        if (c == d++) {
            System.out.println("It is 'if' statement!");
        } else {
            System.out.println("It is 'else' statement!");
        }

        //3a) Задание На нахождение максимумв
        int x = 34, y = 2, z = 78;
        if (x > y && x > z) {
            System.out.println("Maximum is " + x);
        } else if (y > x && x > z) {
            System.out.println("Maximum is " + y);
        } else if (z > x && z > y) {
            System.out.println("Maximum is " + z);
        }

        //3b) Задание на нахождение минимума
        if (x < y && x < z) {
            System.out.println("Minimum is " + x);
        } else if (y < x && x < z) {
            System.out.println("Minimum is " + y);
        } else if (z < x && z < y) {
            System.out.println("Minimum is " + z);
        }

        //4 Задание Изначально будет выведено "One of the statements isn't true."
        //Если в последнем вложенном If во втором условии заменить != на == то этот if отработает и будет выведено
        //"All statements are true."

        //Если в первом if заменить >= на > то первый if не отработает , отработает его ветка else
        // и будет выведено на экран "All statements are false"

        //Ну и чтобы вывести на экран "One of statements is true.", достаточно во втором if заменить == на !=
        int a1 = 10;
        int c1 = a1;
        int b1 = ++a1;
        if (b1 >= a1) {
            if (c1 == 10) {
                if ((c1 <= b1) && (a1 != b1)) {
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

        //5 Задание
        int num = 8;
        String message = "";

        message = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
        System.out.println(message);


        //6 задание
        System.out.println("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such month");
                break;
        }

        // 7 Задание
        System.out.println("Enter the day of the week.");
        Scanner scanner1 = new Scanner(System.in);
        String day = scanner1.next().toLowerCase(); // it can be any day

        switch(day) {
            case "monday":
                System.out.println("This is the first day of the week");
                break;
            case "tuesday":
                System.out.println("This is the second day of the week");
                break;
            case "wednesday":
                System.out.println("This is the third day of the week");
                break;
            case "thursday":
                System.out.println("This is the fourth day of the week");
                break;
            case "friday":
                System.out.println("This is the fifth day of the week");
                break;
            case "saturday":
                System.out.println("This is the sixth day of the week");
                break;
            case "sunday":
                System.out.println("This is the seventh day of the week");
                break;
            default:
                System.out.println("Such day of the week doesn't exist.");
                break;
        }
    }
}
