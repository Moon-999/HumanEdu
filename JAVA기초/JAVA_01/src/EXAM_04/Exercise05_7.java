package EXAM_04;

public class Exercise05_7 {

	public static void main(String[] args) {
		//7-1 최댓값
		
		int max = 0;  //max를 구하기 위한 초기값이 작아야 한다.
		int[] array = {1, 5, 3, 8, 2};
		
		for(int x = 0; x<array.length; x++) {
			if(max < array[x]) {
				max = array[x];
			}
			
		}
		System.out.println("max: "+max);
		
		
		
		
		
		//7-2 최솟값
		
		int min = 100;   //최소값을 구하기 위해 초기값이 커야 한다.
		int [] arr = {1,5,3,8,9};
		
		for(int y = 0; y < arr.length; y++) {
			if(min > arr[y]) {
				min = arr[y];
			}
		}
		System.out.println("min : "+min);
	}

}
