package ArchiveOpener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ArchiveOpener {
    
    public static int[] openTenThousand() {
        List<Integer> list = new ArrayList<>();
    
        try {
            ClassLoader classLoader = ArchiveOpener.class.getClassLoader();
            InputStreamReader inputStreamReader = new InputStreamReader(classLoader.getResourceAsStream("ArrayArchives/OneThousand.txt"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("[", "").replace("]", "").replace(",", "");
                String[] values = line.split(" ");
                for (String value : values) {
                    int number = Integer.parseInt(value.trim());
                    list.add(number);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int[] openOneHundredThousand(){
        List<Integer> list = new ArrayList<>();
    
        try {
            ClassLoader classLoader = ArchiveOpener.class.getClassLoader();
            InputStreamReader inputStreamReader = new InputStreamReader(classLoader.getResourceAsStream("ArrayArchives/OneHundredThousand.txt"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("[", "").replace("]", "").replace(",", "");
                String[] values = line.split(" ");
                for (String value : values) {
                    int number = Integer.parseInt(value.trim());
                    list.add(number);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;    
    }
    

}
