package biblioteca.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.proyecto.Model.Usuarios;

@Repository
public interface Usuarios_repo extends JpaRepository<Usuarios,Integer>{
    
}