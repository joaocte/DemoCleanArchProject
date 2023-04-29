package br.com.jror.DemoCleanArchProject.api;

import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PessoaController {
    @RequestMapping(value = "/pessoa", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> Get() {
        return ResponseEntity.ok(null);
    }
    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> GetById(@PathVariable(value = "id") UUID id)
    {
            return null;
    }
    @RequestMapping(value = "/pessoa", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public ResponseEntity<?> Post()
    {
        return null;
    }
    @RequestMapping(value = "/pessoa/{id}", method =  RequestMethod.PUT, produces="application/json", consumes="application/json")
    public ResponseEntity<?> Put(@PathVariable(value = "id") long id)
    {
        return  null;
    }

    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.DELETE, produces="application/json")
    public ResponseEntity<?> Delete(@PathVariable(value = "id") long id)
    {
        return null;
    }


}
