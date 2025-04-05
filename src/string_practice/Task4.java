package string_practice;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */
public class Task4 {

    public static void main(String[] args) {
        String value1 = "...,! aspodksazx";
        System.out.println(countSymbols(value1));
    }

    public static int countSymbols(String value){
        String newValue = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");

        return value.length() - newValue.length();
    }
}
