/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import java.util.ArrayList;
import java.util.List;
import estructuras.Vino;

/**
 *
 * @author zeiruos
 */
public class VinoData {

    public VinoData() {
    }

    public ArrayList<Vino> construirVino() {

        ArrayList<Vino> vinos = new ArrayList<>();

        LecturaCSV lectura = new LecturaCSV();
        lectura.leerCSV("/datos-vino.csv"); // usar ruta absoluta para que funcione

        List<String[]> allData = lectura.getAllData();

        for (int i = 0; i < allData.size(); i++) {
            String a = allData.get(i)[5];
            double precio = 0;
            if (a.length() > 0) {
                precio = Double.parseDouble(allData.get(i)[5]);
            }
            String titulo = allData.get(i)[11];
            String vinedo = allData.get(i)[13];
            String variedad = allData.get(i)[12];
            String pais = allData.get(i)[1];
            String descripcion = allData.get(i)[2];

            vinos.add(new Vino(pais, descripcion, precio, titulo, variedad, vinedo));

        }

        return vinos;

    }
}
