package ramazaniperlik;

import java.util.Date;

public class Bill {

    private int id;
    private double amount;
    private Date processDate;
    private String billType;

    public int getId() {
        return id;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }

    public void setProcessDate(Date processDate){
        this.processDate = processDate;
    }
    public Date getProcessDate(){
        return this.processDate;
    }

    public void setBillType(String billType){
        this.billType = billType;
    }
    public String getBillType(){
        return this.billType;
    }



}
