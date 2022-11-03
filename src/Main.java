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


    }
}