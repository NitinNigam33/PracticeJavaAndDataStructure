package chainOfResponsibilityDesignPattern;

public class Dollar10Dispenser implements DispenseChainInterface {

    private DispenseChainInterface chain;

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 10) {
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0)
                this.chain.dispense(new Currency(remainder));
        } 
        /*this code never used*/
        else {
            this.chain.dispense(cur);
          }
        /*    */
        return;
    }

    @Override
    public void setNextChain(DispenseChainInterface nextChain) {
        this.chain = nextChain;

    }
}
