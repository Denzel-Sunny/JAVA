import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable {
    List<Integer> list;
    
    public Producer(List<Integer> list) {
        this.list = list;
    }
    
    @Override
    public void run() {
        try {
            synchronized (list) {
                int counter = 0;
                while (counter < 5) {
                    if (list.size() > 0) {
                        System.out.println("Shared list is full, waiting for the consumer to consume");
                        list.wait();
                    } else {
                        produce();
                        counter++;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void produce() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(5);
            list.add(i);
            System.out.println("Producer produced the element: " + i);
        }
        list.notify();
    }
}

class Consumer implements Runnable {
    List<Integer> list;
    
    public Consumer(List<Integer> list) {
        this.list = list;
    }
    
    @Override
    public void run() {
        try {
            int counter = 0;
            while (counter < 5) {
                synchronized (list) {
                    if (list.size() == 0) {
                        System.out.println("Shared list is empty, waiting for the producer to produce");
                        list.wait();
                    } else {
                        consume();
                        counter++;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void consume() throws InterruptedException {
        while (!list.isEmpty()) {
            Thread.sleep(5);
            System.out.println("Consumed the element: " + list.remove(0));
        }
        list.notify();
    }
}

public class consu_producer {
    public static void main(String[] args) throws Exception {
    
       System.out.println("Name: Denzel Sunny");
System.out.println("Addmission_no: 22MCA022");
System.out.println("Course ID & Code : OOP LAB, 20MCA132");
System.out.println("Date: 23/06/2023");
System.out.println("____________________________________\n");

    
    
    
        List<Integer> list = new ArrayList<Integer>();
        Thread produce = new Thread(new Producer(list));
        Thread consume = new Thread(new Consumer(list));
        produce.start();
        consume.start();
    }
}

