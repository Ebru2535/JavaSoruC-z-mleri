package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        // kullanıcıdan 2 sayı alın
        // ve kullanıcıya istediğiişlemi sorun
        // + - * / işsretlerinden hangını gireerse
        // 2 sayı  için o işlemi yapın
        // bu işaretlerden biribni girmezse
        // "yanlış işlem tercii" yazdırın
         int sayı=10;
         int sayı1= 20;

         char islem='+';
         // switch ( değiştirme) ile yapalım
        switch (islem){
            case '+' :
                System.out.println("sayıalrın toplamı : " +(sayı+sayı1));
                break;
            case '-':
                System.out.println("sayıların farkı :"+(sayı-sayı1));
                break;
            case'*':
                System.out.println("sayıların çarpımmı:"+ (sayı*sayı1));
                break;
            case '/':
                System.out.println("sayıların bölümü :" +(sayı/sayı1));
                break;
            default:
                System.out.println("yanlış işlem tercihi");


        }
    }
}
