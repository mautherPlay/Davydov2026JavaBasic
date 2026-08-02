package homework11dot1;

import java.util.Scanner;

public class Homework11dot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[3];
// Введення даних та їх показ
        for (int i = 0; i < people.length; i++) {
    System.out.println("Особа " + (i + 1));
    System.out.print("Введіть ім'я: ");
            String name = scanner.nextLine();
    System.out.print("Введіть вік: ");
            int age = scanner.nextInt();
            scanner.nextLine();
    System.out.print("Введіть професію: ");
            String profession = scanner.nextLine();
            people[i] = new Person(name, age, profession);
        }
    System.out.println();
    System.out.println("Введені дані:");
        for (int i = 0; i < people.length; i++) {
            people[i].ShowInfo();
        }
// Зміна професії
    System.out.println();
    System.out.println("Зміна професії першої особи.");
    System.out.print("Введіть нову професію: ");
        String newProfession = scanner.nextLine();
        people[0].setProfession(newProfession);
    System.out.println();
    System.out.println("Після оновлення:");
        people[0].ShowInfo();
    }
}