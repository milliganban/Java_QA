package Live_work;

public class Conditional_operator {
    public static void main(String[] args) {
        int age = 19;
        boolean canNotGoToSchool = age < 7 || age > 18;
        if (age >= 18 && age < 21) {
            System.out.println("Ты достаточно взрослый чтобы водить но недостаточно взрослый чтобы пить алкоголь");
        }
        if (canNotGoToSchool) {
            System.out.println("Я думаю ты не ходишь в школу");
        }
    }
}
