package ProducerCosumer;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

//        Set buffer size for queue
        sharedResource.setBufferSize(2);

        Thread produce = new Thread(()->{
           for (int i = 0; i < 10; i++) {
               sharedResource.produce(i);
           }

        });

        Thread consume = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                sharedResource.consume();
            }
        });

        produce.start();
        consume.start();
    }
}
