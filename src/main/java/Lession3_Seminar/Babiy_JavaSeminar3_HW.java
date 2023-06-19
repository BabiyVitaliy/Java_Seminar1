//Пусть дан произвольный список целых чисел.
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа


package Lession3_Seminar;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Babiy_JavaSeminar3_HW {
    public static void main(String[] args) {
        Random rndNumb = new Random();
        int massivRange = 25;
        double sum = 0;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(massivRange);
        ArrayList<Integer> listEvenNumb = new ArrayList<Integer>(massivRange);
        for (int i = 0; i < massivRange; i++) {
            listNumb.add(rndNumb.nextInt(100));
        }

        System.out.println("Исходный массив: ");
        System.out.println(listNumb);

        System.out.println("Максимальный элемент " + Collections.max(listNumb));
        System.out.println("Минимальный элемент " + Collections.min(listNumb));
        for (int i = 0; i < massivRange; i++) {

            sum += listNumb.get(i);
        }
        System.out.println("Среднее значение " + sum / massivRange);

        for (int i = 0; i < massivRange; i++) {
            if ((listNumb.get(i) % 2) == 0) {
                listEvenNumb.add(listNumb.get(i));
            }
        }
        listNumb.removeAll(listEvenNumb);
        System.out.println("Массив после удаления всех четных чисел: ");
        System.out.println(listNumb);
    }


}

