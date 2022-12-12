public class nestedLoopPractice4 {
//    3
//    3 6
//    3 6 12
//    3 6 12 18

    public static void main(String[] args) {
        int k =1;
        outerloop:
        for (int i=1; i< 5; i++){
            innerloop:
            for ( int j =0;j<i; j++){
                System.out.print(3*k + " ");
                k++;
        }
            System.out.println();
        }

    }
}
