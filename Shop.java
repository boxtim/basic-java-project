public class Shop {
	private Product[] elements = new Product[2];

	public Shop() {
		Product productOne = new Product();
		productOne.setId(0);
		productOne.setName("Arroz");
		productOne.setPrice(1200);
		elements[0] = productOne;

		Product productTwo = new Product();
		productTwo.setId(1);
		productTwo.setName("Manzana");
		productTwo.setPrice(800);
		elements[1] = productTwo;
	}

	public Product[] getProducts() {
		return elements;
	}

	public String sell(int id, int amount) {
		Product product = elements[id];

		product.decAmount(amount);

		return product.getName()
				+ " Precio: " + product.getPrice()
				+ " Subtotal: " + subTotal(product, amount)
				+ " Total + IVA: " + total(product, amount)
				+ showMessage(product);
	}

	public String buy(int id, int amount) {
		Product product = elements[id];

		product.incAmount(amount);

		return product.getName()
				+ " Precio: " + product.getPrice()
				+ " Subtotal: " + subTotal(product, amount)
				+ " Total + IVA: " + total(product, amount);
	}

	private double subTotal(Product product, int amount) {
		return product.getPrice() * amount;
	}

	private double total(Product product, int amount) {
		return product.getPrice() * amount * 1.19;
	}

	private String showMessage(Product product) {
		if (product.getAmount() < 5) {
			return " || Necesita incrementar existencias de " + product.getName() ;
		} else {
			return "";
		}
	}
}