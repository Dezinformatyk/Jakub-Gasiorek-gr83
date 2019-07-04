package semaphores;

import java.util.concurrent.Semaphore;

public final class AABCCC {

    private static final int COUNT = 30;
    private static int COUNTER = 0;
    private static final int STEP = 6;
    private static final Semaphore a = new Semaphore(0, true);
    private static final Semaphore b = new Semaphore(6, true);
    private static final Semaphore c = new Semaphore(0, true);
    public static void main(String[] args) {
        new AABCCC.A().start();
        new AABCCC.B().start();
        new AABCCC.C().start();
       
    }

    private static final class A extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT*2; i++) {
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
                   a.release(2);
                   b.acquire(6);
                    myPrint("B ");
                    c.release(3);
                    
                
                   
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static final class C extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT*3; i++) {
                    
                    c.acquire();
                    
                    myPrint("C ");
                    b.release(2);
                    
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

