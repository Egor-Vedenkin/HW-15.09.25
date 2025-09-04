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

        // Задача 4
        int ageFirst = 15;
        if (ageFirst >= 2 && ageFirst <= 6) {
            System.out.println("Если возраст человека " + ageFirst + ", ему нужно ходить в детский сад");
        } else if (ageFirst >= 7 && ageFirst <= 17) {
            System.out.println("Если возраст человека " + ageFirst + ", ему нужно ходить в школу");
        } else if (ageFirst >= 18 && ageFirst <= 24) {
            System.out.println("Если возраст человека " + ageFirst + ", ему нужно ходить в университет");
        } else if (ageFirst > 24) {
            System.out.println("Если возраст человека " + ageFirst + ", ему нужно ходить на работу");
        }
        // Отступ для визуального отделения задач
        System.out.println();

        // Задача 5
        int ageSecond = 3;
        if (ageSecond < 5) {
            System.out.println("Если возраст ребенка " + ageSecond + ", то он не может кататься на аттракционе");
        } else if (ageSecond >= 5 && ageSecond < 14) {
            System.out.println("Если возраст ребенка " + ageSecond + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка " + ageSecond + ", то ему можно кататься на аттракционе без сопровождения");
        }
        // Отступ для визуального отделения задач
        System.out.println();

        // Задача 6
        int people = 70;
        if (people < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (people >= 60 && people <= 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        // Отступ для визуального отделения задач
        System.out.println();

        // Задача 7
        int one = 6;
        int two = 10;
        int three = 2;
        if (one == two && one == three) {
            System.out.println("Числа равны, их значение равно " + one);
        } else if (one > two && one > three) {
            System.out.println("Первое число наибольшее, его значение равно " + one);
        } else if (two > one && two > three) {
            System.out.println("Второе число наибольшее, его значение равно " + two);
        } else {
            System.out.println("Третье число наибольшее, его значение равно " + three);
        }
    }
}