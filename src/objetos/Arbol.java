/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zerep08
 */
public class Arbol {
    private String raiz;
    List <String>nodIzqrda = new ArrayList<String>();
    List <String>nodDerecha = new ArrayList<String>();
    
    public Arbol(){
        
    }
    public void nodoIzquierda(String str){    
        nodIzqrda.add(str);
        
    }
    
    public void nodoDerecha(String str){
        nodDerecha.add(str);
    }
    
    public void imprimir(){
        for (int i = 0; i < nodIzqrda.size(); i++) {
            System.out.print(nodIzqrda.get(i));
       }
        
        for (int j = 0; j < nodDerecha.size(); j++) {
            System.out.print(nodDerecha.get(j));
        }
    
    }

    /**
     * @return the raiz
     */
    public String getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }
    
    
}
