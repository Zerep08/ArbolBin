/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import objetos.Arbol;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jdura
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> entrada = new ArrayList<String>();
        String temp;
        String str;
        char ch;
        int fin = 0;
        int inicio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa en orden alfabetico los datos del arbol binario finaliza con $ y separalos con *");
        do {
            temp = sc.nextLine();
            entrada.add(temp);
        } while (temp.equals("$") != true);

        for (int i = 0; i < entrada.size(); i++) {
            if (entrada.get(i).equals("*") || entrada.get(i).equals("$")) {
                 Arbol arbol = new Arbol();
                fin = i - 1;
                arbol.setRaiz(entrada.get(fin));
                while (fin >= inicio) {
                    for (int j = 0; j <entrada.get(fin).length(); j++) {
                          
                        if (entrada.get(fin).codePointAt(j) <= arbol.getRaiz().codePointAt(0)) {
                            ch =entrada.get(fin).charAt(j);
                            str = Character.toString(ch);
                            arbol.nodoIzquierda(str);
                            
                        } else {
                            ch =entrada.get(fin).charAt(j);
                            str = Character.toString(ch);
                            arbol.nodoDerecha(str);
                        }
                    }
                    fin--;
                }
                fin = i;
                inicio = fin + 1;
               arbol.imprimir();
               System.out.println("");
            }
        }
    }

}
