// 3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59


package Lession1_Seminar;

import java.util.Scanner;
import java.util.Date;

public class Babiy_JavaSeminar1_HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.next();
        Date date = new Date();
        int nowTime = date.getHours();
        if (nowTime > 4 && nowTime < 12) {
            System.out.println("Доброе утро " + s);
        } else if (nowTime > 11 && nowTime < 18) {
            System.out.println("Добрый день " + s);
        } else if (nowTime > 17 && nowTime < 23) {
            System.out.println("Добрый вечер " + s);
        } else System.out.println("Доброй ночи " + s);


    }
}
