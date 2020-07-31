package module;

public class Methods {
    public static void main(String[] args) {
        method1();
        method2(5);
        method3(5, 15);
        method4(5, 3, 8);
        System.out.println(method5(5));
        System.out.println(method6(0));
        System.out.println(method7(-1));
        multiplication(5);
        multiplication(10, 5);
        multiplication(5, 10.0);
        multiplication(5.0, 9.0);
        multiplication(1, 2, 3);
        System.out.println(recursion(-10));

    }

    //1 задание  Четные нечетные числа в столбце
    public static void method1() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            if (i % 2 != 0) {
                continue;
            }
            System.out.println();
        }
    }

    // Сумма чисел от 1 до заданного параметра
    public static void method2(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел до указанного параметра: " + sum);
    }

    //Метод который выводит все числа которые делятся на 3
    public static void method3(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //Метод определяющий возможен ли такой треугольник
    public static void method4(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Такой треугольник возможен");
        } else {
            System.out.println("Такой треугольник невозможен");
        }
    }

    //2 Задание
    public static boolean method5(int x) {
        boolean result = false;
        if (x > 0) {
            result = true;
        }
        return result;
    }

    public static String method6(int x) {
        return method5(x) ? "Число больше нуля" : "Число равно или меньше нуля";
    }

    public static String method7(int x) {
        return method6(x) + " и равно " + x;
    }

    //3 Задание
    public static void multiplication(int x) {
        System.out.println(x * 5);
    }

    public static void multiplication(int x, int c) {
        System.out.println(x * c);
    }

    public static void multiplication(int x, double c) {
        System.out.println(x * c);
    }

    public static void multiplication(double x, double c) {
        System.out.println(x * c);
    }

    public static void multiplication(int... arr) {
        int mul = 1;
        for (int i = 1; i <= arr.length; i++) {
            mul *= i;
        }
        System.out.println(mul);
    }

    //Вопросы
    //Что такое перегрузка метода:
    // Когда метод с одинаковой сигнатурой создан несколько раз с разными количеством параметров

    //Как перегрузить метод :
    // Написать ту же сигнатуру, но изменить количество параметров, либо изменить последовательность параметров
    // Смена типа возвращаемого значения с той же последовательностью параметров вызовет ошибку компиляции

    // По поводу скриншотов с методами:
    // В первом случае не перегрузка а ошибка компиляции, тип возращаемого значения хоть и изменен, но не изменена
    // последовательность аргументов

    //во втором случае ответ *Да, это перегрузка*


    // Задание на рекурсию
    public static String recursion(int x) {
        if (x == 0) {
            return "0";
        }
        if (x < 0) {
            return recursion(x + 1) + " " + x;
        }
        return recursion(x - 1) + " " + x;
    }

}
