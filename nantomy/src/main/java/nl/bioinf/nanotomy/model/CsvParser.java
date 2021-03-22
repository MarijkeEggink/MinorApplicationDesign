package nl.bioinf.nanotomy.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public static List<Publication> parsePublications(){
        Path path = Paths.get("src/main/resources/data/publications.csv");

        List<Publication> publications = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line;
            int lineNumber = 0;

            while ((line = bufferedReader.readLine()) != null){
                lineNumber ++;
                if (lineNumber > 1){
                    String[] elements = line.split(";");
                    String year = elements[0];
                    String author = elements[1];
                    String journalDatabase = elements[2];
                    String journalLink = elements[3];
                    String EMDataset = elements[4];
                    String datasetLink = elements[5];

                    Publication publication  = new Publication(year, author, journalDatabase, journalLink, EMDataset, datasetLink);
                    publications.add(publication);
                }
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
        return publications;
    }
}
