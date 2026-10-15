/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasesyobjeto.persona;
import com.mycompany.clasesyobjeto.persona.modelo.Persona;

/**
 *
 * @author Samuel
 */
public class ClasesYObjetoPersona {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona messi = new Persona("Lionel Messi", 39, "messigoat@hotmail.com");
        Persona neymar = new Persona("Neymar Jr", 35, "principe@gmail.com");
        messi.mostrarInfo();
        neymar.mostrarInfo();
    }
}
