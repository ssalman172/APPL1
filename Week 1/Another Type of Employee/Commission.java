
public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, commissionRate); //method pada parent class (Hourly)
		this.commissionRate = commissionRate;
	}
	
	public void addSales (double totalSales) {
		this.totalSales += totalSales;	//menambah parameter pada instance variable
	}
	
	//diambil dari class Executive
	public double pay()  {  
		double payment = super.pay() + totalSales*commissionRate;  
		totalSales = 0;  //set total sales kembali menjadi 0
		return payment;  
	}  	
	
	//diambil dari parent class (Hourly class)
	public String toString()  {  
		 String result = super.toString();  
		 result += "\nCurrent total sales: " + totalSales;  
		 return result;  
	 }  
}