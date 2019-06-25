package hello;

public class Discount {

	private String type ; 
	private int startRange ; 
	private int endRange ;
	private int discountValue ;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStartRange() {
		return startRange;
	}
	public void setStartRange(int startRange) {
		this.startRange = startRange;
	}
	public int getEndRange() {
		return endRange;
	}
	public void setEndRange(int endRange) {
		this.endRange = endRange;
	}
	public int getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}
	public Discount(String type, int startRange, int endRange, int discountValue) {
		super();
		this.type = type;
		this.startRange = startRange;
		this.endRange = endRange;
		this.discountValue = discountValue;
	}
	
	
	
}
