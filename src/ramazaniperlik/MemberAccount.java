package ramazaniperlik;


public class MemberAccount {

    private int id;
    private String name;
    private String surname;
    private double balance;
    private String phone;
    private String memberCode;

    public MemberAccount(){}

    public MemberAccount(int id,String name,String surname,double balance,String memberCode,String phone){
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.balance = balance;
    this.phone = phone;
    this.memberCode = memberCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMemberCode() {
        return memberCode(id,name);
    }

    public String memberCode(int id, String name){

       String LocalMemberCode = id + name.substring(0,2);

       return LocalMemberCode;
    }

}
