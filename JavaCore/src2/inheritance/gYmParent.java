package inheritance;

public class gYmParent {
	protected String memberNAme;
	protected double duration;
	protected double monthlyFee;
	public gYmParent(String memberNAme, double duration, double monthlyFee) {
		this.memberNAme = memberNAme;
		this.duration = duration;
		this.monthlyFee = monthlyFee;
	}
		
		
		
		
		public double getTotalCost() {
			return duration*monthlyFee;
		}
		
		public String toString() {
			String details=memberNAme	+","+	duration	+" ,"+	monthlyFee;
			return details;
		}
	}
	


