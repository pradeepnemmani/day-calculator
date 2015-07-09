package threads;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import daycalculator.DayCalculator;

public class ThreadController {
	private String year;
	private String month;
	private String date;
	
	public synchronized void acceptArguments() throws InterruptedException, IOException
	{
		if(year==null && month==null && date==null)
		{

			BufferedReader  bufferedReader=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("****************Enter The Details********************");
			System.out.println("Enter the year:");
			this.year=bufferedReader.readLine();
			System.out.println("Enter the Month:");
			this.month=bufferedReader.readLine();
			System.out.println("Enter the Date:");
			this.date=bufferedReader.readLine();
			
			notifyAll();
		}
		else
		{
			wait();
		}
	}
	public synchronized void  getDay() throws InterruptedException
	{
		if(year==null && month==null && date==null)
		{
			
			wait();
		}
		else
		{
			new DayCalculator().getDay(date, month, year);
			
			this.year=null;
			this.month=null;
			this.date=null;
			notifyAll();
		}
	}
	public void startProcess()
	{
		Runnable runnable1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{
					try {
						getDay();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		Runnable runnable2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{
				
				try {
					acceptArguments();
				} catch (InterruptedException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
		};
		Thread thread1=new Thread(runnable1);
		Thread thread2=new Thread(runnable2);
		List<Thread> threads=new ArrayList<>();
		threads.add(thread1);
		threads.add(thread2);
		for(Thread t:threads)
		{
			t.start();
		}
	}
	public static void main(String[] args)
	{
		System.out.println("In Main");
		new ThreadController().startProcess();
	}

}
