package nl.bioinf.nanotomy.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This class parses the data from EMdatabases.csv,
 * this csv file contains information about other EM databases.
 * @version 1.0
 * @author Marijke Eggink, Bart Engels, Jelle Becirspahic
 */
public class DatabaseParser {
    // file not found error?
    public static List<EMDatabase> parseDatabases(){
        Path path = Paths.get("src/main/resources/data/EMdatabases.csv");

        List<EMDatabase> databases = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(path)){
            String line;

            while ((line = reader.readLine()) != null){
                String[] elements = line.split(";");
                String website = elements[0];
                String websiteLink = elements[1];
                String organization = elements[2];
                String topics = elements[3];
                String species = elements[4];
                String mainTechniques = elements[5];
                EMDatabase database = new EMDatabase(website, websiteLink, organization, topics, species, mainTechniques);
                databases.add(database);
                }
            } catch (IOException exception) {
            exception.printStackTrace();
        }
        return databases;
    }
}
