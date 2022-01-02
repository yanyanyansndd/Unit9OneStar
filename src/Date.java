//9.3
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long second = 10000;
    	for(int i=0;i<8;i++) {
    		java.util.Date curr = new java.util.Date(second);
    		System.out.println(curr.toString());
    		second *= 10;
    	}
	}

}
