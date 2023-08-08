import java.util.Scanner;
interface Platform {
    public void createAccount();
    public void processTransaction();
}
interface bank{
    public void bankAccount();
    String bankAccount(String Name);
    public void FinancialInstitution();
}
class DesktopPlatform implements Platform {
    public void createAccount(String name) {
    }
    @Override
    public void createAccount() {

    }
    public void processTransaction() {

    }
}
class TabletPlatform implements Platform {
    public void createAccount() {

    }
    public void processTransaction() {

    }
}
class SmartphonePlatform implements Platform {
    public void createAccount() {

    }
    public void processTransaction() {

    }
}
class BankA implements bank{
    private String Name;
    public BankA(String customerName, int accNumber) {

    }
    public void bankAccount() {

    }
    @Override
    public String bankAccount(String Name){
        this.Name = Name;
        return Name;
    }
    public String getName() {
        return Name;
    }
    public void FinancialInstitution() {

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String CustomerName = sc.nextLine();
        System.out.print("Customer Account Number: ");
        int AccNumber = sc.nextInt();
        bank bn = new BankA(CustomerName,AccNumber);
    }
}