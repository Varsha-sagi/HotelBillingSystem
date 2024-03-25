import java.util.ArrayList;
import java.util.Scanner;

public class User {

        private static int id=0;
    private static String name="";
    private static String password="";
    private static Scanner sc=new Scanner(System.in);


    public static void create(){
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

    public static void checkrooms() {
        System.out.print("         Room No      | Room Name | amount");
        for(int i=100;i<=110;i++){
            System.out.println();
            System.out.print("Room :"+i+" is Present - ");

            if(i<=103){
                System.out.print("King Size  - 10,100");
            }
            else if(i>=103&&i<=106){
                System.out.print("Queen Size - 8,000");
            }
            else{
                System.out.print("Cozy       - 5,0000");
            }
            System.out.println();
        }

    }
    public static void reservedroom(){
        Resources.roomavailable();

    }
}
