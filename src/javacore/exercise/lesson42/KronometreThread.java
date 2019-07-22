package javacore.exercise.lesson42;

public class KronometreThread implements Runnable {

    private Thread threadvalue;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor");


        try {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread Name : " + threadName + "----" + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Kesildi" + threadName);
        }

        System.out.println("Thread Bitti : " + threadName);

    }

    public void start() {
        System.out.println("Thread nesnesi oluşuyor..");
        if (threadvalue == null) {
            threadvalue = new Thread(this, threadName);
            threadvalue.start();
        }
    }

}
