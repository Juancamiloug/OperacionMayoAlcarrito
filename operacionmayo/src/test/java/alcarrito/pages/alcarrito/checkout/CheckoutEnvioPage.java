package alcarrito.pages.alcarrito.checkout;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import alcarrito.utils.Utils;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;

public class CheckoutEnvioPage extends Utils{

    public final By tittleResumen = By.xpath("//span[@class='title']");  
    public String urlActual = "";

    @Step("Validar que operación mayo halla direccionado correctamente a alcarrito.com producción")
    public void validarIngresoAAlcarritoProduccion(){
        Serenity.takeScreenshot();
        esperarPorElementoVisible(tittleResumen);
        urlActual = getDriver().getCurrentUrl();
        urlActual = urlActual.substring(0,47);
        assertEquals(urlActual,"https://www.alcarrito.com/checkout/index/index/");
    }


    
}
