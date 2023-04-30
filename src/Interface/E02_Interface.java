package Interface;

public class E02_Interface implements E01_Interface{
    @Override
    public void method1() {

    }

    public static void main(String[] args) {
        E01_Interface.method3();
        E02_Interface obj= new E02_Interface();
        obj.methot2();
    }
    //static keywwoerd ile oluşturulan istsiani methotlara
    // static yolla ulaşılır

    // default ile oluşturaln methoda obje üzerinden ulaşılır