package semaphores;

import java.util.concurrent.Semaphore;

public final class CBBA {

    private static final int COUNT = 30;
    private static int COUNTER = 0;
    private static final int STEP = 4;
    private static final Semaphore a = new Semaphore(0, true);
    private static final Semaphore b = new Semaphore(0, true);
    private static final Semaphore c = new Semaphore(1, true);
    public static void main(String[] args) {
        new CBBA.A().start();
        new CBBA.B().start();
        new CBBA.C().start();
       
    }

    private static final class A extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                    a.acquire();
                    myPrint("A ");
                    c.release();
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static final class B extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT*2; i++) {
                   b.acquire();
                    myPrint("B ");
                    
                    a.release();
                    
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static final class C extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                    
                    c.acquire();
                    
                    myPrint("C ");
                    b.release();
                    b.release();
                    a.acquire();
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
