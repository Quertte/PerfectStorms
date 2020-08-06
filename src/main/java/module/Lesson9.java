package module;

import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        //1 задание
        String st = "Java"; // В пуле
        String st2 = new String("Java"); // не в пуле
        String st3 = st2.intern(); //В пуле
        String st4 = "java"; //В пуле
        String st5 = null; // В задании опечатка - там просто st (была бы ошибка компиляции) // не в пуле
        String st6 = new String("JAVA"); //не в пуле

        // 2 задание
        String string = "London - is a capital of England";
        String string1 = string.replace("England", "Great Britain");
        System.out.println(string1);

        //3 задание
        String x = "Andrew";
        String y = "result";
        String z = x.substring(0,3) + y.substring(3,y.length());
        System.out.println(z);

        //Сканер для 4ого задания
        Scanner scanner = new Scanner(System.in);
        reverse(scanner.nextLine());
    }

    //4 Задание
    private static void reverse(String x){
       StringBuilder sb = new StringBuilder(x);
        System.out.println(sb.reverse().toString());
    }
}
