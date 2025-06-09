public class staff {
    private StaffMember[] stafflist;

    public staff() {
    stafflist=new StaffMember[6];
       stafflist[0]=new Volunteer("Ali","Amman","07999");
stafflist[1] = new Employee("Khaled","Amman","07888","321321",1500.0);
stafflist[2] = new Executive("Reem","Irbid","07955","22233",2500.0,100.0);
stafflist[3] = new Hourly("Mona","Aqaba","07944","55654",15.0,30);
stafflist[4] = new Employee("Monir","Jerash","07866","889977",700.0);
stafflist[5] = new Volunteer("Hani","Amman","079123");
    }
    public void payday(){
double sum =0;
for (StaffMember s: stafflist){
    System.out.println(s);
    sum += s.pay();
}
System.out.println("pay the total of "+ sum);
    }
}
