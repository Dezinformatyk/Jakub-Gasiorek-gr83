import java.util.Random;
import java.util.concurrent.Semaphore;

public final class DiningPhilosophers {

	private static final int N=5;    
	private static final int COUNT = 10;
    private static Random delay = new Random();
	private static Semaphore[] fork = new Semaphore[5];

	public static void main(String[] args) {
		for( int i = 0; i < N; i++ )
			fork[i] = new Semaphore(1, true);
		for( int i = 0; i < N; i++ )
			new Philosopher(i).start();
	}
	
    private static class Philosopher extends Thread {
    	private int n;
    	
    	public Philosopher( int nbr ){
    		n = nbr;
    	}
    	
        @Override
        public void run() {
            try {
                for (int i = 0; i < COUNT; i++) {
                	// myœlenie
                	//Thread.sleep(delay.nextInt(5));
                	// jedzenie
                	fork[n].acquire();
                	get(n, n);
                	//Thread.sleep(1);
                	fork[(n+1)%N].acquire();
                	get(n, (n+1)%N);
                	eat(n);
                	Thread.sleep(delay.nextInt(5));       
                	fork[n].release();
                	put(n, n);
                	fork[(n+1)%N].release();
                	put(n, (n+1)%N);
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    private static synchronized void get(int i, int j) {
        System.out.print(i);
        System.out.print(" bierze widelec ");
        System.out.println(j);
    }
	
    private static synchronized void put(int i, int j) {
    	System.out.print("           ");
        System.out.print(i);
        System.out.print(" oddaje widelec ");
        System.out.println(j);
    }
	
    private static synchronized void eat(int i) {
    	System.out.print("                      ");
        System.out.print(i);
        System.out.println(" rozpoczyna jedzenie ");
    }
	

}
