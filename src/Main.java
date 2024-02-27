public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte age = 0; // самый старый человек прожил 122 года, маловероятно, что byte переполнится
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        byte temperature = 0;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задача 3
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }

        // Задача 4
        age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        // Задача 5
        age = 14;
        boolean adultPresent = false;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 6 && age <= 13 && adultPresent == false) {
            System.out.println("Если возраст ребенка равен " + age + ", и взрослого нет, то ему нельзя кататься на аттракционе");
        } else if (age >= 6 && age <= 13 && adultPresent == true) {
            System.out.println("Если возраст ребенка равен " + age + ", и есть взрослый, то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься одному");
        }

        // Задача 6
        byte places = 102;
        byte seats = 60;
        int stands = places - seats;
        byte paxSitting = 0;
        byte paxStanding = 0;
        int freeSeats = seats - paxSitting;
        int freeStands = stands - paxStanding;
        if (freeSeats > 0 && freeStands > 0) {
            System.out.println("Можно будет ехать стоя или сидя");
        } else if (freeSeats == 0 && freeStands > 0) { // будем считать, что сначала все займут сидячие места
            System.out.println("Можно ехать стоя");
        } else if (freeSeats == 0 && freeStands == 0) {
            System.out.println("Вагон битком, не влезай - убьет");
        }

        // Задача 7
        int one = 3;
        int two = 0;
        int three = 4;

        // дальше везде считаем, что числа не равны друг другу
        if (one > two) {
            if (one > three) {
                System.out.println("Число " + one + " максимальное");
            }
            else System.out.printf("Число " + three + " максимальное");
        } else if (two < three) {
            System.out.println("Число " + three + " максимальное");
        } else System.out.println("Число " + two + " максимальное");
    }
}