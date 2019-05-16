package day23;

public class test2 {

	public static void main(String[] args) {
		Number n=new Number();
		new Thread(n).start();
		new Thread(n).start();
		new Thread(n).start();
	}

}
class Number implements Runnable{
    int i=1;
	@Override
	public void run() {
		while(true){
			synchronized(this){
				this.notifyAll();
			if(i>100)
				break;
			System.out.println(Thread.currentThread().getName()+"--------"+i++);
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			}
		
	}
	
}
