
package pe.project.ApiAdopt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idForm;
    private String namber;
    private String direcc;
    private String phone;
    private String description;
    private String lookafter;
}
