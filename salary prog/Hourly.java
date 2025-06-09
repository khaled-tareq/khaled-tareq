public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String Name, String Addres, String phone, String socialSecNum, double payRate, int hoursWorked) {
        super(Name, Addres, phone, socialSecNum, payRate);
        this.hoursWorked = hoursWorked;
    }
    public void addHours(int moreHours){
        hoursWorked= hoursWorked+moreHours;
    }
    public double pay(){
		 return hoursWorked * payRate;
        
    }
    @Override
    public String toString()
	 {
		 return super.toString() + " worked hours=" + hoursWorked;
	 }
    
}
