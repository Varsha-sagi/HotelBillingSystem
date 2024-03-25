import java.util.Scanner;

public class Reservation  {
    public static String type="";

    static Scanner sc=new Scanner(System.in);
    public static void bookroom() {
        System.out.print("1.Enter the type of Room : \n ->King size \n" +
                "->Queen Size \n ->Cozy");
        type=sc.next();
        if(type=="King Size"){
            System.out.print("Rate = 10,100");
        }
        else if(type=="Queen Size"){
            System.out.print("Rate = 8,000");
        }
        else{
            System.out.print("Rate = 5,000");
        }
        System.out.println("2.CkeckIn :");
        sc.next();
        System.out.println("3. Estimated CheckOut : ");
        sc.next();
    }
}
