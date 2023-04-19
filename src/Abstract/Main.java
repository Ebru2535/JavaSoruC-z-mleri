package Abstract;

public class Main {
    public static void main(String[] args) {


        CustomerManager customerManager = new CustomerManager();
        customerManager.ebru=new SqlServerDateBaseManager();
         customerManager.getCustomers();

    }
}