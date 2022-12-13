public class smallestNumberIn2DArray {
    public static void main(String[] args) {
//        array creation
        int number[][] ={{2,4,5}, {3,4,7}, {10,2,9}};

        int smallest = number[0][0];
        int largest = number[0][0];


        for (int i =0; i <number.length; i++){
            for (int j=0; j < number.length; j++){
                if (number[i][j] < smallest){
                    smallest=number[i][j];
                } else if (largest<number[i][j] ){
                    largest=number[i][j];
                }
            }
        }
        System.out.println("Smallest: " + smallest + " " + "Largest: " + largest);
    }
}
