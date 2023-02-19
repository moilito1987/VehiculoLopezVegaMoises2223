
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoLopezVegaMoises2223 miVehiculoLopezVegaMoises2223;
        int stockActual;
        
        miVehiculoLopezVegaMoises2223 = new VehiculoLopezVegaMoises2223("Seat",18000,100);
        operativaVehiculosLopezVegaMoises2223(miVehiculoLopezVegaMoises2223, 50); 
        stockActual = miVehiculoLopezVegaMoises2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosLopezVegaMoises2223(VehiculoLopezVegaMoises2223 miVehiculoLopezVegaMoises2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoLopezVegaMoises2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoLopezVegaMoises2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
