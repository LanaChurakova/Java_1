package lesson4;
import java.util.Random;
import java.util.Scanner;

public class Game_5x5_intel {

    private static final char DOT_X = 'X';
    private static int stepCounter = 0;
    private static final char DOT_O = 'O';
    private static final char DEFAULT = '_';
    private static final Random rnd = new Random();


    public static void main(String[] args) throws InterruptedException {
        //  System.out.println("Укажите размер поля: ");
        //  int size = in.nextInt();
        int size = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Игра в крестики-нолики " + size +'*'+size);

        char[][] tab = new char[size][size];
        initTable(tab);

        boolean isInGame = true;
        while (isInGame) {
            System.out.println("Введите номер строки и номер столбца для хода");
            print(tab);
            int x = in.nextInt(), y = in.nextInt();
            x--; y--;

            if  (isValidStep(x, y, tab)) {
                tab[x][y] = DOT_X;
                if (isWin(DOT_X, tab)) {
                    print(tab);
                    System.out.println("Вы победили");
                    return;
                }
                stepCounter++;
                if (stepCounter == ((size * size)/2 +1)) {
                    print(tab);
                    System.out.println("Ничья");
                    return;
                }
                movePC(tab, x, y);
                System.out.println("Ход противника");
                for (int i = 0; i < 7; i++) {
                    System.out.print(" * ");
                    Thread.sleep(200);
                }
                System.out.println();
                if (isWin(DOT_O, tab)) {
                    print(tab);
                    System.out.println("Вы проиграли");
                    return;
                }
            }
        }
    }

    private static boolean isWin(char ch, char[][] tab) {
        //(tab.length -1) - выигышная комбинация для маленьких диагоналей
        for (int i = 0; i < tab.length; i++) {
            int sx = 0, sy = 0, d1 = 0, dn1 = 0, du1 = 0, dn2 = 0, du2 = 0, d2 = 0;
            for (int k = 0; k < (tab.length -1); k++) {
                du1 += tab[k + 1][k] == ch ? 1 : 0; // ok
                dn1 += tab[k][k + 1] == ch ? 1 : 0; // ok
                du2 += tab[(tab.length -1) - k - 1][k] == ch ? 1 : 0;//ok
                dn2 += tab[k + 1][(tab.length -1) - k] == ch ? 1 : 0;//ok
            }
            for (int j = 0; j < tab.length; j++) {
                sx += tab[i][j] == ch ? 1 : 0; //ok
                sy += tab[j][i] == ch ? 1 : 0; //ok
                d1 += tab[j][j] == ch ? 1 : 0; //ok
                d2 += tab[j][tab.length - j - 1] == ch ? 1 : 0; //ok
            }

            if (sx == tab.length || sy == tab.length || d1 == tab.length
                    || d2 == tab.length || du1 == (tab.length -1) || dn1 == (tab.length -1) || du2 == (tab.length -1) || dn2 == (tab.length -1)) {
                return true;
            }
        }
        return false;
    }

    private static void movePC(char[][] tab, int xx, int yy) {
        while (true) {
            int x = 0, y = 0;
            if (yy == 0 && xx==0) {
                x = (int) (Math.random() + 1);
                y = (int) (Math.random() + 1);
            } else if (yy == (tab.length - 1) && xx == (tab.length - 1)) {
                x = (int) (Math.random()*(tab.length - xx + 1) + (tab.length - 2));
                y = (int) (Math.random()*(tab.length - yy + 1) + (tab.length - 2));
            } else {
                x = (int) (Math.random()*((xx+2)-(xx-1)) + (xx-1));
                y = (int) (Math.random()*((yy+2)-(yy-1)) + (yy-1));
            }

            if (isValidStep(x, y, tab)) {
                tab[x][y] = DOT_O;
                return;
            }

        }
    }

    private static boolean isValidStep(int x, int y, char[][] tab) {
        int size = tab.length;
        if (x >= 0 && x < size && y >= 0 && y < size) {
            return tab[x][y] == DEFAULT;
        }
        return false;
    }

    private static void print(char[][] tab) {
        System.out.print("   ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tab.length; j++) {
                System.out.print("|" + tab[i][j]);
            }
            System.out.println("|");
        }
    }

    private static void initTable(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = DEFAULT;
            }
        }
    }
}
