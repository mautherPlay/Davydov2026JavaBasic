package homework6dot1;

public class Homework6dot1 {
    public static void main(String[] args) {
        /*
        Є діапазон чисел від 1 до 6, включно.
        За допомогою циклу розрахуйте суму чисел наростаючим підсумком та загальну суму чисел.
        Виведення окремого пункту переліку чисел має бути пронумероване.
         */
            int maxNumber = 6;
            int sum = 0;
            for (int i = 1; i<=maxNumber; i++){
            sum += i;
                System.out.println(i + ")" + " Num is " + i + ", sum is " + sum);
            }
        System.out.println("----------------------");
        System.out.println("Sum of numbers is " + sum);

        // Варіант з while
        int j = 1;
        int sum2 = 0;
        System.out.println("Варіант 2:");
        while (j <= maxNumber ) {
            sum2 += j;
            System.out.println(j + ")" + " Num is " + j + ", sum is " + sum2);
            j++;
        }
        System.out.println("----------------------");
        System.out.println("Sum of numbers is " + sum2);
    }
}
