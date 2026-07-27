package homework10dot1;

public class LineReverse {
    // Метод 4. Рядок в зворотньому порядку
    public static String lineReverse(String line){
        String newLine = "";
        for (int i = line.length() - 1; i >= 0; i-- ){
            newLine += line.charAt(i);
        }
        return newLine;
    }
}
