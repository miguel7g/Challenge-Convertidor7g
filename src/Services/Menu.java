package Services;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Menu {

    public void mostrarMenu(){
        System.out.println("==============================================================================================================================\n");
        System.out.println("                  **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷**                ");
        System.out.println("                          ****[💰 DIGITE LA OPCION QUE USTED REQUIERA REALIZAR  💰]****                                     ");
        String menuPrincipal = """
                                                         ««««««««««««««««««««««««««««»»»»»»»»»»»»»»»»»»»»»»»»»»»                                     
                                                         »    Opcion N°1→ Realizar una conversión              «
                                                         »    Opcion N°2→ Consultar historial de conversiones  «
                                                         »    Opcion N°3→ Salir                                «
                                                         ««««««««««««««««««««««««««««»»»»»»»»»»»»»»»»»»»»»»»»»»»
                                """;
        System.out.println(menuPrincipal);
    }

    public int leerOpcionPrincipal(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("*******************************************************************************************************************************");
        System.out.println("              *******  SELECIONE LA OPCION  CORRESPONDIENTE QUE DESEA REALIZAR: « N° 1,2 o 3 » *******       ");
        return lectura.nextInt();
    }
    private final String monedasDisponibles = """
            ***********************************************************************************************************************************************
            ===============================================================================================================================================
                               **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷**
                            ********************[💰 PRESENTACION DE NUESTRAS MONEDAS 💰]************************
                            
                                              ««««««««««««««««««««««««««««»»»»»»»»»»»»»»»»»»»»»»»»»»»
                                              »  OPCIONES                                           «
                                              »   USD[💲] --- Dólar Estadounidense💵                «
                                              »   ARS[💲] --- Peso Argentino💰                       «
                                              »   BRL[R💲]--- Real Brasileño💰                       «
                                              »   COP[💲] --- Peso Colombiano💰                      «
                                              »   EUR[€] --- Euro💶                                 «
                                              ««««««««««««««««««««««««««««»»»»»»»»»»»»»»»»»»»»»»»»»»»           
                                    """;

    public void mostrarMenuMonedas(String denominacion){
        System.out.println(monedasDisponibles);
        System.out.println("**********************************************************************************************************************************");
        System.out.println(" ***** SELECIONE LA DENOMMINACION QUE USTED »»»[" + denominacion + "]««« Y DESEA CAMBIAR O SABER LA CANTIDAD: ***** ");
    }

    public String leerOpcionMoneda(){
        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine().toLowerCase();
        while (!monedasDisponibles.toLowerCase().contains(opcion)) {
            System.out.println("===============================================================================================================================");
            System.out.println("                  **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷** ");
            System.out.println("                  ****************Lo sentimos su opción es: [ INVALIDA ]********************");
            System.out.println("                  ****** Por favor, elija una opción: [ CORRECTA ] de nuestro menú 👆.******" );
            System.out.println("===============================================================================================================================\n");
            opcion = lectura.nextLine().toLowerCase();
        }
        System.out.println("************************************************************************************************************************************");
        System.out.println("=====================================================================================================================================\n");
        return opcion.toUpperCase();
    }

    public Double leerCantidadACambiar(){
        System.out.println("*************************************************************************************************************************************");
        System.out.println("         ***** SELECIONE LA CANTIDAS QUE USTED »»»[ DESEA ]««« CAMBIAR O SABER LA CANTIDAD: *****              ");
        Scanner lectura = new Scanner(System.in);
        double cantidad;
        while (!lectura.hasNextDouble()) {
            System.out.println("=================================================================================================================================");
            System.out.println("                  **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷** ");
            System.out.println("          ****************LOS ENTIMOS LA CANTIDA INGGRESADA ES UN NUMERO: [ INVALIDO ]********************");
            System.out.println("                            ****** POR FAVOR ELIJAUNA OPCION: [ CORRECTA ] ******" );
            System.out.println("                      ****** SI SU CANTIDAD TIENE DESIMALES UTILICE UNA COMA [00,0] ******" );
            System.out.println("=================================================================================================================================\n");

            lectura.nextLine();
        }
        cantidad = lectura.nextDouble();
        lectura.nextLine();
        return cantidad;
    }

    public Double cantidadObtenida(String monedaQueTiene, Double cantidadCambiar, Double tasaDeConversion, String monedaFinal){
        Double resultado = cantidadCambiar * tasaDeConversion;
        System.out.println("*****************************************************************************************************************************************");
        System.out.println("                 »»» EL MONTO INGRESADO ["+ cantidadCambiar + " " + monedaQueTiene + "] EN ESTE MOMENTO REPRESENTA UN TOTAL DE : [" + resultado + " " + monedaFinal+"]«««");
        System.out.println("******************************************************************************************************************************************\n");
        return resultado;
    }

    public void imprimirConversiones(ArrayList<Conversion> listaDeConversiones) {
        if (listaDeConversiones.isEmpty()) {
            System.out.println("========================================================================================================================================");
            System.out.println("                  **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷** ");
            System.out.println("      **************** LO SENTIMOS POR AHORA USTED NO POSEE: [ HISTORIA DE TRANSACCIONES ]********************");
            System.out.println("========================================================================================================================================\n");
        } else {
            System.out.println("=========================================================================================================================================");
            System.out.println("                  **💶*💵*💴*💸*💷* [💰] L@ CHIVA7🐐 CASADECAMBIO [💰] *💶*💵*💴*💸*💷** ");
            System.out.println("             **************** PRESENTAMOS SU : [ HISTORIAL DE TRANSACCIONES ]********************");
            System.out.println("=========================================================================================================================================\n");
            for (int i = 0; i < listaDeConversiones.size(); i++) {
                Conversion conversion = listaDeConversiones.get(i);
                System.out.println("CANTIDAD DE CONVERSIONES: »»»»»" + (i + 1) + "««««««");
                System.out.println("MONEDA QUE POSEE: »»»»»[💰 " + conversion.getMonedaQueTiene()+" ]««««««");
                System.out.println("MONEDA QUE DESEA: »»»»»[💰 " + conversion.getMonedaQueBusca() +" ]««««««");
                System.out.println("CANTIDAD DE  [💰"+ conversion.getMonedaQueTiene()+" ] A CAMBIAR: »»»»»[ " + conversion.getCantidadACambiar() + " ]««««««");
                System.out.println("CANTIDAD DE  [💰"+ conversion.getMonedaQueBusca()+ " ] OBTENIDA: »»»»»[ " + conversion.getCantidadCambiada()+ " ]««««««");
                System.out.println("FECHA Y HORA : »»»»»[" + formatDateTime(conversion.getTiempo())+"]««««««");
                System.out.println("=====================================================================================================================================\n");

            }
        }
    }

    private String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy, HH:mm");
        return dateTime.format(formatter);
    }
}

