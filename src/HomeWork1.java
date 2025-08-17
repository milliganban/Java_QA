public class HomeWork1 {
    public static void main(String[] args){

        // Задача № 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        // Задача № 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);


        // Задача № 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        // Задача № 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        // Задача № 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        // Задача № 6
        var player1 = 78.2;
        var player2 = 82.7;
        var playerTogether = player1 + player2;
        System.out.println("Общаяя масса двух бойцов " + playerTogether + " кг ");

        var difference = player2 - player1;
        System.out.println("Разницу между массами бойцов " + difference + " кг ");



        // Задача № 7
        var differenceSubtraction = player2 - player1;
        System.out.println("Разница масс (вычитание): " + differenceSubtraction + " кг");
        var differenceRemainder = player2 % player1;
        System.out.println("Разница масс (остаток от деления): " + differenceRemainder + " кг");


        // Задача № 7
        var totalHour = 640;
        var oneWorkManHour = 8;
        var totalWorkMan = totalHour / oneWorkManHour;
        System.out.println("Всего работников в компании - " + totalWorkMan + " человек.");

        var workManMore = totalWorkMan + 94;
        var totalHourMore = workManMore * 8;
        System.out.println("Если в компании работает " + workManMore + " человек, то всего " + totalHourMore + " часов работы может быть поделено между сотрудниками");






    }
}
