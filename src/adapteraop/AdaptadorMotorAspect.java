package adapteraop;

// Simulamos el aspecto para que no te dé errores de compilación
public class AdaptadorMotorAspect {

    // Conceptualmente, esto actúa como un @Before o @Around de AOP
    // Intercepta de forma invisible la llamada a Motor.encender()
    public void interceptarYAdaptar() {
        System.out.println("[AOP Interceptor]: Interceptando llamada a encender()...");
        
        // Acoplamos el comportamiento del motor eléctrico de forma transparente
        MotorElectrico motorElectrico = new MotorElectrico();
        motorElectrico.conectar();
    }
}
