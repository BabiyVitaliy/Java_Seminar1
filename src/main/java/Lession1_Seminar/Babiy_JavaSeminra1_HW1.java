//1. Задать одномерный массив и
//  найти в нем минимальный и максимальный элементы;
//
package Lession1_Seminar;

import java.util.Arrays;

public class Babiy_JavaSeminra1_HW1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        System.out.println("максимальное число " + Arrays.stream(arr).max());
        System.out.println("Минимальное число " + Arrays.stream(arr).min());
    }
}
