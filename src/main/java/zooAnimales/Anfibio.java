package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	public static int ranas;
    public static int salamandras;
    private final static ArrayList<Anfibio> listado = new ArrayList<>();

    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio() {
        listado.add(this);
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        listado.add(rana);
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        listado.add(salamandra);
        return salamandra;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

}
