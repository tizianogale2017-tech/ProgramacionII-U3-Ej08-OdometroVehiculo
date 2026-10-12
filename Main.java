package Ejercicio8_odometroVehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("AB123CD", "Fiat Cronos");

        double[] trayectos = {120.5, -30.0, 85.0, 0, 210.3};
        for (double km : trayectos) {
            if (auto.avanzar(km)) {
                System.out.println("Trayecto de " + km + " km registrado.");
            } else {
                System.out.println("Trayecto de " + km + " km rechazado: debe ser mayor a cero.");
            }
        }

        System.out.println(auto.getModelo() + " (" + auto.getPatente() + ") - kilometraje total: " + auto.getKilometraje() + " km");
    }
}
