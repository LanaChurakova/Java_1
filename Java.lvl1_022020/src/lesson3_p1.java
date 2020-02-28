import java.util.Scanner;

public class lesson3_p1 {

    static void game (int max, int count, int continuedGame, Scanner sc)  {

        while (continuedGame == 1) {
            int secretNumber = (int) (Math.random() * max);
                for (int i = 1; i <= count; i++) {

                System.out.println("Попытка №" + i);
                System.out.print("Введите предполагаемое число: ");
                int userNumber = sc.nextInt();

                if (((userNumber > secretNumber) || userNumber < secretNumber) && i == count) {
                    System.out.println("Попытки исчерпаны. Загаданное число - " + secretNumber);
                }
                else if (userNumber == secretNumber) {
                    System.out.println("Вы угадали с попытки №" + i);
                    break;
                } else if (userNumber > secretNumber){
                    System.out.println("Вы ввели слишком большое число!\nПопробуйте ещё раз!");
                } else {
                    System.out.println("Вы ввели слишком маленькое число!\nПопробуйте ещё раз!");
                }

            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            continuedGame = sc.nextInt();

        }

        if (continuedGame > 1 || continuedGame < 0) {
            System.out.println("Введите 1 – для продолжения / 0 – для остановки игры.");
            continuedGame = sc.nextInt();
            game(max, count, continuedGame, sc);
        }
    }

    public static void main(String[] args) {
        // Угадай число
        int maxNumber = 10;
        int count = 3;
        int continuedGame = 1;
        Scanner sc = new Scanner(System.in);


        System.out.println("Угадайте число от 0 до "+ (maxNumber - 1) + " за " + count + " попытки!");
        game(maxNumber, count, continuedGame, sc);

        System.out.println("Игра окончена!");

    }
}