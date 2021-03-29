package nl.bioinf.nanotomy.webcontrol;

import nl.bioinf.nanotomy.model.DatabaseParser;
import nl.bioinf.nanotomy.model.EMDatabase;
import nl.bioinf.nanotomy.model.PublicationParser;
import nl.bioinf.nanotomy.model.Publication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping(value = "/home")
    public String getLandingPage(){
        return "landingpage";
    }

    @GetMapping(value = "/publications")
    public String getPublicationsPage(Model model){
        List<Publication> publications = PublicationParser.parsePublications();
        model.addAttribute("publications", publications);
        return "publications";
    }

    @GetMapping(value = "/EMDatabases")
    public String getOtherEMDatabasesPage(Model model){
        List<EMDatabase> databases = DatabaseParser.parseDatabases();
        model.addAttribute("databases", databases);
        return "databases";
    }
}
