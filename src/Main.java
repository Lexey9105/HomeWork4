public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }


        // Задача 2
        int airTemperature = -5;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " градусов, то можно идти без шапки");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, то нужно надеть шапку");
        }


        // Задача 3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость больше " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }


        // Задача 4
        int trueAge = 50;
        boolean babyAge = trueAge < 2 && trueAge > 0;
        boolean kinderGardenAge = trueAge >= 2 && trueAge <= 6;
        boolean schoolAge = trueAge >= 7 && trueAge < 18;
        boolean higherEducationAge = trueAge >= 18 && trueAge < 24;
        boolean workAge = trueAge >= 24 && trueAge < 65;
        boolean pensionAge = trueAge >= 65;
        if (kinderGardenAge) {
            System.out.println("Если возраст человека равен " + trueAge + " то ему нужно ходить в детский сад");
        } else if (schoolAge) {
            System.out.println("Если возраст человека равен " + trueAge + " то ему нужно ходить в щколу");
        } else if (higherEducationAge) {
            System.out.println("Если возраст человека равен " + trueAge + " то ему нужно ходить в университет");
        } else if (workAge) {
            System.out.println("Если возраст человека равен " + trueAge + " то ему нужно ходить на работу");
        } else if (pensionAge) {
            System.out.println("Если возраст человека равен " + trueAge + " то ему нужно быть на пенсии");
        } else if (babyAge) {
            System.out.println("Если возраст человека равен " + trueAge + " то он находится на попечении у родителей");
        }

        // Задача 5
        int ageTrue = 10;
        boolean presenceMaintainer = true;
        if (ageTrue <= 5) {
            System.out.println("Если ребенку " + ageTrue + " , то он не может кататься на атиракционах");
        } else if (ageTrue > 5 && ageTrue <= 14 && presenceMaintainer) {
            System.out.println("Если ребенку " + ageTrue + " , то он  может кататься на атиракционах в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageTrue>14) {
            System.out.println("Если ребенку " + ageTrue + " , то он  может кататься на атиракционах ,без сопровождения взрослого");
        }
        // Задача 6
        int capacityTrain=102;
        int sitingPlace=60;
        int passengers=100;
         if (passengers<60){System.out.println(" Если в вагоне "+passengers+" пассажиров, то есть сидячие места");}
         else if (passengers>=60&&passengers<102){System.out.println(" Если в вагоне "+passengers+" пассажира, то сидячих мест нет");}
         else if (passengers>=102&&passengers<=102){System.out.println(" Если в вагоне "+passengers+" пассажира, то  мест нет");}

        // Задача 7
        int one=1053;
        int two=73;
        int three=3567;
         if (one>two&&one>three){System.out.println(" Число "+one+" самое большее");}
         else if (two>one&&two>three){System.out.println(" Число "+two+" самое большее");}
         else if (three>one&&three>two){System.out.println(" Число "+three+" самое большее");}


    }
}