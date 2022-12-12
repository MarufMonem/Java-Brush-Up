public class nestedLoopPractice3 {
//    1
//    2 3
//    4 5 6
//    7 8 9 10

    public static void main(String[] args) {

        outerloop:
        for (int i=0; i< 5; i++){
            innerloop:
            for ( int j =1;j<=i; j++){
                System.out.print(j + " ");
        }
            System.out.println();
        }

    }
}
