package pl.bartoszmacek.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bartoszmacek.exchange.services.ExchangeService;

@Controller
public class HistoryController {

    final ExchangeService exchangeService;

    @Autowired
    public HistoryController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping("/history")
    public String history (Model model) {
        model.addAttribute( "logs", exchangeService.getExchangeLog() );
        return "history";
    }
}
