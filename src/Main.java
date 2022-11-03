public class Main {
    public static void main(String[] args) {
        System.out.println();
       //task3.1//
        int a = 1;
        System.out.println(" Значение переменной a с типом int равно " + a);
        byte b = 2;
        System.out.println(" Значение переменной b с типом byte равно " + b);
        short c = 3;
        System.out.println(" Значение переменной c с типом short равно " + c);
        long d = 4;
        System.out.println(" Значение переменной d с типом long равно " + d);
        float e = 5f;
        System.out.println(" Значение переменной e с типом float равно " + e);
        double f = 6;
        System.out.println(" Значение переменной f с типом double равно " + f);

        //task3.2//
        float z = 27.12f;
        System.out.println(" float z is " + z);
        long l = 987678965549L;
        System.out.println(" long l is " + l);
        float y = 2.786f;
        System.out.println(" float y is " + y);
        boolean zen = false;
        int me = 569;
        System.out.println(" int me is " + me);
        short my = -159;
        System.out.println(" short my is " + my);
        short Me = 27897;
        System.out.println(" short Me is " + Me);
        byte all = 67;
        System.out.println(" byte all is " + all);

        //task3.3//
        int LP = 23;
        int AS = 27;
        int EA = 30;
        short paper = 480;
        System.out.println(" На каждого ученика рассчитано " + paper / (LP+AS+EA) + " листов бумаги");

        //task3.4//
        byte machin2Min = 16;
        System.out.println(" За 1 минуту машина произвела " + machin2Min/2 + " штук бутылок ");
        byte machin1Min = 8;
        System.out.println(" За 20 минут машина произвела " + machin1Min * 20 + " штук бутылок ");
        System.out.println(" В сутки машина произвела " + machin1Min * 60 * 24 + " штук бутылок ");
        short machinPerDay = 11520;
        System.out.println(" За 3 дня машина произвела " + machinPerDay * 3 + " штук бутылок ");
        System.out.println(" За месяц машина произвела " + machinPerDay * 30 + " штук бутылок ");

        //task3.5//
        byte allPaintJars = 120;
        byte whyteJarPerClass = 2;
        byte brownJarPerClass = 4;
        int jarsPerClass = whyteJarPerClass + brownJarPerClass;
        int tptalCkasses = allPaintJars / jarsPerClass;
        int totalWhytePaintJars = whyteJarPerClass * tptalCkasses;
        int totalBrownPaintJars = brownJarPerClass * tptalCkasses;
        System.out.println(" В школе, где " + tptalCkasses + " классов, нужно " + totalWhytePaintJars + " банок белой краски и " + totalBrownPaintJars + " банок коричневой краски");

//task3.6//
        float banano = 80f;
        float milk = 105f;
        float icecream = 100f;
        float egg = 70f;
        System.out.println(" Завтрак спортсмена составляет " + (banano*5 + milk*2 + icecream*2 + egg*4) + " грамм или " + ((banano * 5) + (milk * 2) + (icecream * 2) + (egg * 4)) / 1000 + " килограмм ");

        //task 3.7//
        float grPerKg = 7*1000f;
        int minWeightDown = 250;
        int maxWeightightDown = 500;
        int middleWeightDown = (maxWeightightDown + minWeightDown) / 2;
        System.out.println(" При сбрасывании по " + minWeightDown + " грамм в день потребуется " + grPerKg / minWeightDown + " дней");
        System.out.println(" При сбрасывании по " + maxWeightightDown + " грамм в день потребуется " + grPerKg / maxWeightightDown + " дней");
        System.out.println(" При сбрасывании по " + middleWeightDown + " грамм в день потребуется " + grPerKg / middleWeightDown + " дней");

        //task3.8//
        int mashaNowPerMonth = 67760;
        int mashaNowPerYear = mashaNowPerMonth*12;
        float mashaNextMonth = mashaNowPerMonth+(mashaNowPerMonth*0.1f);
        double mashaNextYear = mashaNextMonth*12;
        System.out.println(" Маша теперь получает " + mashaNextMonth + " рублей. Годовой доход вырос на " + (mashaNextYear - mashaNowPerYear) + " рублей");
        int denisNowPerMonth = 83690;
        int denisNowPerYear = denisNowPerMonth*12;
        float denisNextMonth = denisNowPerMonth+(denisNowPerMonth*0.1f);
        double denisNextYear = denisNextMonth*12;
        System.out.println(" Денис теперь получает " + denisNextMonth + " рублей. Годовой доход вырос на " + (denisNextYear - denisNowPerYear) + " рублей");
        int ChristinaNowPerMonth = 76230;
        int ChristinaNowPerYear = ChristinaNowPerMonth*12;
        float ChristinaNextMonth = ChristinaNowPerMonth+(ChristinaNowPerMonth*0.1f);
        double ChristinaNextYear = ChristinaNextMonth*12;
        System.out.println(" Кристина теперь получает " + ChristinaNextMonth + " рубля. Годовой доход вырос на " + (ChristinaNextYear - ChristinaNowPerYear) + " рублей");


    }
}