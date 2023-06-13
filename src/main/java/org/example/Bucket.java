package org.example;

import java.time.LocalDateTime;

public class Bucket {
    int tokens;
    int maxSize;

    public Bucket(int maxSize) {
        this.tokens = 0;
        this.maxSize = maxSize;
    }

    public synchronized void addToken() {
        if (tokens >= maxSize) {
            return;
        }
        this.tokens += 1;
        System.out.println(LocalDateTime.now()+":Current token count:" + tokens);
    }

    public synchronized void consumeToken() {
        if (tokens == 0) {
            System.out.println(LocalDateTime.now()+":Rate limited, try again later");
            return;
        }
        tokens--;
    }
}
