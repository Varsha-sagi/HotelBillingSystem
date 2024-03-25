import java.util.Scanner;

class Billing {
    int rate =100;
    Billing s=new Billing();
    static Scanner sc=new Scanner(System.in);
}



class Online extends Billing{


    Billing s=new Billing();
    public  void online() {
    System.out.println("Enter Your Room Rate:"+s.rate);

    sc.nextInt();
    System.out.println("Enter Your 4 digit card No:");
    sc.nextInt();
    System.out.println("Payment Successful");

}
}

class Offline extends Billing{
    public  void offline() {
        System.out.println("Enter Your Room Rate:");
        sc.nextInt();
        System.out.println("Paid in cash");
    }
}
