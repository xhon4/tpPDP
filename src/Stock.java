import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Ingrediente> ingredientes;

    // Constructor
    public Stock() {
        this.ingredientes = new ArrayList<>();
    }

    // Getters y Setters
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    // Método para agregar un ingrediente al stock
    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    // Método para actualizar la cantidad de un ingrediente en el stock
    public void actualizarCantidad(Ingrediente ingrediente, double cantidad) {
        for (Ingrediente i : ingredientes) {
            if (i.getId() == ingrediente.getId()) {
                i.setCantidad(cantidad);
                break;
            }
        }
    }
}