public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ",  он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 17;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int carSpeed = 75;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч то придется заплатить штраф");
        }
        if (carSpeed <= 60) {
            System.out.println("Если скорость " + carSpeed + " км/ч то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int ageHuman = 15;

        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + " то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + " то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " то его место в университете");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " то ему пора ходить на работу");
        }
        System.out.println("Задача 5");
        int ageChild = 6;

        if (ageChild <5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int numberTiket = 15;
        int allTiket = 102;
        int sitTiket = 60 - numberTiket;
        int stayTiket = allTiket - numberTiket;

        if (numberTiket <= 102 && numberTiket <= 60) {
            System.out.println("Место в вагоне есть, оно сидячее, сидячих мест осталось " + sitTiket);
        }
        if (numberTiket <= 102 && numberTiket > 60) {
            System.out.println("Место в вагоне есть, оно стоячее, стоячих мест осталось " + stayTiket);
        } else if (numberTiket > 102) {
            System.out.println("Мест в вагоне нет");
        }
        System.out.println("Задача 7");
        int one =3;
        int two = 2;
        int three = 1;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число - " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число - " + two);
        } else {
            System.out.println("Самое большое число - " + three);
        }

    }
}