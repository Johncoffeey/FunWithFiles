/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ddose
 */
public class CountLines
{

    public int getCountedLines() throws FileNotFoundException
    {
        File f = new File("C:\\Users\\Danni\\OneDrive\\Datamatiker\\1. Sem\\SCO - Software Construction\\NetBeans\\FunWithFiles\\brit-a-z.txt");
        Scanner sc = new Scanner(new BufferedReader(new FileReader(f)));
        int count = 0;
        while (sc.hasNext())

        {
            count++;
            String line = sc.nextLine();
            //System.out.println(line);
        }
        System.out.println(count);

        return count;
    }

}
