package homework7dot1;

public class Homework7dot1 {
    public static void main(String[] args) {
        int [] numbers = new int [20];
        int sum = 0;
        int par = 0;
        int notPar = 0;
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;
        int negativeIndex = -1;
        int afterNegativeIndex = 0;
        double afterNegativeSum = 0;
        int afterNegativeCounter = 0;

    //Елементи масиву
        String output = "Елементи масиву: [";
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 201) - 100;
            output = output.concat(String.valueOf(numbers[i]));
            if (i < numbers.length - 1) {
                output = output.concat(", ");
            }
        }
        output = output.concat("]");
        System.out.println(output);

    // Сума від'ємних чисел
        for (int i = 0; i < numbers.length; i++)
        if (numbers[i] < 0){
            sum += numbers[i];
        }
        System.out.println("Сума від'ємних чисел: " + sum);

    // Кількість парних/непарних чисел
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 == 0) {
                par++;
            }else {
                    notPar++;
        }
        System.out.println("Кількість парних чисел: " + par);
        System.out.println("Кількість непарних чисел: " + notPar);

    // Найменший та найбільний елементи та їх індекси
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + minNumber + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + maxNumber + " (з індексом " + maxIndex + ")");

    //Середнє арифметичне чисел після першого від'ємного числа
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
            negativeIndex = i;
            break;
            }
        }
        for (int i = negativeIndex + 1; i < numbers.length; i++){
            afterNegativeSum += numbers[i];
            afterNegativeCounter++;
        }
        System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f ", afterNegativeSum / afterNegativeCounter );
    }
}
