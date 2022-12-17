/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import javax.swing.JOptionPane;

/**
 *
 * @author josep_wht3r4a
 */
public class ArbolJB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        //7 carlos
        //4 maría
        //3 ana
        //5 jorge
        //10 luis
        //9 alicia
        //11 andres

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        ")Agregar un Nodo"
                        + "\n2)recorrer arbol inOrden"
                        + "\n3)recorrer arbol preOrden"
                        + "\n4)recorrer arbol postOrden"
                        + "\n5)buscar Nodo en el arbol"
                        + "\n6)progenitores femeninos"
                        + "\n7)Salir"
                        + "\nElige una opcion"));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el numero del nodo",
                                "agregando el nodo", JOptionPane.INFORMATION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingrese el nombre del nodo", "agregando el nodo",
                                JOptionPane.INFORMATION_MESSAGE);

                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol esta vacío", "!cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()) {
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol esta vacío", "!cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!arbolito.estaVacio()) {
                            arbolito.postOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol esta vacío", "!cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el numero del nodo a buscar",
                                    "buscando el nodo", JOptionPane.INFORMATION_MESSAGE));
                            if (arbolito.buscarNodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null,
                                        "El nodo no existe ", "!nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nodo encontrado, Datos del nodo: " + arbolito.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El arbol esta vacío", "!cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        arbolito.buscar(arbolito.raiz);

                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,
                                "Saliendo de la aplicación", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Opción incorrecta", "!cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 7);

    }

}
