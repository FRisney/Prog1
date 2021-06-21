package frisney.com.github.listacontatos.classes;

public class Identificacao {
    protected int infoID;
    protected static int lastID = -1;

    public static int newID() {
        return ++lastID;
    }
}
