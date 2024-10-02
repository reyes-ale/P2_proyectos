package clase20140529;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class administrarPersonas {

    private ArrayList<Persona> listaPersonas = new ArrayList();
    private File archivo = null;

    public administrarPersonas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getedad() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Persona(sc.nextInt(),
                                    sc.next(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
