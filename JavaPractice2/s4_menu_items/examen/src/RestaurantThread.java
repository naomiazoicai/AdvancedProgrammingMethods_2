import java.util.ArrayList;

//public class RestaurantThread {
//    private final Object lock = new Object();
//
//    public void orderingAndPreparing(MenuItem menuItem) throws InterruptedException {
//        Thread orderingThread = new Thread(() -> {
//            while (true) {
//                for (int i = 0; i < 3; i++) {
//                    try {
//                        synchronized (lock) {
//                            Thread.sleep(1000);
//                            lock.notify();
//                            System.out.println("Customer: Placing order and waiting 1 second");
//                            lock.wait();
//                        }
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }, "Customer");
//
//        Thread preparingThread = new Thread(() -> {
//            while (true)
//            {
//                try{
//                    synchronized (lock){
//                        System.out.println("Chef: Preparing orders!");
//                        lock.wait();
//                        lock.notify();
//                    }
//                }
//                catch (InterruptedException e)
//                {
//                    throw new RuntimeException(e);
//                }
//            }
//        }, "Chef");
//        orderingThread.start();
//        preparingThread.start();
//        orderingThread.join();
//        preparingThread.join();
//    }
//
//}
public class RestaurantThread {
    private final Object lock = new Object();
    private final ArrayList<MenuItem> menu;

    public RestaurantThread(ArrayList<MenuItem> menu)
    {
        this.menu = menu;
    }

    public void simulateOrders()
    {
        Thread customerThread = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    try {
                        synchronized (lock) {
                            System.out.println("Customer: Placing order and waiting 1 second");
                            lock.notify();
                            lock.wait();
                            Thread.sleep(1000);

                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        }, "Customer");

        Thread preparingThread = new Thread(() -> {
            while (true)
            {
                try{
                    synchronized (lock){
                        System.out.println("Chef: Preparing orders!");
                        lock.notify();
                        lock.wait();
                    }
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }, "Chef");
        customerThread.start();
        preparingThread.start();
    }
}