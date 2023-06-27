
public class demo {
  public static void main(String args[])
  {
    savings s=new savings();
    s.setacc_id(100);
    s.setacc_name("yashwanth");
    s.setacc_bal(10000);
    s.setmin_bal(500);
System.out.println("Account holder type:"+s.getacc_name());
System.out.println("Account holder type:"+s.getacc_id());
System.out.println("Account holder type:"+s.getacc_bal());
System.out.println("Account holder type:"+s.getmin_bal());

s.cal_bal();


    current c=new current();
    c.setacc_id(200);
    c.setacc_name("madhu");
    c.setacc_bal(50000);
    c.setmin_bal(5000);
    System.out.println("Account holder type:"+c.getacc_name());
    
System.out.println("Account holder type:"+c.getacc_id());
System.out.println("Account holder type:"+c.getacc_bal());
System.out.println("Account holder type:"+c.getmin_bal());

c.cal_bal();

    
    //Account a=new Account();
  }  
}
