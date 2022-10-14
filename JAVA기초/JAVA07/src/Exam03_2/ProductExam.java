package Exam03_2;

public class ProductExam {

	public static void main(String[] args) {
		Product<Tv, String> prod1 = new Product<Tv, String>();
		Tv t1 = new Tv("삼성", "스마트티비", 200);
		Tv t2 = new Tv("LG", "QLED티비", 150);
		prod1.setType(t1);
		prod1.setModel("SmartTv");
		System.out.println(prod1.getType() + "-" + t1.company+"/"+t1.name+"/"+t1.maxChannel+"-"+prod1.getModel());
		
		Product<Car, String> prod2 = new Product<Car, String>();
		Car c1 = new Car("현대","G70",300);
		Car c2 = new Car("기아", "K7", 250);
		prod2.setType(c2);
		prod2.setModel("SportsCar");
		System.out.println(prod2.getType()+"-" + c2.company+"/"+c2.name+"/"+c2.maxSpeed+"-"+prod2.getModel());
		
		
		

	}

}
