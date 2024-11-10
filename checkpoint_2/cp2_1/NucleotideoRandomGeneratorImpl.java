package com.example.cp2_1;

import java.util.Random;

public class NucleotideoRandomGeneratorImpl implements NucleotideoRandomGenerator{

    private static final char[] NUCL = {'A', 'C', 'T', 'G'};
    private final Random random = new Random();

    @Override
    public String generate(int sequenceSize){
        StringBuilder builder = new StringBuilder(sequenceSize);
        for (int i = 0; i < sequenceSize; i++) {
            builder.append(NUCL[random.nextInt(NUCL.length)]);
        }

        return builder.toString();
    }
}
