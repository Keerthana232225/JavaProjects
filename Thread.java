package Day5Programs;
public class Thread extends Thread{
public void run() {
	System.out.println("Thread is running");
}
}
public static <MyThread> void main(String[] args) {
	MyThread thread1=new MyThread();
	((Object) thread1).start();
}
