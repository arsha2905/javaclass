package exception;

public class MultipleCatch {
	@SuppressWarnings("null")
	public void display() {
		try {
			int[]array=new int[4];
			System.out.println(array[8]);//ArrayIndexOutOfBoundsException
			
			String str=null;
			System.out.println(str.length());//NullPointerException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds:"+e);
			
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception:"+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MultipleCatch mc=new MultipleCatch();
	mc.display();
		
		
		

	}

}
