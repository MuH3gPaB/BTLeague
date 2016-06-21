package repository;


import model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayersRepository extends CrudRepository<Player, Long>{

//    @Override
//    List<Player> findAll();
}
