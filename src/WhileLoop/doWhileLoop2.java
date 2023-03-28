package WhileLoop;

public class doWhileLoop2 {
    public static void main(String[] args) {
        // k harfınden t harfine kadar olan harleri sırala

        char harf='k';
        do{
            System.out.print(harf+ " ");
            harf++;

        }while (harf<='t');
    }
}
