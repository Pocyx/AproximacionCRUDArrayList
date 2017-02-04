/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontarjetasonido;

/**
 *
 * @author PocyxDesigner
 */
public class Tarjeta {
    private String tipo;
    private String marca;
    private double precio;
    private int id=0;
    
    
    public Tarjeta(){
        this.tipo = "";

    }
    public Tarjeta(int id){
        this.id=id;
    }
    
    public Tarjeta(String tipo,String marca,double precio){
        id++;
        this.marca=marca;
        this.tipo=tipo;
        this.precio=precio;
    }
    
    /**
     *
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo this
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarjeta other = (Tarjeta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param marca this
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id this
     */
    public void setId(int id) {
        this.id = id;
    }   

    /**
     *
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio this
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }    

    
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nTargeta: ");
        sb.append(id);
        
        sb.append("\nTipo: ");
        sb.append(tipo);
        
        sb.append("\nMarca: ");
        sb.append(marca);  
        
        sb.append("\nPrecio: \n");
        sb.append(precio+"\n");
        
        return sb.toString();
    }

    
}
