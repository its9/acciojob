package implement.runnableinterface;

public class SampleThread1 implements Runnable{

    public SampleThread1(){
        Thread thread1 = new Thread(this,"SampleThread1");
        thread1.start();
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
