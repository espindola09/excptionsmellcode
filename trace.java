public class PreserveStackTraceExample {
    public static void main(String[] args) {
        try {
            // Código que puede generar una excepción
            throw new Exception();
        } catch (Exception e) {
            // Captura y lanza una nueva excepción sin conservar la original
            throw new RuntimeException("Nueva excepción", e);
        }
    }
}