package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	 public static int iguanas;
	    public static int serpientes;
	    private final static ArrayList<Reptil> listado = new ArrayList<>();

	    private String colorEscamas;
	    private int largoCola;

	    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
	        super(nombre, edad, habitat, genero);
	        this.colorEscamas = colorEscamas;
	        this.largoCola = largoCola;
	        listado.add(this);
	    }

	    public Reptil() {
	        listado.add(this);
	    }

	    public static int cantidadReptiles() {
	        return listado.size();
	    }

	    @Override
	    public String movimiento() {
	        return "reptar";
	    }

	    public static Reptil crearIguana(String nombre, int edad, String genero) {
	        iguanas++;
	        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	        listado.add(iguana);
	        return iguana;
	    }

	    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
	        serpientes++;
	        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	        listado.add(serpiente);
	        return serpiente;
	    }

	    public String getColorEscamas() {
	        return colorEscamas;
	    }

	    public int getLargoCola() {
	        return largoCola;
	    }

}
