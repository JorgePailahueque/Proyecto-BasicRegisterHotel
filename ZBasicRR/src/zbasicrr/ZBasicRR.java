
package zbasicrr;

import java.util.Scanner;

public class ZBasicRR {

    public static void main(String[] args) {
        String nombreHotel="";
        boolean salida=false;
        int totalPiezas=15;
        int single=5;
        int doble=5;
        int familiar=5;
        String lista[][]=new String[totalPiezas-1][2];
        do{
            int op=leerN();
            boolean terminar=false;
            switch(op){
            case 1:
            break;
            case 2:
            do{
                menu();
                int o=leerN();
                switch(o){
                    case 1:
                        
                    break;
                    case 2:
                        piezasDisponibles(single,doble,familiar);
                    break;
                    case 3:
                        reservarHabitacion(lista,single,doble,familiar);
                    break;   
                    case 4:
                        
                }
            }while(terminar==false);
            break;
            default:
                System.out.println("opcion no vaida");
            break;
            }
        }while(salida==false);
        
    }
        public static int leerN(){
        boolean salida=false;
        int x=0;
        do{
            try{
                Scanner s= new Scanner(System.in);
                x=s.nextInt();
                if(x<0){
                    System.out.println("El numero no debe ser negativo, reingrese nuevamente");
                }else{
                salida=true;
                }
            }catch(Exception e){
                System.out.println("caracter ingresado no valido, reingrese nuevamente");
            }
        }while(salida=false);
        return x;
    }
    public static void menu(){
        System.out.println("1. Ver informacion del hotel\n2. Ver habitaciones disponibles"
                + "\n3. Reservar habitacion \n4. Abandonar Hotel \n5. Salir ");
    }
    public static void piezasDisponibles(int x,int y,int z){
        System.out.println("Piezas Dsponibles: \n1Piezas simples= "+x
                +"\nPiezas Dobles= "+y+"\nPiezas familiares= "+z);
    }
    public static String ingresoDatos(){
    String nombre="";
    String apellido="";
    Scanner s=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre=s.nextLine();
        System.out.println("ingrese su apellido");
        apellido=s.nextLine();
        return nombre+" "+apellido;
    }
    public static void reservarHabitacion(String[][]m,int x,int y ,int z){
        boolean salida=false;
        int i=0;
        int j=0;
        int op;
        do{
            if(m[i][j]==null){
                boolean terminar=false;
                m[i][j]=ingresoDatos();
                j++;
                do{
                System.out.println("seleccione habitacion \n1. Habitacion simple"
                        + "\n2. Habitacion doble \n3. Habitacion familiar");
                op=leerN();
                switch(op){
                    case 1:
                        m[i][j]="simple";
                        terminar=true;
                    break;
                    case 2:
                        m[i][j]="doble";
                        terminar=true;
                    break;
                    case 3:
                        m[i][j]="familiar";
                        terminar=true;
                    default:
                        System.out.println("opcion no valida");
                    break;
                }
                
                    for (int k = 0; k <m.length; k++) {
                        for (int l = 0; l < 2; l++) {
                            System.out.print(m[k][l]+" ");
                        }
                        System.out.println("");
                    }
                }while(terminar==false);
                salida=true;
            }
            if (i<m.length) {
                i++;
            }else{
                System.out.println("Lo sentimos, no se encuentran piezas disponibles");
                salida=true;
            }
        }while(salida==false);
    }
    public static void abandonarHotel(){
    
    }
}
