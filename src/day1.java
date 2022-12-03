import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class day1 
{
    public day1(String filename)
    {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> ilist = new ArrayList<>();
        try
        {
            File f = new File(filename);
            Scanner r = new Scanner(f);
            while (r.hasNextLine())
            {
                list.add(r.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        int current = 0;
        int max = 0;
        int number = 0;
        int counter = 1;
        for (String l : list)
        {
            if (l!="")
            {
                current = current + Integer.parseInt(l);
            }
            else
            {
                ilist.add(current);
                if (max<current)
                {
                    max = current;
                    number = counter;
                }
                current = 0;
                counter++;
            }
        }
        System.out.println(number);
    }

}
