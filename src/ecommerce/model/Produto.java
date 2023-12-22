package ecommerce.model;

public abstract class Produto {

	private String name;
	private int id;
	private float price;
	private int category;
	private String color;
	private String size;

	public Produto(String name, int id, float price, String color, int category, String size) {
		super();
		this.id = id;
		this.price = price;
		this.color = color;
		this.category = category;
		this.size = size;
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void verInfoProduto() {
		System.out.println("\n*************************************");
		System.out.println("Produto (ID #" + this.getId() + "):               ");
		System.out.println("                                                  ");
		System.out.println(this.getName());
		System.out.println("                                                  ");

		System.out.println("Categoria: " + this.getCategoryName());
		System.out.println("Preço: R$" + this.price);
		System.out.println("Cor: " + this.color);
		System.out.println("Tamanho: " + this.size);
	}
	
	public String getCategoryName() {

		String categoryName = "Categoria não selecionada";
		
		if (this.category == 1) {
			categoryName = "Camisetas";
		} else if (this.category == 2) {
			categoryName = "Casacos";
		}
		
		return categoryName;
		
	}
	
}