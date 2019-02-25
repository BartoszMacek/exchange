package pl.bartoszmacek.exchange.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.bartoszmacek.exchange.dtos.ExchangeDto;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;
import pl.bartoszmacek.exchange.mappers.ExchangeDtoToExchangeEntity;
import pl.bartoszmacek.exchange.repositories.ExchangeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ExchangeService {


    final private ExchangeRepository exchangeRepository;

    @Autowired
    public ExchangeService(ExchangeRepository exchangeRepository) {
        this.exchangeRepository = exchangeRepository;
    }

    private boolean saveCurrency(ExchangeDto exchangeDto) {
        ExchangeEntity exchangeEntity = ExchangeDtoToExchangeEntity.convert( exchangeDto );
        return exchangeRepository.save( exchangeEntity ) != null;
    }

    public ExchangeDto getCurrencyExchange(String currencyName) {
        RestTemplate restTemplate = getRestTemplate();
        ExchangeDto exchangeDto = restTemplate.getForObject(
                "http://api.nbp.pl/api/exchangerates/rates/c/" + currencyName + "?format=json", ExchangeDto.class );
        saveCurrency( exchangeDto );
        return exchangeDto;
    }

    public List<ExchangeEntity> getExchangeLog() {
        return (List<ExchangeEntity>) exchangeRepository.findAll();
    }

    public List<ExchangeEntity> getExchangeListWithoutElement(int idToDelete) {
        Optional<ExchangeEntity> optionalExchangeEntity = exchangeRepository.findById( idToDelete );
        return exchangeRepository.deleteById( optionalExchangeEntity.get().getId() );
    }







    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
