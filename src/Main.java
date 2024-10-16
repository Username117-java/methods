import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int year = 1900;
        defineLeapYear(year);

        System.out.println();
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviceYear = 2014;
        defineOS(clientDeviceYear, clientOS);

        System.out.println();
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        int deliveryDays = calculationOfDeliveryDays(deliveryDistance);
        if (deliveryDays != 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void defineLeapYear(int year) {
        if (year < 1584) {
            System.out.println("До 1584 года не было високосных лет");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineOS(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Неизвестная ОС");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int calculationOfDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }


}