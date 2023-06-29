/**
 * Реализовать консольное приложение - телефонный справочник.
 * У одной фамилии может быть несколько номеров.
 * Пользователь может вводить команды:
 * 1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
 * 2. GET Ivanov - получить список всех номеров по фамилии
 * 3. REMOVE Ivanov - удалить все номера по фамилии
 * 4. LIST - Посмотреть все записи
 * 5. EXIT - Завершить программу
 * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
 * <p>
 * Пример взаимодействия (=> - это вывод на консоль):
 * ADD Ivanov 8 800 555 35 35
 * ADD Ivanov 8 800 100 10 10
 * GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
 * ADD Petrov 8 555 12 34
 * LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
 * REMOVE Ivanov
 * LIST => Petrov = [8 555 12 34]
 * GET NoName => Не найдена запись с фамилией "NoName"
 * REMOVE NoName => Не найдена запись с фамилией "NoName"
 */


package Lession4_Seminar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;
public class Babiy_JavaSeminar5_HW {

    public static void main(String[] args) {
        System.out.println("Введите одну из следующих команд цифрой\n" +
                "ADD - добавить фамилию и номер \n" +
                "GET - получить список всех номеров по фамилии\n" +
                "REMOVE - удалить все номера по фамилии\n" +
                "LIST - Посмотреть все записи\n" +
                "EXIT - Завершить программу");

        Scanner scanner = new Scanner(in);
        HashMap<String, List> phoneBook = new HashMap<>();
        while (true) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");
            System.out.println(command);
            if ("1".equals(command[0])) {
                addData(phoneBook, input);
            } else if ("2".equals(command[0])) {
                getBySurname(phoneBook, command);
            } else if ("3".equals(command[0])) {
                removeBySurname(phoneBook, command);
            } else if ("4".equals(command[0])) {
                allData(phoneBook);
            } else if ("5".equals(command[0])) {
                System.exit(0);
                break;
            } else {
                System.err.println("Введена некорректая команда.");
                System.exit(0);
            }
        }
    }

    public static void addData(HashMap<String, List> phoneBook, String command) {
        String[] name_phone = command.split(" ");
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 2; i < name_phone.length; i++) {
            phoneNumber.append(name_phone[i]);
        }
        if (phoneBook.containsKey(name_phone[1])) {
            phoneBook.get(name_phone[1]).add(phoneNumber);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(String.valueOf(phoneNumber));
            phoneBook.put(name_phone[1], phones);
        }
    }

    public static void getBySurname(HashMap<String, List> phoneBook, String[] command) {
        if (phoneBook.containsKey(command[1])) {
            System.out.println(command[1] + " - " + phoneBook.get(command[1]));
        } else {
            System.out.println("Абонент с таким номером не найден");
        }
    }

    public static void removeBySurname(HashMap<String, List> phoneBook, String[] command) {
        if (phoneBook.containsKey(command[1])) {
            phoneBook.remove(command[1]);
        } else {
            System.out.println(command[1] + " такого абонента нет");
        }
    }
    public static void allData(HashMap<String, List> phoneBook) {
        System.out.println(phoneBook);
    }

}
