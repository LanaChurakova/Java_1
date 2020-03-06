package lesson5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CompanyStructure {
    public static void main(String[] args) {
        Emploee[] empl = new Emploee[5];

        empl[0] = new Emploee("Alex Alexandrov", "Developer","alex.alexsandrov@emailtest.ru", "+79822222244",32, 65000);
        empl[1] = new Emploee("Ivan Ivanov", "Manager","ivan.ivanov@emailtest.ru", "+79822222000",20, 45000);
        empl[2] = new Emploee("Lev Lvov", "HeadTeam","lev.lvov@emailtest.ru", "+79822222888",43, 95000);
        empl[3] = new Emploee("Roman Romanov", "Senior Engeneer","roman.romanov@emailtest.ru", "+79825555888",41, 85000);
        empl[4] = new Emploee("Maxim Maximov", "Junior SEO manager","maxim.maximov@emailtest.ru", "+79899222277",18, 35000);

    // вывод сотрудников компании
        System.out.println("Сотрудники компании:");
        for (int i = 0; i < empl.length; i++) {
            System.out.println("Сотрудник №" +(i+1) +"\n"+ empl[i].getEmploee());
            System.out.println();
        }

    // вывод сотрудников старше минимального возраста для фильтрации
        Scanner ss = new Scanner(System.in);
        System.out.println("Скажите минимальный возраст сотрудников для фильтрации");
        int ageMin = ss.nextInt();
        System.out.println("Сотрудник старше " + ageMin + " лет:");
        for (int i = 0; i < empl.length; i++) {
             empl[i].adultAge(ageMin);
        }
    }
}
