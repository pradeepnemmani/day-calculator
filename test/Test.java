package test;

import java.util.GregorianCalendar;


public class Test {
public static void main(String[] args)
{
	GregorianCalendar calendar=new GregorianCalendar();
	String s=calendar.getTime().toString();
	System.out.println(s);
	String[] sts=s.split(" ");
	System.out.println(sts[0]);
	System.out.println(sts[1]);
	System.out.println(sts[2]);
	System.out.println(sts[3]);
	System.out.println(sts[4]);
	System.out.println(sts[5]);
}
}
