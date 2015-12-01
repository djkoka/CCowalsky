package classwork.multihreading.bank;

import java.util.Random;

/**
 * Created by CCowalsky on 30.11.2015.
 */
public class Bankier extends Thread {
    private Bank bank;
    private Random random = new Random();
    private long transCount;

    public Bankier(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            transCount++;
            int  randomAmount = random.nextInt(1000);
            boolean randomDirection = random.nextBoolean();
            bank.transaction(randomAmount, randomDirection);
        }
    }

    @Override
    public String toString() {
        return "Bankier{" +
                "transCount=" + transCount +
                '}';
    }
}
