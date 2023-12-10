import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Rinat";
        String middleName = "Faritovich";
        String lastName = "Agliulov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }


    public static void task2() {
        System.out.println("Задание 2");
        String firstName = "Rinat";
        String middleName = "Faritovich";
        String lastName = "Agliulov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —" + fullName.toUpperCase());
    }


    public static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String update = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + update);
    }
}