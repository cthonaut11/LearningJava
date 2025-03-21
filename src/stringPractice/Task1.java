package stringPractice;


/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class Task1 {

    public static void main(String[] args) {
        String value = "() )( aoskdpo :( ;alsmdl :( :) lasmdlksm";
        String newString = replace(value);
        System.out.println(newString);
    }

    public static String replace(String value){
        return value.replace(":(", ":)");
    }
}
