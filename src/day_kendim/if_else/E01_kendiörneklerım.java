package day_kendim.if_else;

import java.util.Scanner;

public class E01_kendiörneklerım {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütefen 3 kenar uzunluğu giribiz");

        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3= scan.nextInt();

        if(k1==k2 && k1==k3 && k1>0){
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("eskenar ucgen değil");
        }
    }

}
