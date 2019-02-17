package pl.bartoszmacek.exchange.mappers;

import pl.bartoszmacek.exchange.dtos.ExchangeDto;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;

public class ExchangeDtoToExchangeEntity {
    public static ExchangeEntity convert(ExchangeDto exchangeDto) {
        ExchangeEntity exchangeEntity = new ExchangeEntity();


//      exchangeEntity.setBidOfCurrency();
        System.out.println(exchangeDto.getRatesOfCurrencyDtoList().get( 0 ));
//        exchangeEntity.setAskOfCurrency( exchangeDto.getRatesOfCurrencyDtoList().indexOf( "ask" ) );

        exchangeEntity.setCurrencyName( exchangeDto.getCurrency() );
        System.out.println(exchangeDto.getCurrency());


        return exchangeEntity;
    }
}
