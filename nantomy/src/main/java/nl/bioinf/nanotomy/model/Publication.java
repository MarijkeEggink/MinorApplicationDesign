package nl.bioinf.nanotomy.model;

public class Publication {
     private final String year;
     private final String authors;
     private final String journal;
     private final String journalLink;
     private final String EMDataset;
     private final String datasetLink;

     public Publication(String year, String authors, String jounal, String journalLink, String EMDataset, String datsetLink){
         this.year = year;
         this.authors = authors;
         this.journal = jounal;
         this.journalLink = journalLink;
         this.EMDataset = EMDataset;
         this.datasetLink = datsetLink;
     }

    public String getYear(){
         return year;
    }

    public String getAuthors() {
        return authors;
    }

    public String getJournalDataset(){
        return journal;
    }

    public String getJournalLink() {
        return journalLink;
    }

    public String getEMDataset() {
        return EMDataset;
    }

    public String getEMLink() { return datasetLink; }

}
