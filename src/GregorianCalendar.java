//import java.util.GregorianCalendar;
//9.5
public class GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.GregorianCalendar g = new java.util.GregorianCalendar();
		System.out.println(g.get(java.util.GregorianCalendar.YEAR)+"/"+g.get(java.util.GregorianCalendar.MONTH)+"/"+g.get(java.util.GregorianCalendar.DAY_OF_MONTH));
	    g.setTimeInMillis(1234567898765L);
	    System.out.println(g.get(java.util.GregorianCalendar.YEAR)+"/"+g.get(java.util.GregorianCalendar.MONTH)+"/"+g.get(java.util.GregorianCalendar.DAY_OF_MONTH));
	}

}
