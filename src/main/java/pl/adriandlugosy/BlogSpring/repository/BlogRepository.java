package pl.adriandlugosy.BlogSpring.repository;

import org.springframework.data.repository.CrudRepository;
import pl.adriandlugosy.BlogSpring.model.Response;

public interface BlogRepository extends CrudRepository<Response,Long> {
}
