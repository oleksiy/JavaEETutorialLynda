package app;

import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO Implemented by Spring into a Bean Called userRepository
 * CRUD - Create Read Update Delete
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
