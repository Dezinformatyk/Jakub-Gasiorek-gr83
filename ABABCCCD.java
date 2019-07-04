package semaphores;

import java.util.concurrent.Semaphore;

public final class ABABCCCD {

    private static final int COUNT = 30;
    private static int COUNTER = 0;
    private static final int STEP = 8;
    private static final Semaphore a = new Semaphore(0, true);
    private static final Semaphore b = new Semaphore(0, true);
    private static final Semaphore c = new Semaphore(0, true);
    private static final Semaphore d = new Semaphore(1, true);
    public static void main(String[] args) {
        new ABABCCCD.A().start();
        new ABABCCCD.B().start();
        new ABABCCCD.C().start();
       new ABABCCCD.D().start();
    }

    private static final class A extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT*2; i++) {
                    a.acquire();
                    myPrint("A ");
                    d.release(1);
                
                   
                    
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
                   d.release();
                 
                    
                
                   
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
                    d.release();
                    
                }
            } catch (InterruptedException ex) {
            }
        }
    }
private static final class D extends Thread {

        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                  d.acquire();
                  a.release();
                  d.acquire();
                  b.release();
                  d.acquire();
                  a.release();
                  d.acquire();
                  b.release();
                  d.acquire();
                  c.release(3);
                       d.acquire(3);            
                   myPrint("D ");
                  d.release();
                 
                    
                
                   
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

