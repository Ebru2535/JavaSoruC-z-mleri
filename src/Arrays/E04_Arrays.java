package Arrays;

public class E04_Arrays {
    public static void main(String[] args) {
        String [] arr= {"Melike","Ebru","Savas","Elif","AhmetEren"};
ebUzunenKısaYazdır(arr);
    }
    public static void ebUzunenKısaYazdır(String []arr){
        String enUzunklme= arr[0];
        String enKısaklme=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>enUzunklme.length()){
                enUzunklme=arr[i];

            }
            if(arr[i].length()<enKısaklme.length()){
                enKısaklme=arr[i];
            }
        }
        System.out.println("arraydaki en zuun kelime:"+enUzunklme);
        System.out.println("arraydaki en kısa kelime :"+enKısaklme);

    }
}
