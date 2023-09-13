package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	public static int caballos;
    public static int leones;
    private final static ArrayList<Mamifero> listado = new ArrayList<>();
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero() {
        listado.add(this);
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        listado.add(caballo);
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        listado.add(leon);
        return leon;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public int getPatas() {
        return patas;

    }
}
