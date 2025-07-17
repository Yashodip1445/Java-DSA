public class ArmstrongNo {
public static boolean isArmstrong(int n){
    int copyN =n;
    int sumOfCubes = 0;
    while(n!=0){
        int dig = n%10;
        sumOfCubes +=(dig*dig*dig);
        n=n/10;

    }
    return sumOfCubes==copyN;
}
    public static void main(String[] args) {
        int n = 111;
        if(isArmstrong(n)){
            System.out.println("is an Amstrong ");
            
        }
        else{
            System.out.println("is not amstrong ");
        }

    }
}