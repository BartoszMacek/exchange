package pl.bartoszmacek.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bartoszmacek.exchange.services.ExchangeService;

@Controller
public class WelcomeController {

    final ExchangeService exchangeService;

    @Autowired
    public WelcomeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping ("/")
    public String index() {
        return "index";
    }

    @PostMapping ("/")
    public String index (@RequestParam("currencyName") String currencyName,
                         Model model) {
        model.addAttribute( "currency", exchangeService.getCurrencyExchange( currencyName ) );
        return "index";
    }

}
