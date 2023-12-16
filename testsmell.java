public class TestClass {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
        } catch (Exception e) {
            // Bloque catch está vacío, lo que debería activar la regla EmptyCatchBlock
        }
    }
}