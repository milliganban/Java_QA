public class Variable_1 {
    public static void main(String[] args){

        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box *3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var max = 50;
        var zanyto = 20;
        var ostatok = max - zanyto;
        System.out.println("Еще можно положить " + ostatok + " кг вещей");

        var apples = 2;
        var orange = 3;
        var summa = apples + orange;
        System.out.println("Общий вес фруктов " + summa);

        var meat = 4;
        var water = 5;
        var tomatoes = 2;
        var cucumber = 2;
        var peppers = 2;
        var zucchinni = 2;
        var totalVegatable = tomatoes + cucumber + peppers + zucchinni;
        var product = summa + totalVegatable + meat + water;
        System.out.println("Общий вес продуктов " + product + " кг!");

        product = product * 2;
        System.out.println("Теперь вес продуктов " + product);





    }
}
