package pl.bartoszmacek.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.bartoszmacek.exchange.services.ExchangeService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HistoryController {

    private final ExchangeService exchangeService;

    @Autowired
    public HistoryController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping("/history")
    public String history(Model model) {
        model.addAttribute( "logs", exchangeService.getExchangeLog() );
        return "history";
    }


    @RequestMapping(value = "/history/delete/", method = RequestMethod.GET)
    public String deleteRowFromDatabase(@RequestParam(name = "id") int idToDelete) {
        exchangeService.getExchangeListWithoutElement( idToDelete );

        return "redirect:/history";
    }


    @RequestMapping(value = "/history/checkDelete", method = RequestMethod.POST)
    public String deleteCheckedValues(@RequestParam(name = "checkboxName", required = false) String checkboxValue) {

            if (checkboxValue != null) {
                exchangeService.getExchangeListWithoutElement( Integer.parseInt( checkboxValue ) );
            } else {
                System.out.println( "Nothing to delete" );

        }
        return "redirect:/history";
    }
}
