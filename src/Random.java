//9.4
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Random r = new java.util.Random(1000);
        for(int i=0;i<50;i++)
        	System.out.print(r.nextInt(100)+" ");
	}

}
