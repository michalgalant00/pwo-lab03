package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SequenceTools {

    public static boolean writeToFile(
            FibonacciGenerator generator,
            int from, int to,
            String fileName) {
        try {
            BufferedWriter writer
                    = new BufferedWriter(new FileWriter(fileName));
            for (int i = from; i <= to; i++) {
                writer.write(generator.getTerm(i) + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    
    public static boolean writeToFile(
            LucasGenerator generator,
            int from, int to,
            String fileName) {
        try {
            BufferedWriter writer
                    = new BufferedWriter(new FileWriter(fileName));
            for (int i = from; i <= to; i++) {
                writer.write(generator.getTerm(i) + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
