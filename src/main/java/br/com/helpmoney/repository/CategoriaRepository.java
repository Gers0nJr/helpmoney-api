package br.com.helpmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.helpmoney.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
