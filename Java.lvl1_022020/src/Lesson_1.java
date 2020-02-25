import java.util.Scanner;

public class Lesson_1 {

    public static void main(String[] args) {
        // пункт 1-2:
        byte byteVal = 118;
        int intVal = 30;
        short shVal = 3500;
        long longVal = 1556666445545444555L;
        float flVal = 1235.55f;
        double dblVal = 133335555.545545;
        char chVal = '*';
        final int constanta = 357799;
        System.out.println(byteVal + "\n" + intVal + "\n" + shVal + "\n" + longVal + "\n" + flVal + "\n" + dblVal + "\n" + chVal + "\n");

        Scanner in = new Scanner(System.in); // запрос ввода с консоли

        // пункт 3:
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        System.out.print("Введите четвёртое число: ");
        int d = in.nextInt();
        System.out.println(ans(a, b, c, d));

        // пункт 4:
        System.out.print("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();
        System.out.println(summ(firstNumber, secondNumber));

        // пункт 5:
        System.out.print("Введите число: ");
        int num = in.nextInt();
        number(num);

        //пункт 6:
        System.out.print("Введите число: ");
        int k = in.nextInt();
        System.out.println(typeNegative(k));

        //пункт 7:
        System.out.print("Введите Ваше имя: ");
        String nameUser = in.next();
        name(nameUser);

        //пункт 8:
        System.out.print("Введите год: ");
        int years = in.nextInt();
        year(years);
    }

    //метод для пункта 3:
    public static float ans (float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    //метод для пункта 4:
    public static boolean summ (int a, int b) {
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    //метод для пункта 5:
    public static void number (int num) {
        if (num >= 0) {
            System.out.println("Число '" + num +"' - положительное");
        } else {
            System.out.println("Число '" + num + "' - отрицательное");
        }
    }

    //метод для пункта 6:
    public static boolean typeNegative (int k) {
        if (k < 0) {
            return true;
        } else {
            return false;
        }
    }

    //метод для пункта 7:
    public static void name (String userName) {
        System.out.println("«Привет, " + userName + "!»");
    }
    //метод для пункта 8:
    public static void year (int years) {
        if (years % 400 == 0) {
            System.out.println(years + "-ый год - ВИСОКОСНЫЙ!");}
        else if ((years % 4 == 0) && (years % 100 != 0)) {
            System.out.println(years + "-ый год - ВИСОКОСНЫЙ!");}
        else {
            System.out.println(years + "-ый год - НЕ ВИСОКОСНЫЙ!");}
    }
}