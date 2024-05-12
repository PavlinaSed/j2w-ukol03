package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class CardController {
    private final List<Card> listOfCards = List.of(
            new Card("Marge Simpson", "Amazon", "Wall Street", "Springfield", "122 02", "marge.simps@gmail.com", "727 777 222", "www.marges.com"),
            new Card("Homer Simpson", "Google", "Piccadelly", "Springfield", "122 02", "homer.simps@gmail.com", "727 772 222", "www.homers.com" ),
            new Card("Lisa Simpson", "IBM", "Regent Street", "Springfield", "122 02", "lisa.simps@gmail.com", "727 722 222", "www.lisas.com"),
            new Card("Bart Simpson", "Apple", "BakerStreet", "Springfield", "122 02", null, null, "www.barts.com")
    );

    @GetMapping("/")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("listOfCards", listOfCards);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public String detail() {
        return "detail";
    }
}
