package no.hib.dat100.miniexcel;

public class MiniExcel {

	private static int[][] data = { {1,2,0},{3,4,0},{5,6,0},{0,0,0} };
			
	public static void main(String args[])
	{
		Ark ark = new Ark(data);
		
		ark.skrivUt();
		
		ark.beregnSum();
		
		ark.skrivUt();
	}
}
