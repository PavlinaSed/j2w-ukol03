package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class CardController {
    private final List<Card> listOfCards = List.of(
            new Card("Marge Simpson", "Amazon", "Leoše Janáčka 376", "Luhačovice", "763 26", "marge.simps@gmail.com", "727 777 222", "www.marges.com"),
            new Card("Homer Simpson", "Google", "Lázeňské náměstí 308", "Luhačovice", "763 26", "homer.simps@gmail.com", "727 772 222", "www.homers.com" ),
            new Card("Lisa Simpson", "IBM", "Betty Smetanové 391", "Luhačovice", "763 26", "lisa.simps@gmail.com", "727 722 222", "www.lisas.com"),
            new Card("Bart Simpson", "Apple", "Bezručova 414", "Luhačovice", "763 26", null, null, "www.barts.com")
    );

    @GetMapping("/")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("listOfCards", listOfCards);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("cardDetail", listOfCards.get(id));
        return modelAndView;
    }
}
