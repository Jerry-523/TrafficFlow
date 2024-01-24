package SistemaDeTransito;

public class TrafficFlowB extends Thread {
    private Cruzamento cruzamento;

    public TrafficFlowB(String nome, Cruzamento cruzamento) {
        super(nome);
        this.cruzamento = cruzamento;
    }

    @Override
    public void run() {
        while (true) {
            try {

                cruzamento.cruzar();

                System.out.println(getName() +" está cruzando o cruzamento");

                Thread.sleep(3000);

                cruzamento.liberar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
