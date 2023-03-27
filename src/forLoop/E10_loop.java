package forLoop;

public class E10_loop {
    public static void main(String[] args) {
        int bas=35;
        int bit= -35;
        
        int sayiToplamı=0;
if(bas<=bit){

    for (int i = bas; i <=bit ; i++) {
        sayiToplamı+=i;


    }
}else {
    for (int i = bas; i >=bit; i--) {
        sayiToplamı+=i;

    }
}
        System.out.println(sayiToplamı);
    }
}
