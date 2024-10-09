import java.util.ArrayList;
import java.util.List;

public class Receta {
    private int id;
    private String nombre;
    private List<Ingrediente> ingredientes;

    // Constructor
    public Receta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    // Método para agregar un ingrediente a la receta
    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }
}