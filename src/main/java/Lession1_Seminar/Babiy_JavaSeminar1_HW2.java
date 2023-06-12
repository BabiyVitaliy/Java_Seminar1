//2. Создать квадратный двумерный целочисленный
// массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные
// элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей
// можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

package Lession1_Seminar;

import java.util.Arrays;
import java.util.Scanner;

public class Babiy_JavaSeminar1_HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  s = scanner.nextInt();
        System.out.println(s);
        int[][] arr = new int[s][s];
        for (int i = 0; i < s-1; i++){
            arr [i][i] = 1;
            arr [i][s-2-i] = 1;
        }
        for (int i = 0; i < s-1; i++) {
            for (int j = 0; j < s-1; j++) {

                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
