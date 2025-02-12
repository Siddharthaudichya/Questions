public class Interface {
    public static void main(String[] args) {
        ATM myATM = new HDFC_ATM();  // Interface reference, object of implementing class
        myATM.withdrawMoney(3000);
        myATM.checkBalance();
    }
}

// Interface
interface ATM {
    void withdrawMoney(int amount);  // Abstract method
    void checkBalance();
}

// Implementing the interface
class HDFC_ATM implements ATM {
    @Override
    public void withdrawMoney(int amount) {
        System.out.println("Withdrawing Rs. " + amount + " from HDFC ATM.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance in HDFC ATM.");
    }
}
