
package pe.project.ApiAdopt.services;

import java.util.List;
import pe.project.ApiAdopt.entity.Form;


public interface FormService {
    
    public Form add(Form form);
    public List<Form> findAll();
    
}
