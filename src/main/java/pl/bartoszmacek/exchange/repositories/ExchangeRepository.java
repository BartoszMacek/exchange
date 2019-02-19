package pl.bartoszmacek.exchange.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bartoszmacek.exchange.entities.ExchangeEntity;

import java.util.List;

@Repository
public interface ExchangeRepository extends CrudRepository <ExchangeEntity, Integer> {

    List<ExchangeEntity> deleteById (int idToDelete);


}
