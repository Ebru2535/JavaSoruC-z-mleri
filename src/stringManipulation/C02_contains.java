package stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str= "Java ogren, mutlu ol";

                // str mutlu iceriyor mu?

        System.out.println(str.contains("mutlu")); // true
        //charSequence : char dizisi

        System.out.println(str.contains("j")); // false
        System.out.println(str.contains(" ")); // true
        // contains  methodu kaç tane olup oladığına değil
        // var olup olamdığına bakar
        System.out.println(str.contains("mutlu")&& str.contains("ol")); //true
    }
}
