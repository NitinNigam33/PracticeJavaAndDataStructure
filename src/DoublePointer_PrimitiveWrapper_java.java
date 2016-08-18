// equivalent to double pointer
final class DoubleWrapper {
    private double d;
    public DoubleWrapper(double d) {
        this.d = d;
    }
    final void set(double d) {
        this.d = d;
    }
    final double get() {
        return d;
    }
}
public class DoublePointer_PrimitiveWrapper_java {
    public static void modify(DoubleWrapper dw) {
        dw.set(2.0);
    }
    public static void main(String args[]) {
        DoubleWrapper dblWrapper = new DoubleWrapper(1.0);
        System.out.println("Bef executing modify(): " + dblWrapper.get());
        modify(dblWrapper);
        System.out.println("Aft executing modify(): " + dblWrapper.get());
    }
}