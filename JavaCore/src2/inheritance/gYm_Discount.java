package inheritance;

public class gYm_Discount extends gYmParent {

	private double discount;
	
	public gYm_Discount(String memberNAme, double duration, double monthlyFee,double discount) {
		super(memberNAme, duration, monthlyFee);
		this.discount=discount;
		// TODO Auto-generated constructor stub
	}

	
	
	public double getTotalCost() {
		
		double cost= duration*monthlyFee;
		return cost-(cost*discount);
		
	}
	
	
	
	public String toString() {
		String details=memberNAme	+","+	duration	+" ,"+	monthlyFee	;
		return details;
	}
	
	public static void main(String[] args) {
		
	}

}
