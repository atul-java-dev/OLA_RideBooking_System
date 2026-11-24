
class MyTask extends Thread { 
public synchronized void display() { 
System.out.println(Thread.currentThread().getName() + " starts"); 
try{
Thread.sleep(2000); 
}
catch(InterruptedException e){
  IO.println("intrrupted");
}
System.out.println(Thread.currentThread().getName() + " ends"); 
} 
} 

public class Main { 
public static void main(String[] args) { 
MyTask task = new MyTask(); 

Thread t1 = new Thread(() -> task.display(), "Thread-1"); 
Thread t2 = new Thread(() -> task.display(), "Thread-2"); 

t1.start(); 
t2.start(); 

IO.println("main thread :"+Thread.currentThread().getName());
} 
}
