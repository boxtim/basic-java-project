public class Product {

	private int id;
	private int price;
	private int amount;

	private String name;

	public Product() {
		this.amount = 30;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

	// ----------
	// Methods
	// ----------vec[i - 1] =

	public String toString() {
		return "Nombre: " + name
			 + " | Código: " + id
			 + " | Precio: " + price
			 + " | Cantidad: " + amount;
	}

	public void decAmount(int amount) {
		this.amount -= amount;
	}

	public void incAmount(int amount) {
		this.amount += amount;
	}

}