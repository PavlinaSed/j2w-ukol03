package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class CardController {
    private final List<Card> listOfCards = List.of(

            new Card("Marge Simpson", "Amazon", "Wall Street", "Springfield", "122 02", "marge.simps@gmail.com", "727 777 222", "www.marges.com"),
            new Card("Homer Simspon", "Google", "Piccadelly", "Springfield", "122 02", "homer.simps@gmail.com", "727 772 222", "www.homers.com" ),
            new Card("Lisa Simpson", null, "Regent Street", "Springfield", "122 02", "lisa.simps@gmail.com", "727 722 222", "www.lisas.com"),
            new Card("Bart Simmspon", "Apple", "BakerStreet", "Springfield", "122 02", null, null, "www.barts.com")
    );

    @GetMapping("/")
    public String seznam() {
        return "seznam";
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
}
