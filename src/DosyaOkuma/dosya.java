package DosyaOkuma;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class dosya {
    public static void main(String[] args) {
        String dosyaYolu="src/DosyaOkuma/ebru.file";
        File file = new File(dosyaYolu);

        int k=0;
        try {
            FileInputStream charOku= new FileInputStream(file);
            //türkçe karakterler için okuması için
            InputStreamReader isr = new InputStreamReader(charOku, StandardCharsets.UTF_8);
            while (true){
               int charint=  isr.read();

              if (charint<0)
                  break;
               char s = (char)charint;

                System.out.print(s);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yalış olabilir");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
