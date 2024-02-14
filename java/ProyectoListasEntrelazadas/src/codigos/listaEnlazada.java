/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigos;

/**
 *
 * @author j2a0a
 */
public class listaEnlazada {
    Nodo cabeza;
    int size;

    public listaEnlazada() {
        this.cabeza = null;
        this.size = 0;
    }
    
    public void agregarPrimero(String texto) {
        if (cabeza == null) {
            cabeza = new Nodo(texto);
        } else {
            Nodo nodoNuevo = new Nodo(texto);
            nodoNuevo.setSiguiente(cabeza);
            cabeza = nodoNuevo;
        }
        size++;
    }

    public int getSize() {
        return size;
    }
    
    public boolean estaVacia(){
        return (cabeza == null) ? true : false;
    }
    
    public String obtenerMiembro(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while(contador < index){
            temporal = temporal.getSiguiente();
            contador++;
        }
        
        return temporal.getValor();
    }
    
    public void eliminarMiembro(int index){
        if(index == 0){
            cabeza = cabeza.getSiguiente();
        }
        else if (cabeza != null){
            int contador = 0;
            Nodo temporal = cabeza;
            while (contador < index - 1 && temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
                contador++;
            }

            if (temporal.getSiguiente() != null) {
                temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
                
            }
        }
        size--;
    }

    
}
