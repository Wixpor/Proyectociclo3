package biblioteca.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.proyecto.Model.Libros;

@Repository
public interface Libros_repo extends JpaRepository<Libros,Integer>{
    
}
