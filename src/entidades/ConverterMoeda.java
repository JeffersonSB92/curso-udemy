
package entidades;

public class ConverterMoeda {

    public static double precoDolar;
    public static double dolarComprar;

    public static double convercao(){
        return precoDolar * dolarComprar *1.06;
    }

}