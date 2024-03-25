import java.net.http.HttpRequest;
import java.util.*;
public class BillingSystem {
    static Scanner sc=new Scanner(System.in);
    User v=new User();
    private Online s;

    public void adminpanel() {
        int s=0;
        while(s==0){
            System.out.println("\nSelect Your Choice");
            System.out.println("1.Create Account");
            System.out.println("2.Read Content");
            System.out.println("3.Update room details");
            System.out.println("4.Delete information");
            System.out.println("5.Exit the page\n");
            int choice = sc.nextInt();
            if(choice==5){
                s=1;
                break;
            }
            switch (choice) {
                case 1:
                    User.create();
                    break;
                case 2:
                    Admin.read();
                    break;
                case 3:
                    Admin.update();
                    break;
                case 4:
                    Admin.delete();
                    break;
                case 5:
                    s=1;
                    break;
                default:
                    System.out.print("Invalid Entry");
                    break;
            }
        }

    }

   public void userpanel(){

       int s=0;
       while(s==0) {

           System.out.println("Select Your Choice");
           System.out.println("1.Create Account");
           System.out.println("2.Read Content");
           System.out.println("3.CheckRooms");
           System.out.println("4.ReserveRooms");
           System.out.println("5.Exit the page");
           int choice=sc.nextInt();
           if(choice==5){
               s=1;
               break;

           }
           switch (choice) {
               case 1:
                   User.create();
                   break;
               case 2:
                   User.read();
                   break;
               case 3:
                   User.checkrooms();
                   break;
               case 4:
                   User.reservedroom();
                   break;
               default:
                   System.out.print("Invalid Entry");
                   break;
           }
       }
   }

   public void bookrooms(){
          Resources.roomrate();
          Reservation.bookroom();
   }

   public void payment(){
       System.out.println("Select Mode of Payment");
       System.out.println("1.Online");
       System.out.println("2. Offline");
       int i=sc.nextInt();
       if(i==1){
           s.online();
       }
       else{
           s.offline();
       }
   }

}
