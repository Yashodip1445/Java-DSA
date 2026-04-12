public class Matrix {

    public static void main(String[] args) {
        
        // take 2D Arrays 
        float x[][ ]= {{1.1f , 1.2f, 1.3f, 1.4f},
        {2.1f , 2.2f, 2.3f, 2.4f},
        {3.1f , 3.2f, 3.3f, 1.4f} } ;

        // read and display the array element 
        System.out.println("In the array element ");
        for(int i =0; i<3; i++){
            for (int j = 0 ; j<4; j++){
                System.out.println(x[i][j]+"\t");
            }

            System.out.println();
        }
        
    }
    
}
