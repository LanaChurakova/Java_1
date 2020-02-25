import java.util.Arrays;
import java.util.Scanner;

/*
    created by Churakova Lana
*/

public class Lesson_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Пункт 1 - преобразование массива:");
        int[] arr1 = {0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1};
        inversionArr(arr1);

        System.out.println("Пункт 2 - заполнение пустого массива:");
        creatureArr();

        // пункт 3
        System.out.println("Пункт 3 - умножение чисел меньших '6' на 2:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArr(arr3);

        // пункт 4
        System.out.println("Пункт 4 - создание двумерного массива чисел и преобразование диагональных элементов:");
        System.out.print("Введите число для задания размера массива: ");
        int k = in.nextInt();
        creatureDoubleArr(k);

        // пункт 5
        System.out.println("Пункт 5 - свычисление максимального и минимального элемента массива:");
        System.out.print("Введите число для задания размера массива: ");
        int m = in.nextInt();
        System.out.print("Введите число для задания диапазона массива: ");
        int n = in.nextInt();
        minMaxArr(m, n);

        // пункт 7
        System.out.println("Пункт 7 - Сдвиг элементов массива:");
        System.out.print("Введите число для задания размера массива: ");
        int kk = in.nextInt();
        System.out.print("Введите число шага для сдвига элементов от " + (-kk) + " до " + kk +".\nОтрицательное - сдвиг влево, положительное - вправо: ");
        int nn = in.nextInt();
        changePosition(kk, nn);
    }

    // метод для пункта 1
    public static void inversionArr (int[] arr1) {
        System.out.println("Массив до преобразования:    " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            // вариант if-else - проще и короче
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else { arr1[i] = 0;}

            /*
            // вариант со switch - массивный, но имеет право быть
            switch (arr1[i]) {
            case 0:
                arr1[i] = 1;
                break;
            case 1:
                arr1[i] = 0;
                break;}
            */
        }
        System.out.println("Массив после преобразования: " + Arrays.toString(arr1) +"\n");

    }

    // метод для пункта 2
    public static void creatureArr() {
        int[] arr2 = new int[8];
        for (int i = 0, j = 0; j <= 21; i++, j += 3) {
            arr2[i] = j;
        }
        System.out.println("Заполненный массив: " + Arrays.toString(arr2) + "\n");
    }

    // метод для пункта 3
    public static void changeArr(int[] arr3) {
        System.out.println("Массив до преобразования:    " + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3 [i] < 6) {
                arr3 [i] *= 2;
            }
        }
        System.out.println("Массив после преобразования: " + Arrays.toString(arr3) + "\n");
    }

    // метод для пункта 4
    public static void creatureDoubleArr (int k) {
        int[][] arr4 = new int[k][k];
        System.out.println("Созданный массив:");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                int counter = (int) (Math.random() * 10);
                arr4 [i][j] = counter;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4 [i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    // метод для пункта 5
    public static void minMaxArr(int m, int n){
        int[] arr5 = new int [m];
        for (int i = 0; i < arr5.length; i++) {
            int count = (int) ((Math.random() * (2*n + 1))-n);
            arr5[i] = count;
        }
        System.out.println("Созданный массив:" + Arrays.toString(arr5));

        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (max < arr5[i]) {
                max = arr5[i];
            }
        }
        System.out.println("Максимальное число в массиве - " + max);

        int min = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (min > arr5[i]) {
                min = arr5[i];
            }
        }
        System.out.println("Минимальное число в массиве - " + min);
    }
    // метод для пункта 7
    public static void changePosition(int kk, int nn) {
        int[] newArr = new int [kk];
        for (int i = 0; i < newArr.length; i++) {
            int count = (int) ((Math.random() * (2*kk + 1))-kk);
            newArr[i] = count;
        }
        System.out.println("Созданный массив:" + Arrays.toString(newArr));

        if ((nn > newArr.length) || (nn < - (newArr.length))) {
            System.out.println("Число для смещения позиций больше длины массива!");
        }
        else if (nn >= 0) {
            for (int i = (newArr.length - 1); (i - nn) >= 0; i--) {
                newArr[i] = newArr[i - nn];
            }
            System.out.println("Преобразованный массив:" + Arrays.toString(newArr));
        } else {
            for (int i = 0; (i - nn) < newArr.length; i++) {
                newArr[i] = newArr[i - nn];
            }
            System.out.println("Преобразованный массив:" + Arrays.toString(newArr));
        }



    }

}