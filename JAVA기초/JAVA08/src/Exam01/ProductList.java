package Exam01;

public class ProductList {

	public static void main(String[] args) {
		Product[] prod = new Product[10];
		
		prod[0] = new Product("TV");
		prod[1] = new Product("Handset");
		prod[2] = new Product("Car");
		
		prod[1] = null;   //핸드셋을 잃어버린 상황.
		
		for(int i = 0; i<prod.length; i++) {
			try {
				System.out.println(prod[i].name);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
