package exercise01;

public class Buyer {
	public int money;
	public Product[] cart = new Product[10];
	public int index=0;
	
	
	public Buyer(int money) { 
		this.money = money;
		
	}
	public void buy(Product p) {   //Product p = new Tv(100,"TV");
		if(this.money >= p.price) {
			 this.money = this.money - p.price;
			 this.add(p);
		}
		else {
			System.out.println("프로그램 종료");
		}
	}
	private void add(Product p) {
		this.cart[index] = p;
		System.out.printf("Cart[%d] : %s \n",this.index, p.name);
		this.index = this.index + 1;
	}
	public void summary() {
		String itemList = "";
		int sum = 0;
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			itemList = itemList + this.cart[i].name + ",";
			sum = sum +this.cart[i].price;
		}
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("총 사용금액 : "+ sum);
		System.out.println("현재잔액 : "+ this.money);
	}
}
