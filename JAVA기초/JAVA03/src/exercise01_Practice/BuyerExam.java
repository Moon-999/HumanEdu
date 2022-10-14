package exercise01_Practice;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int comPrice = 200;
		int audioPrice = 50;
		Buyer buyer1 = new Buyer(1000);
		
		Tv tv = new Tv(tvPrice,"TV");
		Computer com = new Computer(comPrice,"Computer");
		Audio audio = new Audio(audioPrice, "Audio");
		
		buyer1.buy(tv);
		buyer1.buy(com);
		buyer1.buy(audio);
		buyer1.buy(tv);
		buyer1.buy(com);
		buyer1.buy(audio);
		buyer1.buy(com);
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.summary();
		
	}

}
