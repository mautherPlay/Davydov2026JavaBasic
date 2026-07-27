package homework10dot1;

public class SquareNumbers {
    // Метод 5. Число "а" в степені числа "b"
    public static int squareNumbers(int number1, int number2){
        int newNumber = 1;
        for(int i = 0; i < number2; i++){
            newNumber *= number1;
        }
        return newNumber;
    }
}
