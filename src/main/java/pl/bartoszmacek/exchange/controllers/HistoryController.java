package pl.bartoszmacek.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;
import pl.bartoszmacek.exchange.repositories.ExchangeRepository;
import pl.bartoszmacek.exchange.services.ExchangeService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HistoryController {


   @Autowired
    public ExchangeRepository exchangeRepository;

    public HistoryController(ExchangeRepository exchangeRepository) {
        this.exchangeRepository = exchangeRepository;
    }

    @GetMapping ("history")
    public List<ExchangeEntity> findAll () {
        System.out.println(exchangeRepository.findAll());
        return exchangeRepository.findAll();
    }

//    private final ExchangeService exchangeService;
//    private List<Integer> checked = new ArrayList<>();
//
//    @Autowired
//    public HistoryController(ExchangeService exchangeService) {
//        this.exchangeService = exchangeService;
//    }
//
//
//    @GetMapping("/ifcheck")
//    public void ifCheck(@RequestParam(value = "check") int id) {
//        checked.add( id );
//    }
//
//    @GetMapping("/todelete")
//    public void toDelete() {
//        checked.forEach( exchangeService::toDelete );
//    }
//
//    @GetMapping("/history")
//    public String history(Model model) {
//        model.addAttribute( "logs", exchangeService.getExchangeLog() );
//        return "history";
//    }
//
//    @RequestMapping(value = "/history/delete/", method = RequestMethod.GET)
//    public String deleteRowFromDatabase(@RequestParam(name = "id") int idToDelete) {
//        exchangeService.toDelete( idToDelete );
//
//        return "redirect:/history";
//    }
//
//    @RequestMapping(value = "/history/checkDelete", method = RequestMethod.POST)
//    public String deleteCheckedValues(@RequestParam(name = "checkboxName", required = false) String checkboxValue) {
//
//        if (checkboxValue != null) {
//            exchangeService.toDelete( Integer.parseInt( checkboxValue ) );
//        } else {
//            System.out.println( "Nothing to delete" );
//        }
//        return "redirect:/history";
//    }


}
