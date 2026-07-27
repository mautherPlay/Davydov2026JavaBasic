package homework10dot1;

public class SumArray {
    // Метод 3. Сума всіх елементів масиву
    public static int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
