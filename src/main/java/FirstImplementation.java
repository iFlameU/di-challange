import javax.inject.Named;

@Named("first")
public class FirstImplementation implements ToImplement {
    public void toDo() {
        System.out.println("FirstImplementation");
    }
}
