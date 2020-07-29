package module;

import java.util.Arrays;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
/*        //1 задание
        for (int i = 10; i <= 20; i++) {
            System.out.println("Квадрат числа " + i + " равен " + i * i);
        }

        //2 задание
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; sum < num; i++) {
            sum = i * i;
            if (sum < num) {
                System.out.println(sum);
            }
        }

        //3 задание
        int[] a = {10, 20, 15, 17, 24, 35};
        int mul = 1;
        for (int x : a) {
            mul *= x;
        }
        System.out.println(mul);


        //4 задание //Равносторонний треугольник
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //5 Задание
        Scanner sc = new Scanner(System.in);
        int b;
        int sum1 = 0;
        do {
            System.out.println("Введите целое число");
            b = sc.nextInt();
            sum1 = sum1 + b;
        }while (b != 0);
        System.out.println("Сумма всех введенных чисел равна: " + sum1);*/

        //6 Задание
        Scanner scanner1 = new Scanner(System.in);
      //  int t = -1;
        System.out.print("Введите целое число: ");
        String c = scanner1.next();
        String[] array = c.split("");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i].equals(array[i + 1])){
                System.out.println("Да");
                break;
            }else if(i == (array.length - 2)){
                System.out.println("Нет");
            }


        }
        //   int r = Integer.parseInt(c);
//        for (int i = 0; i <= c.length(); i++) {
//            int k = r % 10;
//            if (t == k){
//                System.out.println("ДА");
//                break;
//            }else if(i == c.length()){
//                System.out.println("Нет");
//            }
//            t = k;
//            r = r / 10;
//        }
        //7 задание
        int xyz = 10_000_000;
        double k1 = 0.014;
        double k2 = 0.008;
        double count = 0.0;
        for (int i = 0; i < 10; i++) {
            count += (xyz * k1) - (xyz * k2);
        }
        System.out.println("Население через 10 лет будет: " + (count + xyz));
    }
}

