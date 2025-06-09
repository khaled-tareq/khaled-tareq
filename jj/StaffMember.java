abstract public class StaffMember
{
    protected String Name;
    protected String Addres;
    protected String phone;
    public StaffMember(String Name, String Addres, String phone) {
      this.Name = Name;
        this.Addres = Addres;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "StaffMember [Name=" + Name + ", Addres=" + Addres + ", phone=" + phone + "]";
    }
public  abstract double pay();
   

}