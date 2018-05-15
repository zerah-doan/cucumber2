import listeners.ExecutionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExecutionListener.class)
public class SampleTest {

    @Test(description = "login")
    public void login() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(description = "search for flights", dependsOnMethods = "login")
    public void search() {

    }

    @Test(description = "select flight", dependsOnMethods = "search")
    public void select() {

    }

    @Test(description = "book flight", dependsOnMethods = "select")
    public void book() {

    }

    @Test(description = "logout", dependsOnMethods = "book")
    public void logout() {

    }
}