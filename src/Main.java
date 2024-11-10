public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС невозможно определить");
        }


        // task 2

        System.out.println("Задача 2");
        clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
            System.out.println("ОС невозможно определить");
        }


        // task 3

        System.out.println("Задача 3");
        int year = 2024;
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year <= 1584) {
            System.out.println("Високосный год был введен в 1584 г");
        } else {
            System.out.println(year + " год не является високосным");
        }


//        if (year % 4 == 0 && year % 100 != 0 && year > 1584) {
//            System.out.println(year + " год является високосным");
//        } else if (year % 400 == 0) {
//            System.out.println(year + " год является високосным");
//        } else if (year <= 1584) {
//            System.out.println("Високосный год был введен в 1584 г");
//        } else {
//            System.out.println(year + " год не является високосным");
//        }


        // task 4

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1; // минимальный срок доставки

        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки на расстояние " + deliveryDistance + " км нет");
        } else {
            System.out.println("Расстояние введено неверно");
        }


        // task 5

        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Номер месяца введен неверно");
        }


    }
}