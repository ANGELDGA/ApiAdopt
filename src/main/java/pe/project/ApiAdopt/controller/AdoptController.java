package pe.project.ApiAdopt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.project.ApiAdopt.entity.Register;
import pe.project.ApiAdopt.services.AdoptService;

@RestController
@RequestMapping("/Adopt")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8082"})
public class AdoptController {
    @Autowired
    private AdoptService adoptService;
    
    @GetMapping("/findAll")
    public List<Register> findAll(){
        return adoptService.findAll();
    }
      
    @GetMapping("/findByName/{Name}")
    public ResponseEntity<Register> findByName(@PathVariable String name){
        return new ResponseEntity<>(adoptService.findByName(name),HttpStatus.OK);
    }
    
    @GetMapping("/findAll/{idRegister}")
    public ResponseEntity<Register> findById(@PathVariable Long idRegister){
        return new ResponseEntity<>(adoptService.findById(idRegister),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Register> add(@RequestBody Register register){
        return new ResponseEntity<>(adoptService.add(register),HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Register> update(@RequestBody Register register){
        return new ResponseEntity<>(adoptService.update(register),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idRegister}")
    public void delete(@PathVariable Long idRegister){
        adoptService.delete(idRegister);
    }
    
    @Query
    @GetMapping("/findByCategoryName/{categoryName}")
    public ResponseEntity<Register> findByCategoryName(String categoryName){
        return new ResponseEntity<>(adoptService.findByCategoryName(categoryName),HttpStatus.OK);
    }
}
