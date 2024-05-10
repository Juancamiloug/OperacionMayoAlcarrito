package alcarrito.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class Utils extends PageObject{
    
    public void forzarClickJS(By element) {
        WebElement Webelement = getDriver().findElement(element);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click()", Webelement);
    }

    public void moverAElemento(By localizador) {
        new Actions(getDriver()).moveToElement(find(localizador)).perform();
    }

    public void esperarPorElementoVisible(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), getImplicitWaitTimeout());
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public void esperarPorElementoClickeable(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), getWaitForTimeout());
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void esperarMilisegundos(Integer milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean aceptarAlertaVisible() {
        try {
            ExpectedConditions.alertIsPresent();
            getDriver().switchTo().alert().accept();
            return true;
        } catch (Exception e) {
            System.out.println("alert was not present");
            return false;
        }
    }

}
