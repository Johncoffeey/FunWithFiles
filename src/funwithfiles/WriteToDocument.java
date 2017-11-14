/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfiles;

import java.io.*;

/**
 * @author Danni
 */
class WriteToDocument {

    static void writeExampleOne() throws IOException {
        String test = "You can also add text this way Mr Thomas & Danni";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello?");
            writer.newLine();
            writer.write("Can you hear me?");
            writer.newLine();
            writer.write("No?");
            writer.newLine();
            writer.write("Then I \nAm\nOut\nOf\nHere!");
            writer.newLine();
            writer.write("SS");
            writer.newLine();
            writer.write(test);
        }
    }

}
