package homework5dot1;

public class Homework5dot1 {

    public static void main(String[] args){
        double value = 10000;
    System.out.printf("Дохід становить: %.2f.%n", value);
          if (value < 0) {
    System.out.println("Рівень доходу не може бути від'ємним!");
        } else if (value <= 10000) { // 0-10000 включно
    System.out.printf("Сума податку становить %.2f при ставці 2,5%%.", value / 100 * 2.5);
        } else if (value <= 25000) { // 10000 виключно - 25000 включно
    System.out.printf("Сума податку становить %.2f при ставці 4,3%%.", value / 100 * 4.3);
        } else { // 25000..
    System.out.printf("Сума податку становить %.2f при ставці 6,7%%.", value / 100 * 6.7);
        }
    }
}
