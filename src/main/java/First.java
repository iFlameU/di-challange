import javax.inject.Inject;
import javax.inject.Named;

public class First {
    @Inject
    private @Named("first") ToImplement implementation;

    public void runImplementation() {
        implementation.toDo();
    }
}
