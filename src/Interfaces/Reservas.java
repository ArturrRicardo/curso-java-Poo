package Interfaces;

public interface Reservas {
    public abstract void fazerCheckin(String nomeHospede, int dias);  // um metodo que faz checkin e precisa receber o nome e os dias que o hospede vai ficar hospedado
    public abstract void fazerCheckout(); // metodo para realizar checkout
}
