package DosyaOkuma;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dosyaOkumaScanner {
    public static void main(String[] args) {
        File file = new File("src/DosyaOkuma/ebru.file");
        try {
            Scanner scanner= new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }



        } catch (FileNotFoundException e) {

        }
    }
}
