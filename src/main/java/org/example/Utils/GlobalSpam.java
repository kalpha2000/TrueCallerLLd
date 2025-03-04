package org.example.Utils;

import com.google.common.hash.BloomFilter;

public class GlobalSpam {
    BloomFilter<String> spamList;

    private GlobalSpam(){}

    public static final GlobalSpam INSTANCE = new GlobalSpam();
    public Boolean isSpam(String number){
        return null;
    }

    public void insertSpam(String number) {

    }
}
