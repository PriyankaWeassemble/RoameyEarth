package LoadTesting.RoamyEarth;

public class HomepageThread extends Thread{
	BasePage bp;
	
	public HomepageThread(String thradName)
	{
		super(thradName);
		bp =new BasePage();
	}
	
	@Override
	public void run()
	{
		System.out.println("thread--started"+ Thread.currentThread().getName());
		try {
			bp.setup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bp.teardown();
		System.out.println("thread-- Ended"+ Thread.currentThread().getName());
	}
	

}
