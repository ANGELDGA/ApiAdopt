package pe.project.ApiAdopt.services;

import java.util.List;
import pe.project.ApiAdopt.entity.Register;

public interface AdoptService {
    
    public List<Register> findAll();
    public Register findById(Long idRegister);
    public Register findByName(String name);
    public Register findByCategoryName(String categoryName);
    public Register add(Register register);
    public Register update(Register register);
    public void delete(Long idRegister);
    
}
