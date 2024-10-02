/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_archivos_mascotas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class administradorMascotas {
    private ArrayList<Mascota> mascotas = new ArrayList();
    private File archivo = null;

    public administradorMascotas() {
    }
    
    public administradorMascotas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribir() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < mascotas.size();i++){
                bw.write(mascotas.get(i).getNombre()+"|");
                bw.write(mascotas.get(i).getRaza()+"|");
                bw.write(mascotas.get(i).getPeso()+"|");
                bw.write(mascotas.get(i).getPrecio()+"|");
                bw.write(mascotas.get(i).isTerrestre()+"|");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargar() {
        Scanner sc = null;
        mascotas = new ArrayList();
        if (archivo.exists()) {
          try {
           sc = new Scanner(archivo);
            sc.useDelimiter("|");
            while (sc.hasNext()) {
                mascotas.add(new Mascota(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextBoolean()));
            }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
         sc.close();
        }
    }
    
    
}
