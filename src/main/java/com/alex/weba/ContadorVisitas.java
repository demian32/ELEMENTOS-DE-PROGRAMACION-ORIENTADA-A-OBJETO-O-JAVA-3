
package com.alex.weba;

public class ContadorVisitas {
private static int contador;

    public static int getContador() {
        contador++;
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
