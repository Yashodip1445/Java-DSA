import java.util.*;

public class main {
    public static void main(String[] args) {
        // int age = 13 ;
        // if (age>=22){
        //     System.out.println("adult ");

        // }
        // else if(age>=13 && age>18){
        //     System.out.println("Teenager");


        // }else{
        //     System.out.println("child");
        // }
        


        //1 ==> Income tax calulator  
        /*
         * income <5L  0% tax
         * 
         * income betn 5-10L 20% tax
         * 
         * income >10L 30% tax
         */
        Scanner Sc = new Scanner(System.in);
        int income =Sc.nextInt();
        int tax;
        if (income <500000){
            tax =0;
        }
        else if (income >=500000 && income <1000000) {
            tax=(int)(income *0.3);
        }
        else{
            System.out.println("your tax is :");
        }
    }
}
