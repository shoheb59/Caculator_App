import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculation {
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    MobileElement btn_8;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btn_plus;

    @FindBy(id = "com.google.android.calculator:id/digit_9")
    MobileElement btn_9;

//    @FindBy(id = "com.google.android.calculator:id/eq")
//    MobileElement btn_equal;

    @FindBy(id = "com.google.android.calculator:id/result_preview")
    MobileElement btn_ResultPreview;

    public Calculation(AndroidDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);


    }
    public String doSum()
    {
        btn_8.click();
        btn_plus.click();
        btn_9.click();
        //btn_equal.click();

        return btn_ResultPreview.getText();

    }

}
