package ecommerce.model;

public class Casaco extends Produto {
	
	private Boolean containsHood;

	public Casaco(String name, int id, float price, String color, int category, String size, Boolean containsHood) {
		super(name, id, price, color, category, size);
		this.containsHood = containsHood;
	}

	public Boolean getContainsHood() {
		return containsHood;
	}

	public void setContainsHood(Boolean containsHood) {
		this.containsHood = containsHood;
	}

	@Override
	public void verInfoProduto() {
		super.verInfoProduto();
		if (this.containsHood) {
			System.out.println("Capuz: Sim");
		} else {
			System.out.println("Capuz: Não");
		}
		System.out.println("*************************************");
	}

	
	
}