Restaurante
Integrantes:
estudiante 1
estudiante 2
estudiante 3



Stock y recetas de un restaurante
En base a un restaurante que no cuenta con un sistema o base de datos para mantener cuenta de su stock y libro de recetas, optamos por crear un programa que en base a esas necesidades, y el uso de las herramientas de programación orientada a objetos.
Patrones de diseño utilizados
Singleton: El patrón de diseño Singleton se utiliza para garantizar que solo haya una instancia de una clase en todo el sistema. En este caso, se puede utilizar para implementar la clase stock, ya que solo debe haber una instancia de esta clase en todo el sistema.
Factory: El patrón de diseño Factory se utiliza para crear objetos sin especificar la clase exacta de objeto que se va a crear. En este caso, se puede utilizar para implementar la clase ingrediente, ya que se pueden crear diferentes tipos de ingredientes (por ejemplo, IngredienteAlimento, IngredienteBebida, etc…).
Builder: El patrón de diseño Builder se utiliza para crear objetos complejos paso a paso. En este caso, se puede utilizar para implementar la clase Receta, ya que se pueden agregar ingredientes a la receta de manera gradual.
Observer: El patrón de diseño Observer se utiliza para notificar a los objetos que dependen de un objeto en particular cuando este objeto cambia. En este caso, se puede utilizar para notificar a los objetos que dependen de la clase stock cuando se actualiza la cantidad de un ingrediente.




UML

	
