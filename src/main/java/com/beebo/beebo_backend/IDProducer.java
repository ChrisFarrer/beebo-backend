package com.beebo.beebo_backend;

import java.util.concurrent.ThreadLocalRandom;
import java.time.Instant;

public class IDProducer {
  private static long counter;
  
  //returns hex string similar to UUID standard
  //UTC in hex - hex hash - counter 
  public static synchronized String getID() {
    ThreadLocalRandom rand = ThreadLocalRandom.current();
    
    long hash1 = rand.nextLong(64);
    long hash2 = rand.nextLong(64);
    String hex = Long.toHexString(hash1) 
                  + Long.toHexString(hash2);
   
    String time = Long.toHexString(Instant.now().toEpochMilli());
    
    String countHex = Long.toHexString(IDProducer.counter);
    countHex += 1;
    
    return time + "-" + hex + "-" + countHex;
  }
}
