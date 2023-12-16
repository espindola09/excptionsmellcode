public class AvoidRethrowingExceptionExample {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
            throw new Exception();
        } catch (Exception e) {
            // Captura y vuelve a lanzar la misma excepción
            throw e;
        }
    }
}