/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesclase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Municipio de Gye
 */
public class ColeccionesClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] array = new int[10];
//        for(int i = 0; i<10; i++){
//            array[i] = i;
//        }
//        
//        int[] array2  = new int[10 * 2];
//        for(int i = 0; i<10; i++){
//            array2[i] = array[i];
//        }
        

        
        LinkedList<Integer> linked = new LinkedList<>();
        ListIterator iter = linked.listIterator();
        ListIterator iter2 = linked.listIterator(linked.size());
        while(iter.hasNext());
        while(iter2.hasPrevious()){
        
        }
        
        Comparator<Persona> comp = new Comparator<Persona>(){
            @Override
            public int compare(Persona o1, Persona o2) {
               return o1.getEdad() - o2.getEdad();
            }
            
        };
//        TreeSet<Persona> set = new TreeSet<>((Persona p, Persona p2) -> 
//                                                p.getEdad() - p2.getEdad());
        
        TreeSet<Persona> set = new TreeSet<>(comp);
        set.add(new Persona("", 10, ""));
        set.add(new Persona("", 20, ""));
        set.add(new Persona("", 5, ""));
        System.out.println(set);
        //set.retainAll(set); interseccion
        //set.removeAll(set); diferencia
        //set.addAll(set); union
        
        Map<String, String> mapa = new TreeMap<>();
        mapa.put("P002", "Large Widget");
        mapa.put("P001", "Widget");
        mapa.put("P002", "X-large-Widget");
        
        for(String s: mapa.keySet())
            System.out.println(s + " " + mapa.get(s)); 
        
    }
    
}
