/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import gestor.VinoData;
import java.util.ArrayList;

/**
 *
 * @author rol
 */
public class Vinos {

    private ArrayList<Vino> lista;

    public Vinos() {
        this.lista = new ArrayList<>();
        llenarLista();
    }

    private void llenarLista() {
        VinoData lector = new VinoData();
        this.lista = lector.construirVino();
    }

    public void printList(ArrayList<Vino> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void compararPrecio(int cantidad) {
        ArrayList<Vino> temporal = new ArrayList<>();
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getPrecio() > cantidad) {
                temporal.add(this.lista.get(i));
            }
        }
        
        printList(temporal);
        
    }

    public ArrayList<Vino> getLista() {
        return lista;
    }

}
