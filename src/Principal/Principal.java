package Principal;

import Modelos.Conversor;
import Services.ConsultaAPIMoneda;
import Services.Conversion;
import Services.Menu;

import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        int opciones = 0;
        ConsultaAPIMoneda consultaInformacio = new ConsultaAPIMoneda();
        ArrayList<Conversion> ConversionesList = new ArrayList<>();
        System.out.println("******************************************************************************************************************************  ");
        System.out.println("==============================================================================================================================\n");
        System.out.println("                    *******💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷*******  ");
        System.out.println("                           *******[💰] BIENVENID@S-BIENVENID@S-BIENVENID@S-BIENVENID@S [💰] *******\n");

        while (opciones != 3) {
            Menu menu = new Menu();
            menu.mostrarMenu();
            opciones = menu.leerOpcionPrincipal();

            switch (opciones) {
                case 1:
                    menu.mostrarMenuMonedas("POSEE");
                    String monedaQuePosee = menu.leerOpcionMoneda();
                    menu.mostrarMenuMonedas("QUIERE");
                    String monedaQueQiere = menu.leerOpcionMoneda();
                    Double cantidadACambiar = menu.leerCantidadACambiar();
                    Conversor conversor = consultaInformacio.buscaMoneda(monedaQuePosee);
                    Double tasaDeConversion = conversor.getConversionRate(monedaQueQiere .toUpperCase());
                    Double cantidadRecibida = menu.cantidadObtenida(monedaQuePosee, cantidadACambiar, tasaDeConversion, monedaQueQiere);
                    Conversion nuevaConversion = new Conversion(monedaQuePosee, monedaQueQiere, cantidadACambiar, cantidadRecibida);
                   ConversionesList.add(nuevaConversion);
                    break;
                case 2:
                    menu.imprimirConversiones(ConversionesList);
                    break;
                case 3:
                    System.out.println("=================================================================================================================\n");
                    System.out.println("                **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷** ");
                    System.out.println("                               *******GRACIAS POR PREFERIRNOS********                    ");
                    System.out.println("                                     *******[ SALIENDO💨 ] *******                       \n");
                    System.out.println("=================================================================================================================\n");
                    break;
                default:
                    System.out.println("=================================================================================================================\n");
                    System.out.println("                **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷** ");
                    System.out.println("                      *******Lo sentimos su opción es: [ INVALIDA ] *******              ");
                    System.out.println("                *******Por favor, elija una opción: [ CORRECTA ] de nuestro menú 👆 *******\n");
                    System.out.println("=================================================================================================================\n");

            }

        }
    }
}
