import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(task5());
        task6();
        System.out.println(task7());
        task8();
//        System.out.println("Введіть номер завдання для перевірки, від 1 до 8: ");
//        Scanner scan = new Scanner (System.in);
//        int point = scan.nextInt();
//        switch (point) {
//            case 1 : printThreeWords();
//            break;
//            case 2 : checkSumSign();
//            break;
//            case 3 : printColor();
//            break;
//            case 4 : compareNumbers();
//            break;
//            case 5 : System.out.println(task5());
//            break;
//            case 6 : task6();
//            break;
//            case 7 : System.out.println(task7());
//            break;
//            case 8 : task8();
//            break;
//        }


    }
    /* 1 Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у
    три слова: Orange, Banana, Apple.
    Orange
    Banana
    Apple */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    /* 2 Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте
    їх будь-якими значеннями, якими захочете. Далі метод повинен підсумувати ці змінні, і якщо їх сума
    більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна"; */
    public static void checkSumSign(){
        Scanner number = new Scanner(System.in);
        int a; int b;
        System.out.println("Введіть ціле число a ");
        a = number.nextInt();
        System.out.println("Введіть ціле число b ");
        b = number.nextInt();
        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        }else {
            System.out.println("Сума негативна");
        }

    }
    /* 3  Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте
     її будь-яким значенням. Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести
     повідомлення "Червоний", якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий",
     якщо більше 100 (100 виключно) - "Зелений";
     */
    public static void printColor () {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Введіть ціле число: ");
        value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }
    /* 4 Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте
    їх будь-якими значеннями, якими захочете. Якщо a більше або одно b, необхідно вивести в консоль
    повідомлення “a >= b”, інакше “a < b”;*/
    public static void compareNumbers() {
        Scanner number = new Scanner(System.in);
        int a; int b;
        System.out.println("Введіть ціле число a ");
        a = number.nextInt();
        System.out.println("Введіть ціле число b ");
        b = number.nextInt();
        if (a  >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
    /* 5 Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить
     в межах від 10 до 20 (включно), якщо так – повернути true, інакше – false. */
    public static boolean task5() {
        Scanner number = new Scanner(System.in);
        int a; int b;
        System.out.println("Введіть ціле число a ");
        a = number.nextInt();
        System.out.println("Введіть ціле число b ");
        b = number.nextInt();
        return ((a + b) >= 10 && (a + b)<=20);
    }
    /* 6 Написати метод, якому як параметр передається ціле число, метод повинен надрукувати
     в консоль, чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.*/
    public static void task6() {
        Scanner number = new Scanner(System.in);
        int a;
        System.out.println("Введіть ціле число:");
        a = number.nextInt();
        if (a  >= 0) {
            System.out.println("Це додатне число.");
        }else {
            System.out.println("Це від'ємне число");
        }
    }
    /* 7 Написати метод, якому як параметр передається ціле число.
     Метод повинен повернути true, якщо число є негативним, і повернути false якщо позитивне.*/
    public static boolean task7() {
        Scanner number = new Scanner(System.in);
        int a;
        System.out.println("Введіть ціле число: ");
        a = number.nextInt();
        return (a < 0);
    }
    /* 8 Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати
     в консоль зазначений рядок, вказану кількість разів;*/
    public static void task8() {
        Scanner number = new Scanner(System.in);
        String text; int a;
        System.out.println("Введіть текст для друку:");
        text = number.nextLine();
        System.out.println("Введіть кількість повторів друку:");
        a = number.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

}