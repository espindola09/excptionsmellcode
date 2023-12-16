public class AvoidCatchingThrowableExample {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
            throw new Throwable();
        } catch (Throwable t) {
            // Captura Throwable 
        }
    }
}