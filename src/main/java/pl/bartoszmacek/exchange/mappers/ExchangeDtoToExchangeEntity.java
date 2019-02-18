package pl.bartoszmacek.exchange.mappers;

import pl.bartoszmacek.exchange.dtos.ExchangeDto;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;

import java.time.LocalDateTime;

public class ExchangeDtoToExchangeEntity {
    public static ExchangeEntity convert(ExchangeDto exchangeDto) {
        ExchangeEntity exchangeEntity = new ExchangeEntity();

        exchangeEntity.setBidOfCurrency( exchangeDto.getRatesOfCurrencyDtoList().get( 0 ).getBid() );
        exchangeEntity.setAskOfCurrency( exchangeDto.getRatesOfCurrencyDtoList().get( 0 ).getAsk() );
        exchangeEntity.setCurrencyName( exchangeDto.getCurrency() );
        exchangeEntity.setDateOfRequest( LocalDateTime.now() );

        return exchangeEntity;
    }
}
