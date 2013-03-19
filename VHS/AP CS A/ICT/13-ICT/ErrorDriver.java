import java.util.Scanner;

public class ErrorDriver
{
    public static void main(String[] args){
        Scanner fax = new Scanner(System.in);
        int num = 0;
        Scanner n00b = new Scanner(System.in);
        
        double bal = -1;
        double dep = -1;
        double withd = -1;
        double addAmount = -1;
        double withdraw = -1;
        CheckingAccount money;
        
         while(bal < 0)
        {
            System.out.print("Enter amount for balance: $");
            bal = n00b.nextDouble();
            System.out.println();
            try{
                money = new CheckingAccount(bal, 45);
            }
            catch(IllegalArgumentException err)
            {
                System.out.println(err.getMessage());
            }
        }
        
        
        while(num != -1){
            System.out.println("(1) View Balance");
            System.out.println("(2) Deposit");
            System.out.println("(3) Withdraw");
            System.out.println("(-1) Quit");
            System.out.print("Choice --> ");
            num = fax.nextInt();
            System.out.println();
            
            switch(num){
                case 1:
            }
        }
                    
                
            
            
        
        
        /*CheckingAccount money = null;
        Scanner n00b = new Scanner(System.in);
        
        double bal = -1;
        double dep = -1;
        double withd = -1;
        double addAmount = -1;
        double withdraw = -1;
        
         while(bal < 0)
        {
            System.out.print("Enter amount for balance: $");
            bal = n00b.nextDouble();
            System.out.println();
            try{
                money = new CheckingAccount(bal, 45);
            }
            catch(IllegalArgumentException err)
            {
                System.out.println(err.getMessage());
            }
        }
        
        while(dep < 0)
        {
            System.out.print("Enter amount to deposit: $");
            dep = n00b.nextDouble();
            System.out.println();
            try{
                money.deposit(dep);
            }
            catch(IllegalArgumentException err)
            {
                System.out.println(err.getMessage());
            }
            System.out.println("$" + money.getBalance());
        }
       
         bal = -1;
        while(withd < 0 || withd > bal)
        {
            bal = money.getBalance();
            System.out.print("Enter amount for withdrawal: $");
            withd = n00b.nextDouble();
            System.out.println();
            try{
                money.withdraw(withd);
            }
            catch(IllegalArgumentException err)
            {
                System.out.println(err.getMessage());
            }
            System.out.println("$" + money.getBalance());
        }
        */
    }
}