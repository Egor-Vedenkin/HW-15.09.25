//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Вы достигли совершеннолетия, вам " + age + " лет");
        } else {
            System.out.println("Вы еще не достигли совершеннолетия, нужно подождать, вам " + age + " лет");
        }
        // Отступ для визуального отделения задач
        System.out.println();

        // Задача 2
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("Нужно надеть шапку, на улице " + temperature + " градусов");
        } else {
            System.out.println("Шапка не нужна, на улице " + temperature + " градусов");
        }
        // Отступ для визуального отделения задач
        System.out.println();

        // Задача 3
        int speed = 210;
        if (speed >= 60) {
            System.out.println("Если ваша скорость " + speed + ", придется заплатить штраф");
        } else {
            System.out.println("Если ваша скорость " + speed + ", можно ездить спокойно");
        }
        // Отступ для визуального отделения задач
        System.out.println();

    }
}