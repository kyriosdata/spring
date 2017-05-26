package demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	Iterable<Pessoa> findByNomeIgnoringCase(String make);

}
