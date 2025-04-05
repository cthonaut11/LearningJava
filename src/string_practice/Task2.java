package string_practice;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
 * если строка начинается и заканчивается этим словом.
 */
public class Task2 {

    public static void main(String[] args) {
        String value = "Gold as;ldlkmz lkzmxkcqpm gold";
        String word = "gold";
        String word2 = "golden";
        System.out.println(isStartEnd(value, word));
    }

    public static boolean isStartEnd(String value, String word){
        return value.trim().toLowerCase().startsWith(word.toLowerCase()) && value.trim().toLowerCase().endsWith(word.toLowerCase());
    }
}
