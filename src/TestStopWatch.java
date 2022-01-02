//9.6
public class TestStopWatch{
	public static void main(String[] args) {
		StopWatch time = new StopWatch();
		int[] array = new int[100000];
		for(int i=0;i<100000;i++) {
			array[i] = (int)(Math.random()*100000);
		}
		
		time.start();
		
		for(int i=0;i<array.length-1;i++) {
			int currentMin = array[i];
			int currentMinIndex = i;
			
			for(int j=i+1;j<array.length;j++) {
				if(currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != 1) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
		
		time.stop();
		System.out.println("timeMill: "+time.getElapsedTime());
	}
}


class StopWatch {
	private long startTime;
	private long endTime;
	
	StopWatch(){
		this.startTime = System.currentTimeMillis();
	}
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime-this.startTime;
	}

}
