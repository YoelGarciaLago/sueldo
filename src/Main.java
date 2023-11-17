/**
 * @author Yoel García
 * @version v1.0
 */
public class Main {
    static Integer contador1000=0;
    static Integer  contador1750= 0 ;
    static Integer contadorMás1750= 0;
    
    /**
     * Aumenta contador según rango del sueldo del trabajador
     * @param args no recibe parámetros
     */
    public static void main(String[] args) {
        // Funciones obxFunciones= new Funciones();
        Trabajador auxTrabajador;
        /**
         * Aumenta contadores según el rango
         */
        
        do{
            auxTrabajador = Funciones.darAltaTrabajador();
            
            actualizarContadores(auxTrabajador);
            
        }while(auxTrabajador.getSalario()!=0);
        
        mostrarContadores();
        
    }
    
    private static void actualizarContadores(Trabajador auxTrabajador) {
        if(Funciones.obtenerSueldo1750(auxTrabajador.getSalario())){
            contador1750++;
        }
        else if(Funciones.obtenerSueldo1000(auxTrabajador.getSalario())){
            contador1000++;
        }
        else if(Funciones.obtenerSueldoMás1750(auxTrabajador.getSalario()) ){
            contadorMás1750++;
        }
    }
    
    public static void mostrarContadores() {
        System.out.println("Entre 1000 y 1750: "+contador1750+ "\nMenos de 1000: "+contador1000+ "\nMás de 1750: "+contadorMás1750);
    }
    
    
    
    
}