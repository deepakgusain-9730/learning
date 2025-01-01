package ThreadLearning;

public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {

//            Lambda expression to invoke method inside thread
            try {
                Thread.sleep(3000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            sharedResource.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            sharedResource.consumeItem();
        });

        producerThread.start();
        consumerThread.start();


    }
}
