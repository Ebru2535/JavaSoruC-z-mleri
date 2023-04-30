package Interface;

public interface E01_Interface {
    void method1();

    public default void methot2(){
        System.out.println(" default methot interace nın istisnası");

    }
    public static void method3 (){
        System.out.println("interface nın istasnası static method");
    }
}
