package day_kendim.my_works;

public class E09_repllace {
    public static void main(String[] args) {
        String a="15.15 $";
        String b="14.14 $";
        a=a.replaceAll("\\D",""); // 1515
        b=b.replaceAll("\\D",""); // 1414

        double ab=Double.parseDouble(a);
        double cd=Double.parseDouble(b);
        System.out.println((ab+cd)/100+ "$"); // 29.29$
    }
}
