package application.repository;

import org.springframework.data.repository.CrudRepository;

import applicattion.model.Livro;

public interface livroRepository extends CrudRepository<Livro,Long>{

}