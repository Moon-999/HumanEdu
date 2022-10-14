package EXAM_04;

public class Exercise05_8 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int x=0; x<array.length; x++) {
			for(int y=0; y<array[x].length; y++) {
				sum = sum + array[x][y];
				avg = (double) sum/(array[0].length + array[1].length + array[2].length);
			}
			
		}
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}

}
