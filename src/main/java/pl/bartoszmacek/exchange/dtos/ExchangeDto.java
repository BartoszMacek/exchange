package pl.bartoszmacek.exchange.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ExchangeDto {


    @JsonProperty("rates")
    private List<RatesOfCurrencyDto> ratesOfCurrencyDtoList;


    @JsonProperty("code")
    private String currency;


    @Data
    public static class RatesOfCurrencyDto {
        private double bid;
        private double ask;
    }

}
