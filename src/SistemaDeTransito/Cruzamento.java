package SistemaDeTransito;

import java.util.concurrent.Semaphore;

public class Cruzamento {
    private Semaphore semaphore;

    public Cruzamento() {
        this.semaphore = new Semaphore(1);
    }

    public void cruzar() throws InterruptedException {
        semaphore.acquire();
    }
    public void liberar() {
        System.out.println(Thread.currentThread().getName() + " liberou o cruzamento.\n");
        semaphore.release();
    }
}


