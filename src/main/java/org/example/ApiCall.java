package org.example;

public class ApiCall extends Thread {

    Bucket bucket;

    public  ApiCall(Bucket bucket) {
        this.bucket = bucket;
    }

    public void run() {
        while (true) {
            bucket.consumeToken();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
