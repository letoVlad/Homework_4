public class Main {
    public static void main(String[] args) {
        //Задание 1.
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 0) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }

        System.out.println("----------------------");
        //Задание 2.

        int clientOS2 = 0;
        int clientDeviceYear = 2014;

        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке»");
        }
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        }

        System.out.println("----------------------");
        //Задание 3.

        int year = 2003;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }

        System.out.println("----------------------");
        //Задание 4.

        int deliveryDistance = 88;
        int dayDelivery = 1;
        if (deliveryDistance > 20) {
            dayDelivery++;
        }
        if (deliveryDistance > 60) {
            dayDelivery++;
        }
        System.out.println("Потребуется дней " + dayDelivery);


        System.out.println("----------------------");
        //Задание 5

        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("NO");
        }
    }
}