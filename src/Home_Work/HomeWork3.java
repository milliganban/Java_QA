package Home_Work;

public class HomeWork3 {
    public static void main(String[] args){
//        // Задача 1
//        int age = 20;
//        if (age >=18){
//            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
//        } else {
//            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
//        }
//
//        // Задача 2
//        int temperature = 4;
//        if (temperature < 5) {
//            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
//        } else {
//            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
//        }
//
//        // Задача 3
//        int speed = 59;
//        if (speed >60){
//            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
//        } else {
//            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
//        }
//
//        // Задача 4
//        int age = 20; // можно изменить значение для проверки
//
//        if (age >= 2 && age <= 6) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
//        } else if (age >= 7 && age <= 17) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
//        } else if (age >= 18 && age <= 24) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
//        } else if (age > 24) {
//            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
//        } else {
//            System.out.println("Если возраст человека равен " + age + ", то ему еще рано в учреждения");
//        }

//        // Задача 5
//        int childAge = 4; // можно изменить значение для проверки
//        boolean hasAdult = true; // есть ли взрослый
//
//        if (childAge < 5) {
//            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
//        } else if (childAge >= 5 && childAge < 14) {
//            if (hasAdult) {
//                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
//            } else {
//                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
//            }
//        } else {
//            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
//        }

//        // Задача 6
//        int passengers = 150;
//        int totalCapacity = 102;
//        int sittingSeats = 60;
//
//        if (passengers < sittingSeats) {
//            System.out.println("В вагоне есть сидячие места");
//        } else if (passengers < totalCapacity) {
//            System.out.println("В вагоне есть только стоячие места");
//        } else if (passengers == totalCapacity) {
//            System.out.println("Вагон полностью забит");
//        } else {
//            System.out.println("Превышена вместимость вагона");
//        }

        // Задача 7
        int one = 15;
        int two = 25;
        int three = 10;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
