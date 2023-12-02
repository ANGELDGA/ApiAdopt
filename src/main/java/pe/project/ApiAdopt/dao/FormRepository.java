package pe.project.ApiAdopt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.project.ApiAdopt.entity.Form;

public interface FormRepository extends  JpaRepository<Form, Long>{
    
}
