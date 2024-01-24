package SistemaDeTransito;

public class TrafficFlowA extends Thread {
    private Cruzamento cruzamento;

    public TrafficFlowA(String nome, Cruzamento cruzamento) {
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

