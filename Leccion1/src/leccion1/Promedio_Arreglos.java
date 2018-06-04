/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    PROGRAMA QUE PERMITE CALCULAR EL PROMEDIO DE VARIOS ARREGLOS
*/
package leccion1;

/**
 *
 * @author Carlos
 */
public class Promedio_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Arreglos globales inicialiazados.
        int arreglo1[] = {110, 220, 430, 140, 250, 460};
        int arreglo2[] = {10, 20, 30, 40, 50, 60};
        
        //Arreglo global no inicializado
        double arreglo3[] = new double[6]; // almacena los valores resultantes de la division entre 'arreglo1' y 'arreglo2'.
        
        //Varriables globales
        String cadena; //guardara cada concatenacion de la variable.
        double suma = 0;//Guardara la suma de todos los valores del 'arreglo3'.
        double promedio; // Guarda el promedio del 'arreglo3'.
        
        //Valores iniciales de la variable 'cadena'.
        cadena = String.format("\n%30s\n\n%-15s%-15s%s\n", "REPORTE DE PROMEDIOS", "Arreglo 1", "Arreglo 2", "Resultado");
        cadena = String.format("%s%-15s%-15s%s\n", cadena, "------- -", "------- -", "---------");// Subrayado de Encabezados
        
        //Ciclo que permite llenar el 'arreglo3'
        for (int contador = 0; contador < arreglo1.length; contador++) {
            arreglo3[contador] = arreglo1[contador] / arreglo2[contador];// Calcula la division entre 'arreglo1' y 'arreglo2'.
            //Primera concatenacionde la variable cadena.
            cadena = String.format("%s%-15d%-15d%.0f\n", cadena, arreglo1[contador], arreglo2[contador], arreglo3[contador]);
        }
        
        //Ciclo que permite calcular el promedio del 'arreglo3'
        for (int contador = 0; contador < arreglo3.length; contador++) {
            suma = suma + arreglo3[contador]; // Acumula la suma de todos los valores del 'arreglo3'.
        }
        promedio = suma / arreglo3.length; // Se divide el total de la suma y el tamaño del 'árreglo3'
        
        //Valor final de la variable 'cadena'.
        cadena = String.format("%s\n%s %.1f\n%35s\n", cadena, "El promedio del 'Arreglo 3' es:", promedio, "---");
        System.out.println(cadena); // Presenta en pantalla lo que contiene la variable 'cadena'.
    }

}
