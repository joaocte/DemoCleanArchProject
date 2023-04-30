package br.com.jror.DemoCleanArchProject.api;

import javax.validation.Valid;

import br.com.jror.DemoCleanArchProject.api.request.AtualizarPessoaRequest;
import br.com.jror.DemoCleanArchProject.api.request.CadastrarPessoaRequest;
import br.com.jror.DemoCleanArchProject.application.command.AtualizarPessoaCommand;
import br.com.jror.DemoCleanArchProject.application.command.CadastrarPessoaCommand;
import br.com.jror.DemoCleanArchProject.application.command.DeletarPessoaCommand;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PessoaController {
    private final ModelMapper mapper;

    @Autowired
    public PessoaController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping(value = "/pessoa", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> Get() {


        return ResponseEntity.ok(null);
    }
    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<?> GetById(@PathVariable(value = "id") UUID id)
    {
        var command = new DeletarPessoaCommand(id);
            return null;
    }
    @RequestMapping(value = "/pessoa", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public ResponseEntity<?> Post(@Valid @RequestBody CadastrarPessoaRequest cadastrarPessoaRequest)
    {
        var command = mapper.map(cadastrarPessoaRequest, CadastrarPessoaCommand.class);
        return null;
    }
    @RequestMapping(value = "/pessoa/{id}", method =  RequestMethod.PUT, produces="application/json", consumes="application/json")
    public ResponseEntity<?> Put(@Valid @RequestBody AtualizarPessoaRequest request, @PathVariable(value = "id") UUID id){
        AtualizarPessoaCommand command = mapper.map(request, AtualizarPessoaCommand.class);
        command.setId(id);
        return  null;
    }

    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.DELETE, produces="application/json")
    public ResponseEntity<?> Delete(@PathVariable(value = "id") UUID id)
    {
        var command = new DeletarPessoaCommand(id);
        return null;
    }


}
