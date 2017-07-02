package chainOfResponsibilityDesignPattern;

import java.util.Scanner;

public class MainClassATMDispenseChain {

    private DispenseChainInterface dispenseChainInterface;

    public MainClassATMDispenseChain() {
        // initialize the chain
        this.dispenseChainInterface = new Dollar50Dispenser();
        DispenseChainInterface dispenseChainInterface2 = new Dollar20Dispenser();
        DispenseChainInterface dispenseChainInterface3 = new Dollar10Dispenser();

        // set the chain of responsibility
        dispenseChainInterface.setNextChain(dispenseChainInterface2);
        dispenseChainInterface2.setNextChain(dispenseChainInterface3);
    }

    public static void main(String[] args) {
        boolean isTransactionRunning = true;
        MainClassATMDispenseChain atmDispenser = new MainClassATMDispenseChain();
        int amount = 0;
        Scanner input = new Scanner(System.in);

        while (isTransactionRunning) {

            System.out.println("*Multiple of 10$");

            System.out.println("Enter amount to dispense");

            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10$.  \n  please reinsert you card... ");

                input.close();
                return;
            }
            // process the request
            atmDispenser.dispenseChainInterface.dispense(new Currency(amount));
            isTransactionRunning = false;
        }
        input.close();
        System.out.println("please take your cash and recipt..");
        return;
    }
}
