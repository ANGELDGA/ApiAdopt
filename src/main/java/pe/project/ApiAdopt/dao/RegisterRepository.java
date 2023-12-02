package pe.project.ApiAdopt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.project.ApiAdopt.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Long>{
    
    Register findByName(String name);
    Register findByCategoryName(String categoryName);
             
}
