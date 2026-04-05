import java.util.Scanner;



public class Calcultor {
    public static void main(String args[]){
        System.out.println("calculator");
Scanner sc = new Scanner(System.in );
int choice ;


        do{
            System.out.println("=== Simple calculator ===");
            System.out.println("1.Addition ");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");


            choice = sc.nextInt();

            if(choice >=1 && choice <=4){
                System.out.println("Enter first number");
                double num1 = sc.nextDouble();


            System.out.println("Enter Second number");
            double num2 = sc.nextDouble();



            switch (choice) {
                case 1:
                    System.out.println("Result= "+ (num1+num2));
                    
                    break;
                    

                    case 2:
                    System.out.println("Result ="+ (num1-num2));
                    break;


                    case 3: 
                    System.out.println("Result ="+ (num1*num2));
                    break;
    

                      case 4 :
                        if (num2 != 0){
                            System.out.println("Result = "+(num1/num2));
                        }
                        else{
                            System.out.println("Error  : Divison by zero not allowed  ");
                        }
            
                    break;
            }

                        } else if(choice != 5){
                            System.out.println("Invalid  choice ! Try again 8");
                        }

        }
        while(choice != 5);

        System.out.println("calcultor closed . Thank You");
        sc.close();
                    
                    
        }
}
