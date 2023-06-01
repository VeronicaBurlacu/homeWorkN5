package homeWorkN5;

import Utils.commonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TaskN1 extends commonMethods {
    public static void main(String[] args) {
        //click on the last alert
        //send keys and accept it
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement el= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        el.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hi there");
        alert.accept();

    }
}
