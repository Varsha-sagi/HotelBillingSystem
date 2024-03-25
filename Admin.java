
import java.util.*;
public class Admin {

    private static int id=0;
    private static String name="";
    private static String password="";
    static Scanner sc=new Scanner(System.in);

    static void create(){
         System.out.print("User ID : ");
         id=sc.nextInt();
         System.out.print("User Name : ");
         name=sc.next();
         System.out.print("Password : ");
         password=sc.next();
    }

    static void read(){
        System.out.print("User Name :  ");
        name=sc.next();
        System.out.println(name+" is Present in Room No : 700");
        System.out.println("CheckedIn on : 24/02/24");
        System.out.println("CheckedOut status : no\n");

    }

    static void update(){
        System.out.print("User Name :  ");
        name=sc.next();
        System.out.println(name+" is Present in Room No : 650");
        System.out.println("Wants to extend? : yes");
        System.out.println("Payment Done: yes\n");

    }

    static void delete(){
        System.out.print("User Name :  ");
        name=sc.next();
        System.out.println(name+" was Present in Room No : 700");
        System.out.println("Checked out on : 27/02/24");
        System.out.println("The user info is deleted....\n");
    }


}
