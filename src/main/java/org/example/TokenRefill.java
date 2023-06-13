package org.example;

public class TokenRefill extends Thread {
    Bucket bucket;

    public TokenRefill(Bucket bucket){
        this.bucket=bucket;
    }

    public void run(){
        while(true) {
            bucket.addToken();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
