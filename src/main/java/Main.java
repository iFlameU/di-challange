import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        First first = container.instance().select(First.class).get();
        Second second = container.instance().select(Second.class).get();
        first.runImplementation();
        second.runImplementation();
        weld.shutdown();
    }


}
