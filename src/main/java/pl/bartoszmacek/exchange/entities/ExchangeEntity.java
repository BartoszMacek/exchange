package pl.bartoszmacek.exchange.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "exchange_log")
public class ExchangeEntity {

    private @Id @GeneratedValue int id;
    private @Column(name="bid") double bidOfCurrency;
    private @Column(name="ask") double askOfCurrency;
    private @Column (name="currency_name")String currencyName;



}
