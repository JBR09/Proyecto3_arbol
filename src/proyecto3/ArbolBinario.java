/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author josep_wht3r4a
 */
public class ArbolBinario {

    NodoArbol raiz;

    //constructor
    public ArbolBinario() {
        raiz = null;
    }

    // metodo para insertar
    public void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    // metodo arbol vacio
    public boolean estaVacio() {
        return raiz == null;
    }

    // metodo para recorrer arbol inOrden
    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato + r.nombre);
            inOrden(r.hijoDerecho);

        }
    }
    // metodo para recorrer arbol preOrden

    public void preOrden(NodoArbol r) {
        if (r != null) {
            System.out.println(r.dato + r.nombre);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);

        }
    }
    // metodo para recorrer arbol post Orden

    public void postOrden(NodoArbol r) {
        if (r != null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.println(r.dato + r.nombre);

        }
    }

    //metodo para buscar un node en el arbol
    public NodoArbol buscarNodo(int d) {
        NodoArbol aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.hijoIzquierdo;
            } else {
                aux = aux.hijoDerecho;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    //metodo para buscar un node en el arbol
    public void buscar(NodoArbol r) {
        System.out.println("progenitores femeninos\n");
        if ("maría".equals(r.nombre)) {
            System.out.println(r.toString());
        }
        if ("ana".equals(r.nombre)) {
            System.out.println(r.toString());
        }
        if ("alicia".equals(r.nombre)) {
            System.out.println(r.toString());
        }

    }

}
