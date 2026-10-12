package Ejercicio8_odometroVehiculo;

public class Vehiculo {
    private String patente;
    private String modelo;
    private double kilometrajeAcumulado;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.kilometrajeAcumulado = 0;
    }

    public boolean avanzar(double kilometros) {
        if (kilometros <= 0) {
            return false;
        }
        kilometrajeAcumulado += kilometros;
        return true;
    }

    public double getKilometraje() {
        return kilometrajeAcumulado;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
}
