package repository;


import model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayersRepository extends CrudRepository<Player, Long>{

    Player getByFirstNameAndLastName(String firstName, String lastName);
}
