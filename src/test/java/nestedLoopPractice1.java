public class nestedLoopPractice1 {

//    1 2 3 4
//    5 6 7
//    8 9
//    10
    public static void main(String[] args) {
        int limit = 5;
        int counter =3;
        int j =1;
        outerloop:
        for (int i=0; i< 5; i++){
            innerloop:
            for (;j<limit; j++){
                System.out.print(j + " ");
        }
            if(limit<=10){
                j = limit;
                limit =limit+counter;
                counter--;
                System.out.println();
            }else{
                break outerloop;
            }
        }

    }
}
