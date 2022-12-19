package biblioteca.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.proyecto.Model.Formulas;

@Repository
public interface Formulas_repo extends JpaRepository<Formulas,Integer>{
}