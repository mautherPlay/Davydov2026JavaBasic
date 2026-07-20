package homework8dot1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework8dot1 {
    public static void main(String[] args) {

    //Масив із чисел 0-100
        int [] arr = new int [15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100+1);
        }
    System.out.println("Початковий вигляд масиву: " + Arrays.toString(arr));

    //Сортування Бульбашкою
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j = 0; j < arr.length - 1 - i; j++){
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

    //Сортування вставкою
            int n = arr.length;
          for (int i = 1; i < n; i++) {
            int buf = arr[i];
            int j = i - 1;
          while (j >= 0 && arr[j] > buf) {
                arr[j + 1] = arr[j];
                j--;
          }
          arr[j + 1] = buf;
          }
        System.out.println("Відсортований масив:" + Arrays.toString(arr));

    //Введення числа користувачем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int search = scanner.nextInt();

    //Бінарний пошук
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == search) {
                index = mid;
                break;
            } else if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index == -1) {
            System.out.println("Даного числа немає в масиві!");
        } else {
            System.out.print("Індекс числа " + search + " у відсортованому масиві: " + index);
        }

    }
}
