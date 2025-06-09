public class Executive extends Employee {
    private double bonus;

    public Executive(String Name, String Addres, String phone, String socialSecNum, double payRate, double bonus) {
        super(Name, Addres, phone, socialSecNum, payRate);
        this.bonus = bonus;
    }
public void awardBonus(double execBonus){
    payRate=payRate+bonus;
}
public String toString(){
return super.toString()+", bonus"+bonus;
}
public double pay(){
        return super.pay()+bonus;
    }
}
