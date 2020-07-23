package module;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //1 задание
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));


        //2 задание
        // Взял массив из первого задания и переворачиваю его
        //Метод переворота ниже main
        System.out.println(Arrays.toString(back(array)));


        // 3 задание
        int[] array1 = {1, 2, 3, 4, 5};
        swap(array1, 0, 1);

        int[] array2 = new int[]{2, 3, 4, 5, 6, 10};
        swap(array2, 2, 5);

        //4 задание
        int[] array3 = {1, 2, 3};
        swap(array3, 1, 2);
        swap(array3, 1, 3);
        swap(array3, -1, 0);

        int[] array4 = new int[]{2, 4, 6, 8, 10};
        swap(array4, 2, 3);
        swap(array4, 4, 5);
        swap(array4, -2, 0);
    }


    //Метод переворота массива(для 2 задания)
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - i; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }


    //Метод 3 задания
    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
        if (indexA >= array.length || indexA < 0) {
            System.out.println("indexA (" + indexA + ") incorrect\n");
            return;
        }
        if (indexB >= array.length || indexB < 0) {
            System.out.println("indexB (" + indexB + ") incorrect\n");
            return;
        }
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}
