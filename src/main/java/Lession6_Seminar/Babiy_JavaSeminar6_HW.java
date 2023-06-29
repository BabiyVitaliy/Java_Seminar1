package Lession6_Seminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class Babiy_JavaSeminar6_HW {
    public static void main(String[] args) {
        /*
         * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
         * 2. Создать множество ноутбуков (ArrayList).
         * 3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
         * Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
         * Выводить только те ноутбуки, что соответствуют условию
         */


        ArrayList<Laptop> laptops = getLaptops();
        for (Laptop laptop : laptops) {
            laptop.about();
        }
        int choice = getChoice();
        List<Laptop> result = filterLaptops(laptops, choice);
        if (!result.isEmpty()) {
            for (Laptop laptop : result) {
                laptop.about();
            }
        } else {
            System.out.println("Ноутбуки отсутствуют");
        }
    }

    private static List<Laptop> filterLaptops(ArrayList <Laptop> laptops, int choice) {
        Scanner scan = new Scanner(System.in);
        List<Laptop> result = new ArrayList<>();
        if (choice == 1) {
            System.out.print("По какому цвету отфильтровать? ");
            String color = scan.nextLine();
            result = laptops.stream().filter(laptop -> laptop.getColor().equals(color)).toList();
        }  else if (choice == 2 || choice == 3 || choice == 4) {
            try {
                if (choice == 2) {
                    System.out.print("Введите минимальный объём оперативной памяти: ");
                    int ram = parseInt(scan.next());
                    result = laptops.stream().filter(laptop -> laptop.getRam() >= ram).toList();
                } else if (choice == 3) {
                    System.out.print("Введите минимальный размер экрана: ");
                    double screen = parseDouble(scan.next());
                    result = laptops.stream().filter(laptop -> laptop.getScreenSize() >= screen).toList();
                } else if (choice == 4) {
                    System.out.print("Введите год выпуска: ");
                    int year = parseInt(scan.next());
                    result = laptops.stream().filter(laptop -> laptop.getYear() == year).toList();
                }
            } catch (Exception error) {
                System.out.println("Необходимо ввести число");
            }
        } else if (choice == 0) {
            System.exit(0);
        }
        return result;
    }

    // выбор фильтра пользователем
    private static int getChoice() {
        Scanner scan = new Scanner(System.in);
        int change = 0;
        while(true) {
            try {
                System.out.print("""
                    1 – фильтр по цвету
                    2 – фильтр по объёму оперативной памяти
                    3 – фильтр по размеру экрана
                    4 – фильтр по году выпуска
                    0 – выход

                    Введите команду:\s""");
                change = parseInt(scan.nextLine());
                if (change >= 0 && change < 5) {
                    break;
                } else {
                    System.out.println("Некорректный выбор");
                }
            } catch (Exception error) {
                System.out.println("Введите целое число");
            }
        }
        return change;
    }

    private static ArrayList<Laptop> getLaptops() {
        Random random = new Random();
        Laptop.setBasePrice(210);
        ArrayList<Laptop> laptops = new ArrayList<>();
        String brand = "Lenovo";
        String[] names = new String[]{"ThinkPad", "ThinkBook", "IdeaPad", "Yoga"};
        String[] models = new String[]{"Slim 5/A", "Pro 5/A", "Pro 5i/A", "16/A", "15/A", "15/A", "X1 Yoga/A", "X1 Fold/A"};
        String[] colors = new String[]{"Red", "Green", "Blue", "White", "Yellow", "Purple"};
        String[] diskTypes = new String[]{"SSD", "HDD", "M2"};
        String[] processorBrands = new String[]{"AMD", "Intel"};
        String[] gpuBrands = new String[]{"Apple", "Intel", "AMD"};
        int[] years = new int[]{2023, 2022, 2021, 2020, 2019, 2016, 2015, 2014, 2013, 2012, 2011, 2010};
        int[] memory = new int[]{4, 8, 16, 32};
        int[] capacity = new int[]{256, 512, 1024};
        double[] screenSizes = new double[]{13.0, 13.3, 13.6, 14, 14,5, 15, 16.0};
        Laptop laptop;
        for (int countLaptops = 1; countLaptops < 20; countLaptops++) {
            laptop = new Laptop(brand, names[random.nextInt(names.length)], models[random.nextInt(models.length)],
                    colors[random.nextInt(colors.length)], diskTypes[random.nextInt(diskTypes.length)],
                    processorBrands[random.nextInt(processorBrands.length)], gpuBrands[random.nextInt(gpuBrands.length)],
                    countLaptops, years[random.nextInt(years.length)],
                    memory[random.nextInt(memory.length)], capacity[random.nextInt(capacity.length)],
                    screenSizes[random.nextInt(screenSizes.length)]);
            laptops.add(laptop);
        }
        return laptops;
    }



}