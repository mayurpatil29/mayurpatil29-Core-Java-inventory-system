package InvertyOfProduct;
public class InventModel {
	
	private int id;
	private String name;
	private float price;
	private int quanity;
	private String date; 
	public InventModel(int id, String name, String date, float price,  int quanity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quanity = quanity;
		this.date=date;
		
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getQuanity() {
		return quanity;
	}

	public String getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return "product id :- "+id +"| product name:- "+name+"| product price:- "+price+"| product quantity:-"+quanity+"| entry date"+date;
		
	}
		
}
