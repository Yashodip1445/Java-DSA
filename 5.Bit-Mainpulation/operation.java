public class operation {
    public static int GetIthBit(int n, int i) {
        int Bitmask = 1 << i;
        if ((n & Bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetIthBit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;
    }

    public static int ClearIthBit(int n, int i) {
        int Bitmask = ~(1 << i);
        return n & Bitmask;
    }

    public static int UpdateIthBit(int n , int i,int newBit){
        if(newBit ==0){
            return ClearIthBit(n,i);

        }else{
           return SetIthBit(n,i) ;
        }
    }
    // n = ClearIthBit(n,i);
    // int Bitmask =newBit<<i; 
    // return n | Bitmask ;

    public static int ClearIBit( int n , int i){

        int Bitmask =(~0)<<i;
        return n & Bitmask;
    }


    public static void main(String[] args) {
        // // Get Ith Bit
        // System.out.println(GetIthBit(10, 2));
        // System.out.println(SetIthBit(10, 2));
        // System.out.println(ClearIthBit(10, 1));
        // System.out.println(UpdateIthBit(10 ,2,1));
        System.out.println(ClearIBit(15, 2));
        

       

        
    }
}
