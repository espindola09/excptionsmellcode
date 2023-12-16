public class AvoidCatchingGenericExceptionExample {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
            throw new Exception();
        } catch (Exception e) {
            // Captura excepción genérica 
        }
    }
}