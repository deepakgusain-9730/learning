package ThreadLearning;

public class SharedResource {
    boolean isItemPresent = false;

    public void itemPresent() {
        isItemPresent = true;
    }

    public synchronized void addItem(){
        System.out.println("Producer thread calling a notify method");
        isItemPresent = true;
//        notify all threads which are waiting for running and release the current from Monitor lock
        notifyAll();
    }

    public synchronized void consumeItem(){

        System.out.println("Consumer thread inside consumeItem method");
//        Using while because of Spurious wakeups
        while(!isItemPresent) {
            try {
                System.out.println("Consumer thread is waiting");
//                wait till notify doesn't come from other functions
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer thread consumed the item");
        isItemPresent = false;
    }
}
