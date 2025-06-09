public class Employee extends StaffMember {
    protected String SocialSecNum;
    protected double payRate;
    public Employee(String Name, String Addres, String phone, String socialSecNum, double payRate) {
        super(Name, Addres, phone);
        SocialSecNum = socialSecNum;
        this.payRate = payRate;
    }
    @Override
    public String toString() {
        return "Employee [Name=" + Name + ", SocialSecNum=" + SocialSecNum + ", Addres=" + Addres + ", payRate="
                + payRate + ", phone=" + phone + "]";
    }
    public double pay(){
        return payRate;
    }
}
