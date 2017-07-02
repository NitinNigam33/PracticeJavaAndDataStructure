
/**
 * Sigleton design pattern
 * @author nitinnigam
 *
 */
public class SigletonClassDesignPattern {

    private static SigletonClassDesignPattern singleton = new SigletonClassDesignPattern();

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private SigletonClassDesignPattern() {
    }

    /*Static 'instance' method */
    public static SigletonClassDesignPattern getInstance() {
        return singleton;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod() {
        System.out.println("demoMethod for singleton");
    }
}