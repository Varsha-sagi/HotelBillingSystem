import java.util.*;

public class HotelBillingSystem {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        BillingSystem hotel=new BillingSystem();
        System.out.println("*****WELCOME TO OUR HOTEL*****\n");
        System.out.println("OBJECTIVE : \n"+"Welcome to our hotel page\n"+
                "Have a nice stay while you are with us\n\n");


        while (true) {
            System.out.println("Select Your Choice");
            System.out.println("1.Admin Panel");
            System.out.println("2.User Panel");
            System.out.println("3.BookRooms");
            System.out.println("4.Payment");
            System.out.println("5.Exit the page");

            int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        hotel.adminpanel();
                        break;
                    case 2:
                        hotel.userpanel();
                        break;
                    case 3:
                        hotel.bookrooms();
                        break;
                    case 4:
                        hotel.payment();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.print("Invalid Entry");
                        break;
                }
        }

    }
}
