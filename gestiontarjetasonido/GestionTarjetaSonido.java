/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontarjetasonido;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class GestionTarjetaSonido {
    static Scanner s = new Scanner(System.in);

    //private static Iterable<Tarjeta> tarjetas;
    static ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
    Tarjeta tarjeta;
    static int N;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
        boolean fin = false;
        do{
            System.out.println("Seleccione:\n1:Insertar\n2:Modificar\n3:Borrar\n4:Ver\n5:Salir");
            int opcion = Integer.parseInt(s.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Opción insertar: ");

                    do {
                        System.out.print("Número de tarjetas a introducir: ");
                        N = Integer.parseInt(s.nextLine());
                    }while(N < 0);
                    insertar();
                    break;
                case 3:
                    System.out.println("Opción borrar: ");
                    System.out.println("Introduzca el ID de la tarjeta para borrarla: ");
                    int con = Integer.parseInt(s.nextLine());//se rompe
                    //Tarjeta aux;
                    //tarjetas.set(con, null);
                    
                    tarjetas.remove(new Tarjeta(con));
                    
                    break;
                case 4:
                    ver();
                    break;
                case 5:
                    fin=true;
            }
        }while(fin!=true);
        
    }
    
    public static void insertar(){

        String tipo;
        String marca;
        double precio;
        Tarjeta aux;

        for(int i = 1; i <=N; i++){  

            System.out.println("Tipo: ");
            tipo = s.nextLine();          
                
            System.out.println("Marca: ");
            marca = s.nextLine();          
                
            System.out.println("Precio: ");
            precio = Double.parseDouble(s.nextLine());          
                
            aux = new Tarjeta();
            aux.setTipo(tipo);
            aux.setMarca(marca);
            aux.setPrecio(precio);
            if(tarjetas.isEmpty()){
                aux.setId(i);
            }else{
                aux.setId(1+tarjetas.size());
            }
            
            tarjetas.add(aux);
        }       
    }
    
    public static void ver(){
        for(int i=0;i<tarjetas.size();i++){
            System.out.print(tarjetas.get(i)+"\n ");
        }
    }
   
        
    
}
