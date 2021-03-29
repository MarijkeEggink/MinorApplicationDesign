package nl.bioinf.nanotomy.model;

public class EMDatabase {
    private final String website;
    private final String websiteLink;
    private final String organization;
    private final String topics;
    private final String species;
    private final String mainTechniques;

    public EMDatabase(String website, String websiteLink, String organization, String topics, String species, String mainTechniques) {
        this.website = website;
        this.websiteLink = websiteLink;
        this.organization = organization;
        this.topics = topics;
        this.species = species;
        this.mainTechniques = mainTechniques;
    }

    public String getWebsite() {
        return website;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public String getOrganization() {
        return organization;
    }

    public String getTopics() {
        return topics;
    }

    public String getSpecies() {
        return species;
    }

    public String getMainTechniques() {
        return mainTechniques;
    }

    @Override
    public String toString() {
        return "EMDatabase{" +
                "website='" + website + '\'' +
                ", websiteLink='" + websiteLink + '\'' +
                ", organization='" + organization + '\'' +
                ", topics='" + topics + '\'' +
                ", species='" + species + '\'' +
                ", mainTechniques='" + mainTechniques + '\'' +
                '}';
    }
}
