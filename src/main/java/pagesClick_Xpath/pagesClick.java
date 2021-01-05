package pagesClick_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagesClick {
    WebDriver webDriver;
    WebElement element;
    public pagesClick(WebDriver driver) {

        this.webDriver = driver;
    }
    public void UrunArama(String urun) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        element = wait.until(ExpectedConditions.elementToBeClickable(pagesXpath.urunArama));
        element.sendKeys(urun);
    }
    public void AraButton()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        element = wait.until(ExpectedConditions.elementToBeClickable(pagesXpath.araButton));
        element.click();
    }
    public void UrunIphone()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        element = wait.until(ExpectedConditions.elementToBeClickable(pagesXpath.urunIphone));
        element.click();
    }
    public void YorumlarButton()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        element = wait.until(ExpectedConditions.elementToBeClickable(pagesXpath.yorumlarButton));
        element.click();
    }
    public void IlkYorumEvetTikla()
    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        element = wait.until(ExpectedConditions.elementToBeClickable(pagesXpath.ilkYorumEvetTikla));
        element.click();
    }
}