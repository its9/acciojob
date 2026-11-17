package extend.inbuilt.threadclass;

public class DemoThread1 extends Thread{

    public DemoThread1(){
        start(); // it will start or initialize the thread
    }

    @Override
    public void run() { // it will start running the thread
        try {
            System.out.println("Part1 - printing the numbers in ascending order 1-10");
            for (int i = 1; i <= 10; i++) {
                System.out.println("i is : " + i);
                Thread.sleep(1); // this will make thread to sleep for 1ms = 0.001s
            }
        } catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
    }
}
