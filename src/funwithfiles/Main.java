/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfiles;

import java.io.*;
import java.util.Scanner;

/**
 * @author ddose
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        CountLines countlines = new CountLines();
        countlines.getCountedLines();

        WriteToDocument writetodocument = new WriteToDocument();
        WriteToDocument.writeExampleOne();

        //        System.out.println("1");
        //        Main.readExampleOne();
        //        System.out.println("2");
        //        Main.readExampleTwo();
        //        System.out.println("3");
//                FunWithFiles.readExampleThree();
        //        Main.writeExampleOne();
        System.out.println("Done!");
    }

    public static void readExampleOne() throws FileNotFoundException {
        File f = new File("brit-a-z.txt");
        Scanner sc = new Scanner(f);
        int countLines = 0;
        while (sc.hasNext()) {
            countLines++;
            String line = sc.nextLine();
            System.out.println(line);
        }
        System.out.println(countLines);

    }

    public static void readExampleTwo() throws FileNotFoundException {
        File f = new File("C:\\Users\\Thomas\\OneDrive\\Programming\\Java\\FunWithFiles\\brit-a-z.txt");
        Scanner sc = new Scanner(new BufferedReader(new FileReader(f)));
        int count = 0;
        while (sc.hasNext())

        {
            count++;
            String line = sc.nextLine();
            System.out.println(line);
        }
        System.out.println(count);
    }

//    public static void readExampleThree() throws IOException
//    {
//        Path p = new File("C:\\Users\\ddose\\OneDrive\\Datamatiker\\1. Sem\\SCO - Software Construction\\NetBeans\\Main").toPath();
//
//        for (String line : Files.readAllLines(p, StandardCharsets.ISO_8859_1))
//        {
//            System.out.println(line);
//        }
//    }
//    public static void writeExampleOne() throws IOException
//    {
//        String test = "TEST";
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
//        {
//            writer.write("Hello?");
//            writer.newLine();
//            writer.write("Can you hear me?");
//            writer.write("No?");
//            writer.newLine();
//            writer.write("Then I \nAm\nOut\nOf\nHere!");
//            writer.newLine();
//            writer.write("SS");
//            writer.write(test);
//        }
//    }
}
