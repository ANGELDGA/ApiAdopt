package pe.project.ApiAdopt.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.project.ApiAdopt.dao.FormRepository;
import pe.project.ApiAdopt.entity.Form;


@Service
public class FormSeviceImpl implements FormService{

    @Autowired
    private FormRepository formReposiory;
    
    @Override
    public Form add(Form form) {
       return formReposiory.save(form);
    }

    @Override
    public List<Form> findAll() {
        return formReposiory.findAll();
    }
    
}
