import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

public class HomePageTest extends Base{

    @Test
    public void  testContentByResourceId() {
        driver.findElement(AppiumBy.id("android:id/content")).isDisplayed();
    }
}
