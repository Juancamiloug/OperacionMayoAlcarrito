package alcarrito.pages.operacionMayo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import alcarrito.utils.Utils;
import net.serenitybdd.annotations.Step;

public class OperacionMayoGrabarAudioPage extends Utils{
    
    public final String urlGrabarAudioOperacionMayo = "https://operacionmayo.com/grabar-audio";
    public final By headerGrabarAudioOperacionMayo= By.xpath("//header[@class='fixed lg:p-12 xs:p-6 w-full flex justify-between right-0 top-0 z-[200] hamburger text-white inter']");
    public final By tittleOperacionMayo= By.xpath("//img[contains(@src,'/svg/logo-operacion-mayo.svg')]");
    public final By buttonSiguiente= By.xpath("//button[@class='btn 2xl:text-2xl sm:text-3xl xs:text-2xl']");
    public final By textCelebralesAbuelas= By.xpath("//span[contains(@class,'w-full textNimate absolute lg:bottom-14 sm:bottom-12 xs:bottom-8 text-center tracking-[-1px] font-inter font-semibold text-'");
    public final By textUnHomenaje= By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div/div/h1");
    public final By containerbuttonIniciar=By.xpath("//button[contains(@class,'z-50 btn active 2xl:text-2xl sm:text-3xl xs:text-2xl')]");
    public final By buttonIniciar= By.xpath("//button[contains(@class,'z-50 btn active 2xl:text-2xl sm:text-3xl xs:text-2xl')]");
    public final By cajaOnboarding= By.xpath("//div[@class='cajaCards Onboarding']");
    public final By inputNombre= By.xpath("//div[@class='flex flex-col w-full']//input[@type='text']");
    public final By inputEmail= By.xpath("//input[contains(@type,'email')]");
    public final By buttonContinuar1= By.xpath("//span[contains(text(),'Continuar')]");
    public final By textMensajeParaGrabacion= By.xpath("//div[@class='w-full flexCenter flex-col']//div[@class='w-full']//p[@class='titulosForm']");
    public final By buttonIniciarGrabar= By.xpath("//img[@src='/svg/record.svg']");
    public final By buttonStopGrabacion= By.xpath("//img[@src='/svg/stop.svg']");
    public final By buttonReproducionGrabacion= By.xpath("//img[@src='/svg/play.svg']");
    public final By buttonVolverAGrabar= By.xpath("//span[contains(text(),'Volver a grabar')]");
    public final By buttonContinuar2= By.xpath("//span[@class='cursor-pointer text-center btn hoverBtn btnGrabadora']");
    public final By textMensajeBienvenida= By.xpath("//p[@class='font-inter text-center font-normal w-full mb-6']");
    //public final By buttonComprar= By.xpath("//div[@class='btnCompra flexCenter w-full']");
    public final By buttonComprar= By.xpath("//button[@type='submit']");


    @Step("Validar ingreso correcto a la página de grabar audio operación mayo")
    public void validarUrlGrabarAudioOperacionMayo(){
        assertEquals(getDriver().getCurrentUrl(),urlGrabarAudioOperacionMayo);
    }

    @Step("Click a botón siguiente")
    public void clickAlBotonSiguiente1(){
        esperarPorElementoVisible(tittleOperacionMayo);
        esperarPorElementoVisible(cajaOnboarding);
        esperarPorElementoClickeable(buttonSiguiente);
        moverAElemento(cajaOnboarding);
        moverAElemento(buttonSiguiente);
        forzarClickJS(buttonSiguiente);
        forzarClickJS(buttonSiguiente);
    
    }

    @Step("Click a botón siguiente2")
    public void clickAlBotonSiguiente2(){
        esperarPorElementoVisible(textUnHomenaje);
        forzarClickJS(buttonSiguiente);
    }

    @Step("Click a botón Iniciar")
    public void clickAlBotonIniciar(){
        moverAElemento(cajaOnboarding);
        esperarPorElementoVisible(containerbuttonIniciar);
        forzarClickJS(buttonIniciar);
    }

    @Step("Ingresar nombre")
    public void ingresarNombre(String nombre){
        esperarPorElementoVisible(inputNombre);
        WebElement webeinputNombre = find(inputNombre);
        typeInto(webeinputNombre,nombre);
    }

    @Step("Ingresar email")
    public void ingresarEmail(String email){
        WebElement webeinputEmail= find(inputEmail);
        typeInto(webeinputEmail,email);
    }

    @Step("Click al botón continuar 1")
    public void clickAlBotonContinuar1(){
        esperarPorElementoVisible(buttonContinuar1);
        esperarMilisegundos(5000);
        find(buttonContinuar1).click();
    }

    @Step("Validar que aparezco el texto de mensaje de grabacion")
    public void validarTextoMensajeDeGrabacion(){
        boolean rta = find(textMensajeParaGrabacion).isVisible();
        assertEquals(rta, true);
    }

    @Step("Click al botón grabar")
    public void clickAlBotonGrabar(){
        find(buttonIniciarGrabar).click();
        aceptarAlertaVisible();
        esperarMilisegundos(3000);
    }

    @Step("Click al botón detener grabación")
    public void clickAlBotonDetenerGrabacion(){
        find(buttonStopGrabacion).click();
    }

    @Step("Click al botón escuchar grabación")
    public void clickAlBotonEscucharGrabacion(){
        find(buttonReproducionGrabacion).click();
        esperarMilisegundos(3500);
    }

    @Step("Click al botón continuar 2")
    public void clickBotonContinuar2(){
        find(buttonContinuar2).click();
    }

    @Step("Click al botón comprar")
    public void clickBotonComprar(){
        find(buttonComprar).click();
    }

}


