package exam03;

public class HybrideCar extends Car{
	int elec;
	public HybrideCar() {
		System.out.println("HybrideCar() 생성");

	}
	public HybrideCar(int elec) {
		this.elec = elec;
		System.out.println("HybrideCar(Int) 생성"+this.elec);

	}
	public HybrideCar(int elec, int oil) {
		super();
		this.elec = elec;
		this.oil = oil;
		System.out.println("HybrideCar(Int) 생성"+this.elec + this.oil);

	}
}
