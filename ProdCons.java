import java.util.Random;
import java.util.concurrent.Semaphore;

public final class ProdCons {
	
	private static final int N=5;    
	private static final int COUNT = 30;
    private static Random delay = new Random();
	private static Semaphore miejsce = new Semaphore(N, true);
	private static Semaphore dane = new Semaphore(0, true);
	//private static Semaphore buffer = new Semaphore(1, true);
	
	public static void main(String[] args) {
		new Consumer().start();
		new Producer().start();
	}

	private static class Producer extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                	Thread.sleep(delay.nextInt(5));  
                	//buffer.acquire();
                	//lock("Producent");
                	miejsce.acquire();
                	put(i);
                	Thread.sleep(delay.nextInt(5));       
                	dane.release();
                	//buffer.release();
                	//unlock("Producent");
                }
            } catch (InterruptedException ex) {
            }
        }
    }

	private static class Consumer extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                	Thread.sleep(delay.nextInt(5));
                	//buffer.acquire();
                	//lock("Konsument");
                	dane.acquire();
                	get(i);
                	Thread.sleep(delay.nextInt(5));       
                	miejsce.release();
                	//buffer.release();
                	//unlock("Konsument");
                }
            } catch (InterruptedException ex) {
            }
        }
    }
	
    private static synchronized void get(int i) {
        System.out.print(" 		konsument pobiera rekord ");
        System.out.println(i);
    }
	
    private static synchronized void put(int i) {
        System.out.print("producent wpisuje rekord ");
        System.out.println(i);
    }
	
    /*
    private static synchronized void lock(String s) {
        System.out.println(s + " zablokowa³ bufor");
    }
	
    private static synchronized void unlock(String s) {
        System.out.println(s + " odblokowa³ bufor");
    }
	*/

}
