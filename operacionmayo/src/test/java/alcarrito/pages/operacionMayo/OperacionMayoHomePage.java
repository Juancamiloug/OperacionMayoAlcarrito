package alcarrito.pages.operacionMayo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import alcarrito.utils.Utils;
import net.serenitybdd.annotations.Step;



public class OperacionMayoHomePage extends Utils{

    public final By buttonProspero = By.xpath("//img[@src='/svg/prospero.svg']");
    public final By buttonTituloHomePage = By.xpath("//img[@class='bg-Img block']");
    private final String urlHomeOperacionMayo= "https://operacionmayo.com/";
    
    @Step("Ingresar a operación Mayo")
    public void ingresoAHomeOperacionMayo(){
        open();
    }

    @Step("Validar ingreso correcto a la página principal de operación mayo")
    public void validarUrlOperacionMayo(){
        assertEquals(getDriver().getCurrentUrl(),urlHomeOperacionMayo);
    }

    @Step("Click a prospero")
    public void clickProspero(){
        esperarPorElementoClickeable(buttonProspero);
        find(buttonProspero).click();
    }

}
