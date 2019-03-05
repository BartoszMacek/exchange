package pl.bartoszmacek.exchange.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;
import java.util.List;

@Repository
public interface ExchangeRepository extends CrudRepository <ExchangeEntity, Integer> {

    List<ExchangeEntity> deleteById(int idToDelete);

//    @Query (value = "SELECT COUNT(currency_name)as city_counter, currency_name FROM `javaex`.`exchange_log` GROUP BY currency_name ", nativeQuery = true)
//    HashMap<ExchangeEntity, ExchangeEntity> findUniqueCurrencyAndCount ();


}

