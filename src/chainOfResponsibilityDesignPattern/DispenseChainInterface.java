package chainOfResponsibilityDesignPattern;

public interface DispenseChainInterface {

    void setNextChain(DispenseChainInterface nextChain);

    void dispense(Currency cur);
}
