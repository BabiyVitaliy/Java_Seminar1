package Lession2_Seminar;
import java.util.Arrays;
import java.util.logging.*;
public class Babiy_JavaSeminar2_HW2 {
    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
        Logger logger = Logger.getLogger(Babiy_JavaSeminar2_HW2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler ();
        logger.addHandler (ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter (sFormat);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    logger.info(mas[i] + " > " + mas[i+1] + " Перестановка элементов" );
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        logger.info("Массив отсортирован" );
        System.out.println(Arrays.toString(mas));
    }
}
