public class nestedLoopPracticeOptimized {
//    1 2 3 4
//    5 6 7
//    8 9
//    10
    public static void main(String[] args) {
        int k= 1;
        outerloop:
        for (int i=0; i< 5; i++){
            innerloop:
            for ( int j =0;j<4-i; j++){
                System.out.print(k + " ");
                k++;
        }
            System.out.println();
        }

    }
}
