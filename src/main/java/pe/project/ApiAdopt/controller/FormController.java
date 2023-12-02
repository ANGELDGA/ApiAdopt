
package pe.project.ApiAdopt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.project.ApiAdopt.entity.Form;
import pe.project.ApiAdopt.services.FormService;

@RestController
@RequestMapping("api/v1/form")
public class FormController {
    
    @Autowired
    private FormService formService;
    
    @PostMapping
    public ResponseEntity<Form> add(@RequestBody Form form){
        return new ResponseEntity<>(formService.add(form),HttpStatus.CREATED);
    }
    
    
    @GetMapping
    public ResponseEntity<List<Form>> findAll(){
        return new ResponseEntity<>(formService.findAll(),HttpStatus.OK);
    }
}
