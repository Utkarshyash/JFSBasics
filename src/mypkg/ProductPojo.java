package mypkg;

public class ProductPojo {
	private int productId;
	private String productName;
	float price;
	int quantity;
	public int getQuantity() {
		return quantity;
	}
	public void setQuatity(int quantity) {
		this.quantity = quantity;
	}
	public ProductPojo(int productId, String productName, float price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;		
	}
	public int getProduct() {
		return productId;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		return "ProductPojo [productId=" + productId + ", productName=" + productName + ", price=" + ", quantity=" + quantity + "]";
	}

}
