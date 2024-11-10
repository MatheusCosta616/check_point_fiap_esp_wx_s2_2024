package com.example.cp2_1;

import java.util.Random;

public class DummyNucleotideoRandomGenerator implements NucleotideoRandomGenerator {
    private final char[] NUCL = {'A', 'C', 'T', 'G'};
    private final Random random = new Random();;

    public String generate(int sequenceSize) {
        char randomNucleotideo = this.NUCL[random.nextInt(this.NUCL.length)];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sequenceSize; i++) {
            stringBuilder.append(randomNucleotideo);
        }

        return stringBuilder.toString();
    }

} 