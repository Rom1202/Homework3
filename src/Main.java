public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 100_000;
        byte b = 120;
        short c = 32_000;
        long d = 1_000_000;
        float e = 5.5f;
        double f = 7.8;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int totalStudents = lyudmila + anna + ekaterina;
        System.out.println(totalStudents); // всего учеников
        int sheets = 480 / totalStudents;
        System.out.println("На каждого ученика расчитано " + sheets + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minute = 2;
        int oneMinute = bottles / minute;
        System.out.println("Бутылок в минуту " + oneMinute);
        byte timeWork = 20;
        int twentyWork = oneMinute * timeWork;
        System.out.println("За " + timeWork + " минут машина произвела " + twentyWork + " штук бутылок");
       byte timeWork2 = 1;
        int oneHour = timeWork * 3;
        int oneDay = oneHour * 24;
        int workDay = oneDay * oneMinute;
        System.out.println("За " + timeWork2 + "  день машина произвела " + workDay + " штук бутылок");
        byte timeWork3 = 3;
        int thereDay = workDay * timeWork3;
        System.out.println("За " + timeWork3 + " дня машина произвела " + thereDay + " штук бутылок");
        byte month = 31;
        int oneMonth = workDay * month;
        System.out.println("За " + timeWork2 + " месяц машина произвела " + oneMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int whiteBrown = white + brown;
        int classRoom = totalCans / whiteBrown;// Всего клаассов
        int totalWhite = white * classRoom;// Всего нужно белой краски
        int totalBrown = brown * classRoom;// Всего нужно коричневой краски
        System.out.println("В школе,где " + classRoom + " классов,нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;// шт бананов
        byte oneBanana = 80;// весит гр один банан
        short milk = 200;// мл молока
        byte omeMilk = 105;// гр в 100 мл молока
        byte iceCream = 2;// 2 Брикета мороженого
        byte twoIceCream = 100; // 2 мороженого весят 100 гр
        byte eggs = 4;//шт яиц
        byte fourEggs = 70;// гр в 1 яйце
        int grPerKg = 1000;
        int totalBanana = banana * oneBanana;// вес в гр 5 бананов
        int totalMilk = omeMilk * iceCream;// вес в гр молока
        int totalEggs = eggs * fourEggs; // Вес в гр 4 яиц
        int totalGram = totalBanana + totalMilk + totalEggs + twoIceCream;//Вес в гр всего завтрака
        System.out.println(totalGram + " грамм");
        float kg = totalGram / (float)grPerKg;
        System.out.println(kg + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte kg = 7;// нужно сбросить 7 кг
        double oneDiet = 0.250;//250 гр спортсмен будет терять в день
        double twoDiet = 0.500;//500 гр спортсмен будет терять в день
        double one = kg / oneDiet;
        System.out.println("За " + one + " дней ");
        double two = kg / twoDiet;
        System.out.println("За " + two + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int Masha = 67_760;
        double newMasha = Masha * 0.10;//доплата 10 %
        double totalMasha =newMasha + Masha;
        double salaryDifference = newMasha * 12;
        System.out.println("Маша теперь получает " + totalMasha + " рублей.Годовой доход вырос вырос на " + salaryDifference + " рублей");
        int Denis = 83_690;//Зарплата Дениса
        double additionalPayment = Denis * 0.10;//доплата 10%
        double newSalary = Denis + additionalPayment;//новая зарплата
        double salaryDifference2 = additionalPayment * 12;
        System.out.println("Денис теперь получает " + newSalary + " рублей.Годовой доход вырос на " + salaryDifference2 + " рублей");
        int Christina = 76_230;//Зарплата Кристины
        double kristinaAward = Christina * 0.10;//доплата 10%
        double newKristina = Christina + kristinaAward;//новая зарплата
        double annualDifference = kristinaAward * 12;
        System.out.println("Кристина теперь получает " + newKristina + " рублей.Годовой доход вырос на " + annualDifference + " рублей");
    }
}