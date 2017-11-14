/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Danni
 */
public class WriteToDocument
{

    public static void writeExampleOne() throws IOException
    {
        String test = "You can also add text this way";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
        {
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
