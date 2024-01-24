import SistemaDeTransito.Cruzamento;
import SistemaDeTransito.TrafficFlowA;
import SistemaDeTransito.TrafficFlowB;

public class Main {
    public static void main(String[] args) {
        Cruzamento cruzamento = new Cruzamento();
        TrafficFlowA fluxoA = new TrafficFlowA("TrafficFlowA" ,cruzamento);
        TrafficFlowB fluxoB = new TrafficFlowB("TrafficFlowB" ,cruzamento);

        fluxoA.start();
        fluxoB.start();
    }
}