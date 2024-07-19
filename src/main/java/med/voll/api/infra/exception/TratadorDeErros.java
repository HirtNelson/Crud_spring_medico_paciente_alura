package med.voll.api.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import med.voll.api.domain.ValidacaoException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity erro404() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity erro400(MethodArgumentNotValidException ex){
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(dadosErroValidacao::new).toList());
    }
    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity erroNegocios(ValidacaoException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    private record dadosErroValidacao(String campo, String mensagem){
        public dadosErroValidacao(FieldError erro){
            this(erro.getField(),erro.getDefaultMessage());
        }
    }
}
