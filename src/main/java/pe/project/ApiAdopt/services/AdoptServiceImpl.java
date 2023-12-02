package pe.project.ApiAdopt.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import pe.project.ApiAdopt.dao.RegisterRepository;
import pe.project.ApiAdopt.entity.Register;

@Service

public class AdoptServiceImpl implements AdoptService {
    @Autowired
    private RegisterRepository registerRepository;
    
    @Override
    public List<Register> findAll() {
        return registerRepository.findAll();
    }

    @Override
    public Register findById(Long idRegister) {
        return registerRepository.findById(idRegister).get();
    }

    @Override
    public Register add(Register register) {
        return registerRepository.save(register);
    }

    @Override
    public Register update(Register register) {
        var adoptBD = registerRepository.findById(register.getIdRegister()).get();
        adoptBD.setIdRegister(register.getIdRegister());
        adoptBD.setCategoryName(register.getCategoryName());
        adoptBD.setName(register.getName());
        adoptBD.setRaza(register.getRaza());
        adoptBD.setInformation(register.getInformation());
        adoptBD.setImg(register.getImg());
        return registerRepository.save(adoptBD);
    }

    @Override
    public void delete(Long idRegister) {
        var adoptBD = registerRepository.findById(idRegister).get();
        registerRepository.delete(adoptBD);
    }
    
    @Query
    @Override
    public Register findByName(String name) {
        return registerRepository.findByName(name);
    }
    
    @Query
    @Override
    public Register findByCategoryName(String categoryName) {
        return registerRepository.findByCategoryName(categoryName);
    }
    
}
