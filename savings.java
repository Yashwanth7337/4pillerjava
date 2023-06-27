

public class savings extends Account
 {
    private double  min_bal;
    public void setmin_bal(double min_bal)
    {
        this.min_bal=min_bal;
    }
    public double getmin_bal()
{
    return min_bal;
}

   public void cal_bal()
   {
double balance=getacc_bal();
balance=balance-getmin_bal();
System.out.println("Account balance"+balance);
   }  
}
