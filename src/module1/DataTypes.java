package module1;

import java.util.Arrays;
import java.util.stream.Stream;

public class DataTypes {
    public static void main(String[] args) {

        //Byte data type 8 bit // -128..127
        byte a = 127;
        byte b = (byte) 255;
        byte c = (byte) (a - b);
        System.out.println(c);

        //Short data type 16 bit // -32768.. 32767
        short a1 = 32000;
        short b1 = -16000;
        short c1 = (short) (a1 + b1);
        System.out.println(c1);

        // Int data type 32 bit // -2147483648.. 2147483648
        int x = 1200;
        System.out.println(x);
        System.out.println(Math.pow(x, 2));
        System.out.println(Math.pow(x, 3));

        //Long data type
        System.out.println(Long.MAX_VALUE); // Может использоваться, например, для отображения кол-ва информации в байтах

        //Double data type // double 32 bit // float 16 bit
        float A = 1245.554f;
        double B = 256.3785;
        double C = A * B;
        System.out.println(C);
        String X = Double.toString(C);
        System.out.println(X.substring(7, X.length()));
        System.out.println(C % 1);


        //Char data type // 8 bit // 0 .. 65535
        System.out.println((char) 43);
        System.out.println((char) 33);
        System.out.println((char) 63);


        //7 задание : без ошибок будут скомпилированы: a,b,e,f,h,j,l

        //Преобразование числа 123 в системы счисления
        //123 / 2 = 61(1);
        // 61 / 2 = 30(1);
        // 30 / 2 = 15(0);
        // 15/2 = 7(1);
        // 7 / 2 = 3(1);
        //3 / 2 = 1 (1);
        // 1 / 2 = 0 (1);
        int num123b = 0b1111011;
        System.out.println(num123b);


        //123 / 8 = 15(3);
        //15 / 8 = 1(7);
        //1 / 8 = 0(1);

        int num123o = 0173;
        System.out.println(num123o);

        //123 / 16 = 7(11)
        // 7 / 16 = 0(7)
        int num123h = 0x7B;
        System.out.println(num123h);


        //Задание 9
        //1)
        int x2 = 10; // Примитивный тип - коробка со значением

        String s = "Hi"; // Ссылочный тип , с большой буквы - это класс. s - ссылка на объект в памяти
                        // Тут можно вызвать методы
                        //Обертки в отличии от примитивов можно хранить в коллекциях

        //2)
        // В стеке хрянятся ссылки на объекты и примитивные типы
        // В куче(HEAP) хранятся сами объекты

        //3)Boolean – 128 бит
        //Byte – 128 бит
        //Short, Character – 128 бит
        //Integer, Float – 128 бит
        //Long, Double – 192 бита


    }
}
