public class AvoidCatchingNPEExample {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
            throw new NullPointerException();
        } catch (NullPointerException npe) {
            // Captura NullPointerException 
        }
    }
}