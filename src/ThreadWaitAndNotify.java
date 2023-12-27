class Calculator extends Thread{
    long sum = 0;
    public void run(){
        synchronized (this){
            for (int i = 0; i < 1000000; i++) {
                sum+=i;
            }
            notify();
        }
    }
}

public class ThreadWaitAndNotify{
    public static void main(String[] args) {
        Calculator thread = new Calculator();
        thread.start();
        synchronized (thread){
//            try {
//                thread.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(thread.sum);
    }
}

