package org.example;

import jdk.nashorn.internal.parser.Token;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bucket bucket = new Bucket(5);
        TokenRefill tokenRefill = new TokenRefill(bucket);
        ApiCall apiCalls= new ApiCall(bucket);

        tokenRefill.start();
        apiCalls.start();
    }
}
