public class App {
    public static void main(String[] args) {
        // Creamos un objeto Stock
        Stock stock = new Stock();

        // Creamos algunos objetos Ingrediente y los agregamos al stock
        Ingrediente ingrediente1 = new Ingrediente(1, "", 100, "");
        Ingrediente ingrediente2 = new Ingrediente(2, "", 50, "");
        Ingrediente ingrediente3 = new Ingrediente(3, "", 20, "");

        stock.agregarIngrediente(ingrediente1);
        stock.agregarIngrediente(ingrediente2);
        stock.agregarIngrediente(ingrediente3);

        // Creamos una receta y agregamos ingredientes a ella
        Receta receta = new Receta(1, "");
        receta.agregarIngrediente(ingrediente1);
        receta.agregarIngrediente(ingrediente2);

        // Imprimimos la receta y sus ingredientes
        System.out.println("Receta: " + receta.getNombre());
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            System.out.println("  - " + ingrediente.getNombre() + " (" + ingrediente.getCantidad() + " " + ingrediente.getUnidad() + ")");
        }

        // Actualizamos la cantidad de un ingrediente en el stock
        stock.actualizarCantidad(ingrediente1, 80);

        // Imprimimos el stock actualizado
        System.out.println("Stock:");
        for (Ingrediente ingrediente : stock.getIngredientes()) {
            System.out.println("  - " + ingrediente.getNombre() + " (" + ingrediente.getCantidad() + " " + ingrediente.getUnidad() + ")");
        }
    }
}