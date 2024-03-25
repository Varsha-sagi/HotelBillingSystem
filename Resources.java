public class Resources {
    Resources res=new Resources();
    public static void roomavailable() {
        int s=0;
        System.out.print("         Room No      | Room Name | amount");
        for(int i=100;i<=110;i++){
            System.out.println();
            System.out.print("Room :"+i+" is Present - ");

            if(s==0){
                System.out.print("King Size  - 10,100");
                i+=2;
                s=1;
            }
            else if(s==1){
                System.out.print("Queen Size - 8,000");
                i+=1;
                if(i>5){
                    s=2;
                }
            }
            else{
                System.out.print("Cozy       - 5,0000");
                i+=2;
            }
            System.out.println();
        }
    }


    public static void roomrate() {
        System.out.print("Rates");
        System.out.println("1. Rs.10,100");
        System.out.println("2. Rs.8,000");
        System.out.println("3. Rs.5,000");
    }
}
