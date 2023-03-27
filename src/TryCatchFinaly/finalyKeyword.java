package TryCatchFinaly;

public class finalyKeyword {
    public static void main(String[] args) {
        String a=null;

        try {
            a.concat("b");
        } catch (NullPointerException e) {
            a="ebru";
            System.out.println(a);

        } finally {
            System.out.println(a.concat("c"));

        }
        System.out.println(a);
    }
}
