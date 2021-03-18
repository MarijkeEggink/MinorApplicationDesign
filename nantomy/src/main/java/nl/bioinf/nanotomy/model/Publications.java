package nl.bioinf.nanotomy.model;

import org.springframework.boot.SpringApplication;

public class Publications {
     private final String year;
     private final String Authors;
     private final String JournalDataset;
     private final String ShortTitle;
     private final String Link;

     public Publications(String year, String Authors, String JounalDataset, String ShortTitle, String link){
         this.year = year;
         this.Authors = Authors;
         this.JournalDataset = JounalDataset;
         this.ShortTitle = ShortTitle;
         this.Link = link;
     }

     public String getYear(){
         return year;
    }

    public String getJournalDataset(){
         return JournalDataset;
    }

    public String getAuthors() {
        return Authors;
    }

    public String getShortTitle() {
        return ShortTitle;
    }

    public String getLink() {
        return Link;
    }

}
