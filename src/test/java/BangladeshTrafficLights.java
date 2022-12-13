public class BangladeshTrafficLights implements trafficLights{

    @Override
    public void green() {
        System.out.println("Go");
    }

    @Override
    public void red() {
        System.out.println("Stop");
    }

    @Override
    public void yellow() {
        System.out.println("Wait");
    }
    public void orange(){
        System.out.println("Only emergency vehicles");
    }

    public static void main(String[] args) {
        BangladeshTrafficLights bd = new BangladeshTrafficLights();
        bd.green();
        bd.red();
        bd.yellow();
        bd.orange();
        System.out.println(number);


//        System.out.println("--------------");
//        trafficLights tl = new BangladeshTrafficLights();
//        tl.green();
//        tl.red();
//        tl.yellow();
//        tl.orange();
    }
}
