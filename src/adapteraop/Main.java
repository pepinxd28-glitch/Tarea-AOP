package adapteraop;

public class Main {
    public static void main(String[] args) {
        // 1. El cliente define que quiere usar un Motor estándar
        Motor motor = new Motor() {
            @Override
            public void encender() {
                // En AOP, el cuerpo de este método puede estar vacío o tener lógica genérica,
                // porque el Aspecto se encargará de interceptar esta llamada.
                System.out.println("Intentando encender el motor de forma genérica...");
            }
        };

        // 2. Simulación del Aspecto: En una ejecución AOP real, el framework 
        // interceptaría la línea de abajo automáticamente. Aquí lo invocamos para demostrarlo:
        AdaptadorMotorAspect aspecto = new AdaptadorMotorAspect();
        aspecto.interceptarYAdaptar(); 
        
        // El cliente simplemente ejecuta la acción que conoce
        // motor.encender(); 
    }
}
