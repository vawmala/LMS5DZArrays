package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * This is prototype for Lab 4.
 */
public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // TODO init it's array by new with size 4.

        // TODO insert some value to start of array and to end of array.

        firstArray[0] = 5.1f;
        firstArray[1] = 5.2f;
        firstArray[2] = 5.3f;
        firstArray[3] = 5.4f;

        int[] intArray = {5, 11, 19, 25, 123, 99, 75}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        System.out.println("1.2 Копирование массива.");
        int[] intArrayCopy = Arrays.copyOf(intArray, 7); // TODO copy "intArray". Use copyOf...
        System.out.println(Arrays.toString(intArrayCopy));

        // 1.3)
        System.out.println("1.3 Сортировка массива");
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);
        System.out.println(Arrays.toString(intArrayCopy));
        // 1.4)
        System.out.println("1.4 Представление массива строкой");
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));
        // 1.5)
        System.out.println("1.5 Сравнение массивов");
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        if (Arrays.equals(intArrayCopy, intArray)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы не равны");
        }


        // PART 2
        System.out.println("Часть2. Создание нового массива");
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        System.out.println();
        System.out.println("2.1 Необходимо посчитать сумму всех значений в массиве.");
        // TODO calc sum of all array elements and print result.

        int sum1 = 0;
        for (int i : testArray) {
            sum1 += i;
        }
        System.out.println(sum1);

        // 2.2)
        System.out.println("2.2 Необходимо посчитать сумму только значений нечетных индексов в массиве. Нолевой индекс массива включен в расчет");
        // TODO calc sum of all numbers with odd indexes and print result.

        int sumOdd = testArray[0];
        for (int i = 1; i < testArray.length; i += 2) {
            sumOdd += testArray[i];
        }
        System.out.println(sumOdd);

        // 2.3)
        System.out.println("2.3 Необходимо найти максимально значение массива.");
        // TODO find max value in array.

        int max = 0;
        for (int i : testArray) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);


        // PART 3

        //3.1 Создать двумерный массив (любого числового типа) с указанными в TODO размерами.");
        // TODO create two-dimensional array with size [3][4]

        int[][] intsArray = new int[3][3];

        //3.2
        System.out.println("Задание 3.2: Заполнение созданного двумерного массива любыми числами в цикле (двойной for)");
        // TODO fill array with any numbers in cycles.

        Random random = new Random();
        for (int i = 0; i < intsArray.length; i++) {
            for (int j = 0; j < intsArray[i].length; j++) {
                intsArray[i][j] = random.nextInt(25);
                System.out.print(intsArray[i][j] + "\t");
            }
            System.out.println();
        }


        //3.3
        System.out.println("Задание 3.3: Посчитать сумму всех значений массива.");
        // TODO calc sum of all array elements and print result.

        int sum2 = 0;
        for (int i = 0; i < intsArray.length; i++) {
            for (int j = 0; j < intsArray[i].length; j++) {
                sum2 += intsArray[i][j];
            }
        }
        System.out.println(sum2);


        // PART 4*

        System.out.println("Задание 4*: Есть заполненный двумерный массив. Необходимо посчитать сумму наименьшего и\n" +
                "наибольшего значения из следующей выборки: учитывать только i-е значения больше 2 и\n" +
                "меньше-равно 5, и только каждое 3-е значение ( j ). ");

        long[][] matrix = new long[9][9];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               matrix[i][j] = random.nextInt(25);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }



//        int ratio = 0;
//        for (long[] row : matrix) {
//            Arrays.fill(row, ++ratio);
//        }


        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        long sum = 0;
        long max1 = 0;
        long min = matrix[3][0];
        for (int i = 3; i <=5 ; i++) {
            for (int j = 0; j <matrix[i].length ; j+=3) {
                if (matrix[i][j]> max1) {
                    max1= matrix[i][j];
                } else if (matrix[i][j]<min) {
                    min = matrix[i][j];

                }
            }
        }
        System.out.println("Максимальное число: " + max1);
        System.out.println("Минимальное число: " + min);
        sum = max1 + min;
        System.out.println("Сумма равна: " + sum);
    }
}