public class Evenodd{
    public static void main(String[] args) {
        int n=11;
        int Bitmas= 1;
        if((n & Bitmas)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}