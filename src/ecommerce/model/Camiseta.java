package ecommerce.model;

public class Camiseta extends Produto {

	private String sleeveType;

	public Camiseta(String name, int id, float price, String color, int category, String size, String sleeveType) {
		super(name, id, price, color, category, size);
		this.sleeveType = sleeveType;
	}

	public String getsleeveType() {
		return sleeveType;
	}

	public void setsleeveType(String sleeveType) {
		this.sleeveType = sleeveType;
	}

	@Override
	public void verInfoProduto() {
		super.verInfoProduto();
		System.out.println("Tipo de Manga: " + this.sleeveType);
		System.out.println("*************************************");
	}

}
