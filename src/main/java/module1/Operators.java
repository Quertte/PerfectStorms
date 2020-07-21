package module1;

public class Operators {
    public static void main(String[] args) {
        //1 задание
        int a = 10 + 2;
        int b = a + 5;
        int c = a - b + 1;
        int d = a * b * c;
        int e = d / 8;
        int f = e % 30;
        int i = -f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(i);

        /// 2 задание

        int a1 = 10;
        System.out.println(a1);
        a1 += 3;
        System.out.println(a1);
        a1 -= 7;
        System.out.println(a1);
        a1 *= 4;
        System.out.println(a1);
        a1 /= 8;
        System.out.println(a1);
        a1 %= 2;
        System.out.println(a1);

        ///3 задание

        int a2 = 0;
        int b2 = 5;
        a2++;  // значение а2 увеличилось на 1 , но отобразится это только на следюущей строке, коогда мы запросим вывести а
        --b2; // Значение b2 уменьшилось на 1 сразу же, и если поставить b2  в какую-либо формулу на след строке то ее знаение будет уже равно 4
        System.out.println(a2);
        System.out.println(b2);

        a2 = b2--; //присваиваем a2 значение b2 которое равно 4. При следующем обращении к b2 оно будет равно 3.
        System.out.println(a2);
        System.out.println(b2);
        // 4 задание
        int a3 = 3;
        int b3 = 5;
        System.out.println(a3 > b3);
        System.out.println(a3 < b3);
        System.out.println(a3 >= b3);
        System.out.println(a3 <= b3);
        System.out.println(a == b);
        System.out.println(a != b);
        a3 = 5;
        System.out.println(a != b);
        // Тип данных этих операций возвращается булевый (true false); в тот момент когда мы a3 приравняли к 5
        // результат операции a != b стал false, ибо значения переменных стали равны

        //Задание 5
        boolean bOne = true;
        boolean bTwo = false;
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(!bOne);
        System.out.println(!bTwo);
        bTwo = true;
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(!bOne);
        System.out.println(!bTwo); // Возвращают логические оператора булевый тип
        // Разница между опертором не (!)и остальными в том что этот оператор работает только с одним операндом
        //Разница между сокращенными и обычными логическими операторами заключается в том что обычне логические операторы
        // проверяют значения двух опренадов!

        // a - верно(результат true), b. false && true = false(не понял просто вопрос)
        //с. !true || 1 >= 0 - не верно; d. false && 5 - не верно
        // e - не верно(ошибка компиляци)
        //f - также как и e
        // i - верно (результат true)
        // g - не верно


        int a4 = 4;
        int b4 = 3;
        System.out.println(a4 & b4);
        System.out.println(a4 | b4);
        System.out.println(a4 ^ b4);
        System.out.println(~a4);
        System.out.println(~b4);
        //Побитовые операторы похожи на сокращенные логические операторы
        //Опертор NOT(~) Переворачивает каждый бит любого числа(к примеру число 4 = 100    ~4 = 011

        //Задание 7
        int a5 = 10;
        /*
         * a5 << 1 = 20;
         * В этом коде весь бинарный код сдвигается на 1 позицию влево.
         */
        System.out.println(a5 << 1);

        /*
         * a5 >> 1 = 5;
         * В этом коде весь бинарный код сдвигается на 1 позицию в право.
         */
        System.out.println(a5 >> 1);
        a5 = -5;

        /*
         * a5 >>> 1 = 2147483645;
         * В этом коде весь бинарный код сдвигается на 1 позицию в право, а в начале добавляется 0.
         * C положительными числами, он работает идентично, как и оператор >>.
         * Случай с отрицательными числами оператор >>> работает иначе
         * он сдвигает все цифры на 1 позицию в право, а в начале добавляет 0.
         */
        System.out.println(a5 >>> 1);


    }
}
