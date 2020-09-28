import javax.inject.Named;

@Named("second")
public class SecondImplementation implements ToImplement {
    public void toDo() {
        System.out.println("SecondImplementation");
    }
}
