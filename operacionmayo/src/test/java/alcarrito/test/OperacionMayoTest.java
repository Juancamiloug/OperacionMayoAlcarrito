package alcarrito.test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import alcarrito.pages.alcarrito.checkout.CheckoutEnvioPage;
import alcarrito.pages.operacionMayo.OperacionMayoGrabarAudioPage;
import alcarrito.pages.operacionMayo.OperacionMayoHomePage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
@RunWith(SerenityRunner.class)
public class OperacionMayoTest{

    @Steps
    OperacionMayoHomePage operacionMayoHomePage;
    @Steps
    OperacionMayoGrabarAudioPage operacionMayoGrabarAudioPage;
    @Steps
    CheckoutEnvioPage checkoutEnvioPage;

    public final String nombre = "RobotQA";
    public final String email = "RobotQA@yopmail.com";

    @Test
    @DisplayName("Test de prueba flujo operación Mayo")
    public void testFlujoOperacionMayo() {
        operacionMayoHomePage.ingresoAHomeOperacionMayo();
        operacionMayoHomePage.validarUrlOperacionMayo();
        operacionMayoHomePage.clickProspero();
        operacionMayoGrabarAudioPage.validarUrlGrabarAudioOperacionMayo();
        operacionMayoGrabarAudioPage.clickAlBotonSiguiente1();
        operacionMayoGrabarAudioPage.clickAlBotonIniciar();
        operacionMayoGrabarAudioPage.ingresarNombre(nombre);
        operacionMayoGrabarAudioPage.ingresarEmail(email);
        operacionMayoGrabarAudioPage.clickAlBotonContinuar1();
        operacionMayoGrabarAudioPage.validarTextoMensajeDeGrabacion();
        operacionMayoGrabarAudioPage.clickAlBotonGrabar();
        operacionMayoGrabarAudioPage.clickAlBotonDetenerGrabacion();
        operacionMayoGrabarAudioPage.clickAlBotonEscucharGrabacion();
        operacionMayoGrabarAudioPage.clickBotonContinuar2();
        operacionMayoGrabarAudioPage.clickBotonComprar();
        checkoutEnvioPage.validarIngresoAAlcarritoProduccion();
    }

}
