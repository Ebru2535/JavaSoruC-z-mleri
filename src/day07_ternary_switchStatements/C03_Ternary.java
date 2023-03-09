package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {
        // kullanıdan alınan değer
        // 100 den büyük se sayıyı 2 ile çarpın
        // 100e eşit veya küçükse sayıya 10 ekleyın
        int input = 45;
        // if else ile yapalm
        if(input>100){
            input*=2;
        }else {
            input+=10;
        }
        System.out.println("if else ile:"+input);

        input= 45;

        input= input>100 ? input*2 : input+10 ;
        System.out.println("ternary ile :"+ input);
    }
}
