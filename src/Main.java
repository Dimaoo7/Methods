import java.util.Scanner;

public class Main {

    public static void isLeap(int leap) {
        if (leap % 4 == 0 && leap % 100 != 0 || leap % 400 == 0) {
            System.out.println(leap + " високосный год");
        } else {
            System.out.println(leap + " не високосный год");
        }

    }

    public static void lightWeight(int system, int yearOfRelease) {

        if (yearOfRelease < 2015 && system == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            
        } else if (yearOfRelease > 2015 && system == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (yearOfRelease > 2015 && system == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else if (yearOfRelease < 2015 && system == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        }else System.out.println("Ошибка");


    }

    public static void distance(int dist) {
        if (dist <= 20) {
            System.out.println("Доставка займет сутки.");

        }else if(dist <= 60){
            System.out.println("Доставка займет 2 дня.");

        }else if(dist <= 100){
            System.out.println("Доставка займет 3 дня.");

        }else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Какую задачу откроем \n" + "1. Високосный ли год \n" +
                "2. Нужна ли вам облегченная версия приложения \n" + "3. Расчет дней доставки банковской карты \n");
        int number = s.nextInt();
        if (number == 1) {
            task1();
        } else if (number == 2) {
            task2();
        } else if (number == 3) {
            task3();
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите год:");
        int number = s.nextInt();
        isLeap(number);

    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите тип операционной системы (0 — iOS, 1 — Android ):");
        int system = s.nextInt();
        System.out.println("Введите год выпуска устройства:");
        int yearOfRelease = s.nextInt();
        lightWeight(system, yearOfRelease);

    }
    public static void task3() {
        System.out.println("Задача 3");

        Scanner s = new Scanner(System.in);
        System.out.println("Введите расстояние от офиса до адреса доставки ");
        int distance = s.nextInt();
        distance(distance);



    }
}
