import java.beans.ConstructorProperties;

public class PessoaController {
    

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa){
        return new ResponseEntity<>();
    }


}
