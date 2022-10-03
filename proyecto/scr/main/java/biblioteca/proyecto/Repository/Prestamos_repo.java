package biblioteca.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.proyecto.Model.Prestamos;

@Repository
public interface Prestamos_repo extends JpaRepository<Prestamos,Integer>{
    
}