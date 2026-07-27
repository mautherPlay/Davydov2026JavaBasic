package homework10dot1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework10dot1 {
    // Main-метод - виклик усіх методів програми. Методи 3,4,5 з return
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Метод 1
        System.out.print("1. Введіть ціле число: ");
        int numberSquare = scanner.nextInt();
        Square.square(numberSquare);
    // Метод 2
        System.out.print("2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print(" Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        Cap.cap(radius, height);
    // Метод 3
        System.out.println("3. Заповніть масив чисел. ");
        int [] arr = new int [5];
        for (int i = 0; i<arr.length; i++){
            System.out.println(" Введіть число " + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        int sum = SumArray.sumArray(arr);
        System.out.println(" Масив чисел: " + Arrays.toString(arr));
        System.out.println(" Сума всіх елементів масиву дорівнює " + sum + ".");
    // Метод 4
        scanner.nextLine();
        System.out.print("4. Введіть рядок: ");
        String line = scanner.nextLine();
        String reversedLine = LineReverse.lineReverse(line);
        System.out.println("Рядок в зворотньому порядку: " + reversedLine + ".");
    // Метод 5
        System.out.print("5. Введіть a: ");
        int number1 = scanner.nextInt();
        System.out.print(" Введіть b: ");
        int number2 = scanner.nextInt();
        int newNumber = SquareNumbers.squareNumbers(number1, number2);
        System.out.println(" Результат " + number1 + "^" + number2 + " дорівнює " + newNumber + ".");
    //Метод 6
        System.out.println("6. Введіть ціле число n: ");
        int numberN = scanner.nextInt();
        System.out.println(" Введіть текстовий рядок: ");
        scanner.nextLine();
        String lineN = scanner.nextLine();
        LineNtimes.lineNtimes(numberN, lineN);
    }
}
