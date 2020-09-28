import javax.inject.Inject;
import javax.inject.Named;

public class Second {
    @Inject
    private @Named("second") ToImplement implementation;

    public void runImplementation() {
        implementation.toDo();
    }
}
