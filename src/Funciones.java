/**
 * Funciones utilizadas en la CLASE Main
 */
import java.util.Scanner;
public  class Funciones {
    /**
     * comprueba si el sueldo está entre 1000 y 1750
     * @param  sueldo del trabajador
     * @return si está dentro del rango
     */
    
    public static Boolean obtenerSueldo1750(Double sueldo){
        
        if(sueldo>1000 && sueldo<1750){
            return true;
        }
        return false;
        
    }
    
    
    public static Boolean obtenerSueldo1000(Double sueldo){
        if(sueldo<=1000 && sueldo!=0){
            return true;
        }
        return false;
        
    }
    public static Boolean obtenerSueldoMás1750(Double sueldo){
        if(sueldo>=1750){
            return true;
        }
        return false;
        
    }
    
    public static Trabajador darAltaTrabajador(){
        Trabajador obxTrabajador= new Trabajador();
        //obxTrabajador.setNombre("Pipo");
        //obxTrabajador.setSalario(1222d);
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre: ");
        obxTrabajador.setNombre(sc.nextLine());
        System.out.println("Salario: ");
        obxTrabajador.setSalario(sc.nextDouble());
        return obxTrabajador;
    }
}
