package homeWorkN5;

import Utils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class taskN2 extends commonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

//click on check box
//then select bay cat from drop down
//then enter text in text box (edited)
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
       WebElement elem= driver.findElement(By.xpath("//input[@id='a']"));
        elem.click();
//switch the focus
        driver.switchTo().defaultContent();
driver.switchTo().frame("frame2");

        WebElement an= driver.findElement(By.xpath("//select[@id='animals']"));
        Select anim=new Select(an);
        anim.selectByValue("babycat");

driver.switchTo().defaultContent();
driver.switchTo().frame("frame1");
        WebElement text= driver.findElement(By.xpath("//input"));
        text.sendKeys("text is there");
    }
}
