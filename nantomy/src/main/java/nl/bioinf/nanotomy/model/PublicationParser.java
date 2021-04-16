package nl.bioinf.nanotomy.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This class parses the data from publications.tsv,
 * this tsv file contains each publication from nanotomy.org
 * @version 1.0
 */
public class PublicationParser {
    public static List<Publication> parsePublications(){
        Path path = Paths.get("src/main/resources/data/publications.tsv");

        List<Publication> publications = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] elements = line.split("\t");
                String year = elements[0];
                String author = elements[1];
                String journalDatabase = elements[2];
                String journalLink = elements[3];
                String EMDataset = elements[4];
                String datasetLink = elements[5];

                Publication publication  = new Publication(year, author, journalDatabase, journalLink, EMDataset, datasetLink);
                    
                publications.add(publication);
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return publications;
    }
}
