
public class Anonymous_Inner_Class {
	
	interface Person {
	    public void eat();
	}
    public static void main(String[] args) {
    	
    	// interface use anonymous inner class
        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
        
      //Thread class
        Thread t = new Thread() { 
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }
        };
        t.start();
        
        
      //Runnable interface
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }
        };
        Thread tt = new Thread(r);
        tt.start();
    }
}
