public class HomeWork2 {
    public static void main(String[] args){
        // Задача 1
        byte a = 120;
        System.out.println(a);
        short b = 30000;
        System.out.println(b);
        int c = 2500500;
        System.out.println(c);
        long d = 12345678956465465L;
        System.out.println(d);
        double i = 01.05;
        System.out.println(i);
        float g = 23.76f;
        System.out.println(g);

        // Задача 2
        double aa = 27.12;
        long bb = 987678965549L;
        float cc = 2.786f;
        short dd = 569;
        short ii = -159;
        int gg = 27897;
        byte ff = 67;

        // Задача 3
        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        int totalStudent = teacherOne + teacherTwo + teacherThree;
        System.out.println("Всего учеников у трех преподователей - " + totalStudent);

        short paper = 480;
        int paperEveryStudy = paper / totalStudent;
        System.out.println("На каждого ученика рассчитано " + paperEveryStudy + " листов бумаги");

        // Задача 4
        byte bottleOneMinute = 16 / 2;
        int bottleTwentyMinute = 20 * bottleOneMinute;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinute + " штук бутылок");

        int bottleOneDay = 1440 * bottleOneMinute;
        System.out.println("За сутки машина прроизвела " + bottleOneDay + " штук бутылок");

        int bottleThreeDays = 4320 * bottleOneMinute;
        System.out.println("За 3 дня машина произвела " + bottleThreeDays + " штук бутылок");

        int bottleOneMonth = 43200 * bottleOneMinute;
        System.out.println("За 1 месяц машина произвела " + bottleOneMonth + " штук бутылок");

        // Задача 5
        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int paintPerClass = whitePaintPerClass + brownPaintPerClass;

        int totalClasses = totalPaint / paintPerClass;
        int totalWhitePaint = totalClasses * whitePaintPerClass;
        int totalBrownPaint = totalClasses * brownPaintPerClass;

        System.out.println("В школе где " + totalClasses + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");


        // Задча 6
        byte bananas = 80;
        byte milk = 105;
        byte plombir = 100;
        byte eggs = 70;

        int total = (bananas * 5) + (milk * 2) + (plombir * 2) + (eggs * 4);
        System.out.println("Общий вес блюда в граммах равен - " + total);
        double totalKg = total / 1000.0;
        System.out.println("Вес завтрака в килограммах: " + totalKg);

        // Задача 7
        int weightToLoseKg = 7; // Нужно сбросить 7 кг
        int minLossPerDayGrams = 250; // Минимальная потеря веса в день (250 грамм)
        int maxLossPerDayGrams = 500; // Максимальная потеря веса в день (500 грамм)

        int weightToLoseGrams = weightToLoseKg * 1000; // 7000 грамм

        int daysMinLoss = weightToLoseGrams / minLossPerDayGrams; // 7000 / 250 = 28 дней
        int daysMaxLoss = weightToLoseGrams / maxLossPerDayGrams; // 7000 / 500 = 14 дней

        int averageDays = (daysMinLoss + daysMaxLoss) / 2; // (28 + 14) / 2 = 21 день

        System.out.println("При потере веса 250 грамм в день потребуется дней: " + daysMinLoss);
        System.out.println("При потере веса 500 грамм в день потребуется дней: " + daysMaxLoss);
        System.out.println("Среднее количество дней для достижения результата: " + averageDays);

        // Задача 8
        // Исходные данные
        double mashaSalary = 67_760;
        double denisSalary = 83_690;
        double kristinaSalary = 76_230;

        // Повышение зарплаты (10%)
        double mashaNewSalary = mashaSalary * 1.10;
        double denisNewSalary = denisSalary * 1.10;
        double kristinaNewSalary = kristinaSalary * 1.10;

        // Расчет годового дохода до и после повышения
        double mashaAnnualDiff = (mashaNewSalary - mashaSalary) * 12;
        double denisAnnualDiff = (denisNewSalary - denisSalary) * 12;
        double kristinaAnnualDiff = (kristinaNewSalary - kristinaSalary) * 12;

        // Вывод результатов
        System.out.println("Маша теперь получает " + (int) mashaNewSalary + " рублей. Годовой доход вырос на " + (int) mashaAnnualDiff + " рублей.");
        System.out.println("Денис теперь получает " + (int) denisNewSalary + " рублей. Годовой доход вырос на " + (int) denisAnnualDiff + " рублей.");
        System.out.println("Кристина теперь получает " + (int) kristinaNewSalary + " рублей. Годовой доход вырос на " + (int) kristinaAnnualDiff + " рублей.");
    }
}