/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package admos;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author luis
 */
@Named(value = "aActividades")
@RequestScoped
public class aActividades {

    //private ArrayList<Actividad> actividadesF;
    private ArrayList<Actividad> actividades;

    /**
     * Creates a new instance of aActividades
     */
    public aActividades() {
        actividades = new ArrayList();
        addActividades();

    }

    public void addActividades() {
        actividades.add(new Actividad(1,"sedentario", "poco o ningun ejercicio", 1.3,1.3));
        actividades.add(new Actividad(2,"Ligero", "Ejercicio ligero (1-3 dias a la semana)", 1.6,1.5));
        actividades.add(new Actividad(3,"Moderada", "Ejercicio moderado (3-5 dias a la semana)", 1.7,1.6));
        actividades.add(new Actividad(4,"Fuerte", "Ejercicio fuerte (6-7 dias a la semana)", 2.1,1.9));
        actividades.add(new Actividad(5,"Muy fuerte", "Ejercicio muy fuerte (dos veces al dia, entrenamientos muy duros)", 2.4,2.6));
    }

    /*
    public void addActividadesF() {
        actividadesF.add(new Actividad("sedentario", "poco o ningun ejercicio", 1.3));
        actividadesF.add(new Actividad("poco", "Ejercicio ligero (1-3 dias a la semana)", 1.7));
        actividadesF.add(new Actividad("regular", "Ejercicio moderado (3-5 dias a la semana)", 1.6));
        actividadesF.add(new Actividad("ejercicio", "Ejercicio fuerte (6-7 dias a la semana)", 1.9));
        actividadesF.add(new Actividad("deportista", "Ejercicio muy fuerte (dos veces al dia, entrenamientos muy duros)", 2.2));
    }
     */

    /*
    public ArrayList<Actividad> getActividadesF() {
        return actividadesF;
    }

    public ArrayList<Actividad> getActividadesM() {
        return actividadesF;
    }

    public Actividad getActividadA(int g) {
        return actividadesM.get(g);
    }
*/
    public Actividad getActividad(int a){
        return actividades.get(a);
    }
    public ArrayList<Actividad> getActividades() {
        return actividades;
    }
    

    public class Actividad {
        /*
        private String actividad;
        private String descripcion;
        private double indice;
        */
        private int na;
        private String nombre;
        private String descripcion;
        private double indice_m;
        private double indice_f;

        public Actividad(int na, String nombre, String descripcion, double indice_m, double indice_f) {
            this.na = na;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.indice_m = indice_m;
            this.indice_f = indice_f;
        }

        public int getNa() {
            return na;
        }

        public void setNa(int na) {
            this.na = na;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getIndice_m() {
            return indice_m;
        }

        public void setIndice_m(double indice_m) {
            this.indice_m = indice_m;
        }

        public double getIndice_f() {
            return indice_f;
        }

        public void setIndice_f(double indice_f) {
            this.indice_f = indice_f;
        }
        
     

    }
}
