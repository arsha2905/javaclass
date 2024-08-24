package excelread;

import java.io.IOException;

public class Excelmain {
	public static void main (String args[]) throws IOException
	{
		System.out.println(Excelcode.getStringData(1, 0));
		System.out.println(Excelcode.getIntegerData(1, 1));
		
		System.out.println(Excelcode.getStringData(2, 0));
	    System.out.println(Excelcode.getIntegerData(2, 1));
		System.out.println(Excelcode.getStringData(3, 0));
		System.out.println(Excelcode.getIntegerData(3, 1));
	}
	}


