package nl.bioinf.nanotomy.webcontrol;

import nl.bioinf.nanotomy.model.CsvParser;
import nl.bioinf.nanotomy.model.Publication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping(value = "/home")
    public String getLandingPage(){
        return "landingpage";
    }

    @GetMapping(value = "/publications")
    public String getPublicationsPage(Model model){
        List<Publication> publications = CsvParser.parsePublications();
        model.addAttribute("publications", publications);
        return "publications";
    }
}
