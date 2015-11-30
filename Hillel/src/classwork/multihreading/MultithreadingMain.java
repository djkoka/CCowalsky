package classwork.multihreading;

/**
 * Created by CCowalsky on 30.11.2015.
 */
public class MultithreadingMain {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("other thread begin");
/*            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                System.out.println("other tread is interrupted");
            }*/

            while (!Thread.currentThread().isInterrupted()){

            }

            System.out.println("other treed end");
        }
        );
        //thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        thread.interrupt();

        System.out.println("main thread end ");
        try {
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
