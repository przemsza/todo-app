package pl.mzalewski.todoapp.model.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    @RestResource(exported = false)
    default void deleteById(Integer integer) {

    }

    @Override
    @RestResource(exported = false)
    default void delete(User entity) {
    }
}
