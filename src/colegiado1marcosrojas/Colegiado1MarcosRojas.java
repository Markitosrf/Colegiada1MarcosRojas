
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado1marcosrojas;

/**
 *
 * @author Marco
 */
public class Colegiado1MarcosRojas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion1 = new Cancion();
        
        cancion1.setId(6756);
        cancion1.setAnio(1984);
        cancion1.setAutor("Michael Jackson");
        cancion1.setDuracion("5:58");
        cancion1.setTitulo("Thriller");
        
        System.out.println(cancion1.getId());
        System.out.println(cancion1.getAnio());
        System.out.println(cancion1.getAutor());
        System.out.println(cancion1.getDuracion());
        System.out.println(cancion1.getTitulo());

        
    }
    
}
