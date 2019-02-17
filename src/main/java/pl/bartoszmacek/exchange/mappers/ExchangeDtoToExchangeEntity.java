package pl.bartoszmacek.exchange.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.bartoszmacek.exchange.dtos.ExchangeDto;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;

public class ExchangeDtoToExchangeEntity {
    public static ExchangeEntity convert(ExchangeDto exchangeDto) {
        ExchangeEntity exchangeEntity = new ExchangeEntity();

        exchangeEntity.setBidOfCurrency( exchangeDto.getRatesOfCurrencyDtoList().get( 0 ).getBid() );
        exchangeEntity.setAskOfCurrency( exchangeDto.getRatesOfCurrencyDtoList().get( 0 ).getAsk() );
        exchangeEntity.setCurrencyName( exchangeDto.getCurrency() );


        return exchangeEntity;
    }
}
