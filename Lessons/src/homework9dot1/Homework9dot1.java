package homework9dot1;

public class Homework9dot1 {
    public static void main(String[] args) {

// Масив та змінні
        int[][] arr = new int[4][4];

        int sumPar = 0;
        int sumNotPar = 0;
        String parLine = "";
        String notParLine = "";
        long multPar = 1;
        long multNotPar = 1;
        String parCol = "";
        String notParCol = "";
        int magicSumTemp = 0;
        int sumLine = 0;
        int sumCol = 0;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        boolean isMagic = true;

// Парні та непарні стовпці за індексом
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                if (parCol.length() > 0) {
                    parCol = parCol.concat(", ");
                }
                parCol = parCol.concat(String.valueOf(j));
            } else {
                if (notParCol.length() > 0) {
                    notParCol = notParCol.concat(", ");
                }
                notParCol = notParCol.concat(String.valueOf(j));
            }
        }

// Парні та непарні рядки за індексом, заповнення масиву числами від 1 до 50
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                if (parLine.length() > 0) {
                    parLine = parLine.concat(", ");
                }
                parLine = parLine.concat(String.valueOf(i));
            } else {
                if (notParLine.length() > 0) {
                    notParLine = notParLine.concat(", ");
                }
                notParLine = notParLine.concat(String.valueOf(i));
            }

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 50 + 1);
                System.out.print(arr[i][j] + " ");

// Сума чисел парних та непарних рядків
                if (i % 2 == 0) {
                    sumPar += arr[i][j];
                } else {
                    sumNotPar += arr[i][j];
                }

// Добуток чисел парних та непарних стовпців
                if (j % 2 == 0) {
                    multPar *= arr[i][j];
                } else {
                    multNotPar *= arr[i][j];
                }
            }
            System.out.println();
        }

// Перевірка магічного квадрату

    // Сума першого рядка - temp
        for (int j = 0; j < arr.length; j++) {
            magicSumTemp += arr[0][j];
        }

    // Перевірка рядків
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumLine += arr[i][j];
            }
            if (sumLine != magicSumTemp) {
                isMagic = false;
            }
        }

    // Перевірка стовпців
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sumCol += arr[i][j];
            }
            if (sumCol != magicSumTemp) {
                isMagic = false;
            }
        }

    // Перевірка діагоналі 1
        for (int i = 0; i < arr.length; i++) {
            sumDiagonal1 += arr[i][i];
        }
        if (sumDiagonal1 != magicSumTemp) {
            isMagic = false;
        }

    // Перевірка діагоналі 2
        for (int i = 0; i < arr.length; i++) {
            sumDiagonal2 += arr[i][arr.length - 1 - i];
        }
        if (sumDiagonal2 != magicSumTemp) {
            isMagic = false;
        }

        System.out.println("Сума елементів у парних рядках (рядок " + parLine + "): " + sumPar);
        System.out.println("Сума елементів у непарних рядках (рядок " + notParLine + "): " + sumNotPar);
        System.out.println("Добуток елементів у парних стовпцях (стовпець " + parCol + "): " + multPar);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець " + notParCol + "): " + multNotPar);

        if (isMagic == true) {
            System.out.println("Матриця є магічним квадратом");
        } else {
            System.out.println("Матриця не є магічним квадратом");
        }

    }
}