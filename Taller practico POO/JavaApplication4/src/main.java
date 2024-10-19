

/**
 *
 * @author jerem
 */// Clase abstracta Animal
abstract class Animal {
    // Método abstracto
    public abstract void hacerSonido();
}

// Clase Perro que extiende Animal
class Perro extends Animal {
    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

// Clase principal para probar
public class main {
    public static void main(String[] args) {
        // Crear una instancia de Perro
        Animal miPerro = new Perro();
        // Llamar al método hacerSonido()
        miPerro.hacerSonido();  // Esto debería imprimir "Guau"
    }
}


