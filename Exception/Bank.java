import java.util.HashMap;
class InvalidwithdrawException extends Exception {
    public InvalidwithdrawException(int accountno) {
        super("Insufficient balance in" + accountno);
    }
}
public class Bank{
    private HashMap<Integer,Integer> accounts;
    public Bank(){
        accounts = new HashMap<Integer,Integer>();
    }
    public void createAccount(int accountno,int accountBalance) {
        accounts.put(accountno,accountBalance);
    }

    public void withdraw(int accountno,int amount) throws InvalidwithdrawException{
        if(!accounts.containsKey(accountno)) {
            System.out.println("error no such account");
        }
        else{
            if(accounts.get(accountno) < amount){
                throw new InvalidwithdrawException(accountno);
            }
            else{
                int newbalance = accounts.get(accountno) - amount;
                accounts.replace(accountno,newbalance);
            }
        }

    }



}
