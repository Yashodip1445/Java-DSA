public class inc {


    public static void printInc(int n){
        

        if(n ==1 ){
            System.out.println(1);        // base case 
            return;
        }
        printInc(n-1);
        System.out.println(n);        // kaam  
    }
    public static void main(String[] args) {
        int n = 5; 
        printInc(n);
    }


}
