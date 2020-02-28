import java.util.Scanner;

public class lesson3_p1 {

    static void game (int max, int count, int continuedGame, Scanner sc)  {

        while (continuedGame == 1) {
            int secretNumber = (int) (Math.random() * max);
                for (int i = 1; i <= count; i++) {

                System.out.println("������� �" + i);
                System.out.print("������� �������������� �����: ");
                int userNumber = sc.nextInt();

                if (((userNumber > secretNumber) || userNumber < secretNumber) && i == count) {
                    System.out.println("������� ���������. ���������� ����� - " + secretNumber);
                }
                else if (userNumber == secretNumber) {
                    System.out.println("�� ������� � ������� �" + i);
                    break;
                } else if (userNumber > secretNumber){
                    System.out.println("�� ����� ������� ������� �����!\n���������� ��� ���!");
                } else {
                    System.out.println("�� ����� ������� ��������� �����!\n���������� ��� ���!");
                }

            }
            System.out.println("��������� ���� ��� ���? 1 � �� / 0 � ���");
            continuedGame = sc.nextInt();

        }

        if (continuedGame > 1 || continuedGame < 0) {
            System.out.println("������� 1 � ��� ����������� / 0 � ��� ��������� ����.");
            continuedGame = sc.nextInt();
            game(max, count, continuedGame, sc);
        }
    }

    public static void main(String[] args) {
        // ������ �����
        int maxNumber = 10;
        int count = 3;
        int continuedGame = 1;
        Scanner sc = new Scanner(System.in);


        System.out.println("�������� ����� �� 0 �� "+ (maxNumber - 1) + " �� " + count + " �������!");
        game(maxNumber, count, continuedGame, sc);

        System.out.println("���� ��������!");

    }
}