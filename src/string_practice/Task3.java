package string_practice;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество
 * и возвращающую инициалы в формате "Ф.И.О". Учесть, что входные параметры могут
 * быть в любом регистре, а регистрирующая строка должна быть в верхнем.
 */
public class Task3 {

    public static void main(String[] args) {
        String result = format("Ivanov", "Petr", "Petrovich");
        System.out.println(result);
    }

    public static String format(String lastName, String firstName, String patronymicName){
        char lastNameCharacter = Character.toUpperCase(lastName.charAt(0));
        char firstNameCharacter = Character.toUpperCase(firstName.charAt(0));
        char patronymicNameCharacter = Character.toUpperCase(patronymicName.charAt(0));

        return String.format("%s.%s.%s", lastNameCharacter, firstNameCharacter, patronymicNameCharacter);
    }
}
