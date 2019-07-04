package semaphores;

import java.util.concurrent.Semaphore;

public final class CCAABAA {

    private static final int COUNT = 30;
    private static int COUNTER = 0;
    private static final int STEP = 7;
    private static final Semaphore a = new Semaphore(0, true);
    private static final Semaphore b = new Semaphore(6, true);
    private static final Semaphore c = new Semaphore(0, true);
    public static void main(String[] args) {
        new CCAABAA.A().start();
        new CCAABAA.B().start();
        new CCAABAA.C().start();
       
    }

    private static final class A extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT*4; i++) {
                    a.acquire();
                    myPrint("A ");
                    b.release(3);
                
                   
                    
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static final class B extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                  
                   b.acquire(6);
                   c.release(2);
                   b.acquire(6);
                   a.release(2);
                   b.acquire(6);
                  
                   myPrint("B ");
                   a.release(2);
                 
                    
                
                   
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static final class C extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT*2; i++) {
                    
                    c.acquire();
                    
                    myPrint("C ");
                    b.release(3);
                    
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static synchronized void myPrint(String s) {
        COUNTER++;
        System.out.print(s);
        if (COUNTER == STEP) {
            COUNTER = 0;
            System.out.println();
        }
    }

}

