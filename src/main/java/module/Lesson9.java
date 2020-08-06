package module;

import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        //1 задание
        String st = "Java"; // В пуле
        String st2 = new String("Java"); // не в пуле
        String st3 = st2.intern(); // в пуле
        String st4 = "java"; //В пуле
        String st5 = null; // В задании опечатка - там просто st (была бы ошибка компиляции) // не в пуле
        String st6 = new String("JAVA"); // одновременно и в пуле и нет

        // 2 задание
        String string = "London - is a capital of England";
        String string1 = string.replace("England", "Great Britain");
        System.out.println(string1);

        //3 задание
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите 2 слова с четным количеством букв: ");
        subStr(scanner1.nextLine(), scanner1.nextLine());

        //Сканер для 4ого задания
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово которое хотите развернуть: ");
        reverse(scanner.nextLine());
    }

    //Метод для 3 задания
    private static void subStr(String x, String y) {
        System.out.println(x.substring(0, x.length() / 2) + y.substring(y.length() / 2, y.length()));
    }

    //4 Задание
    private static void reverse(String x) {
        StringBuilder sb = new StringBuilder(x);
        System.out.println(sb.reverse().toString());
    }
}
