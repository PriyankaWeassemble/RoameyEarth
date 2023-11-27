package LoadTesting.RoamyEarth;

public class HomepageTestRunnerclass {
	public static void main(String[] args) {
		
		for(int i=0;i<1;i++) {
		Thread t1=new HomepageThread("thread1");//higher level of casting parent calling child
		System.out.println("threads started");
				t1.start();
		}
		
		
	}

}
