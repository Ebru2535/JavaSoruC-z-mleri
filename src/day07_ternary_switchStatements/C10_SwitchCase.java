package day07_ternary_switchStatements;

public class C10_SwitchCase {
    public static void main(String[] args) {
        // kullanıcıdn ISTQB kısaltmasından hangı harfın
        // anlamıını öğrenemk istediğini alın
        // ve girilen harfın karşılığını yadırın
        // I : international S: Software T: Testing Q: Qualifications B: board

        char hharf= 'B';
        switch (hharf){
            case 'I':
            case 'i':
                System.out.println("international");
                break;
            case 'S':
            case's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("yanlış harf  seçimi");
                break;

        }
    }
}
