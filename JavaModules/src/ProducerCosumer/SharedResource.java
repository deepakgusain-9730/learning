package ProducerCosumer;


import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    Queue<Integer> queue = new LinkedList<>();

    public int bufferSize = 0;

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int val){
        while(queue.size() == bufferSize){
            try {
//                wait till queue size is same as bufferSize
                wait();
            }catch (InterruptedException e){
            e.printStackTrace();
            }
        }
//        Add value to queue
        queue.add(val);
        System.out.println("Produced " + val);
        notify();
    }

    public synchronized void consume(){
        while(queue.isEmpty()){
            try {
//                wait till there is no message in the queue
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
//        consume from queue
        int value = queue.remove();
        System.out.println("Consumed: " + value);
        notify();
    }
}
