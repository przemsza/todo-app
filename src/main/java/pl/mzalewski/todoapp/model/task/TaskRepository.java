package pl.mzalewski.todoapp.model.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import pl.mzalewski.todoapp.model.task.Task;

import java.util.List;

@RepositoryRestResource
interface TaskRepository extends JpaRepository<Task, Integer> {

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Task entity);

    @RestResource(path = "done", rel = "done")
    List<Task> findByDoneIsTrue();
}
