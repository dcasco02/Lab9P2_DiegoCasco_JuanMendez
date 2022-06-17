/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_diegocasco_juanmendez;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Carpeta {
    private String nombre;
    private String link;
    ArrayList <Carpeta> carpetas = new ArrayList();
    ArrayList <Archivos> archivo = new ArrayList();

    public Carpeta() {
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    public ArrayList<Archivos> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivos> archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "nombre=" + nombre + ", link=" + link + ", carpetas=" + carpetas + ", archivo=" + archivo + '}';
    }
    
}
