package pl.bartoszmacek.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.bartoszmacek.exchange.services.ExchangeService;


@Controller
public class PlotController {

    final ExchangeService exchangeService;

    @Autowired
    public PlotController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

//    @GetMapping("/plot")
//    public String plot(Model model) {
//        model.addAttribute( "plot", exchangeService.getUniqueCurrencyAndCount() );
//        return "plot";
//    }
}
