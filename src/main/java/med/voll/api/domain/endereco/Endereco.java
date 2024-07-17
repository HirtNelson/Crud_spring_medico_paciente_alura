package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private @NotBlank String logradouro;
    private @NotBlank String numero;
    private String complemento;
    private @NotBlank String bairro;
    private @NotBlank String cidade;
    private @NotBlank String uf;
    private @NotBlank @Pattern(regexp = "\\d{8}") String cep;

    public Endereco(Endereco dados) {

        this.bairro = dados.bairro;
        this.cep = dados.cep;
        this.cidade = dados.cidade;
        this.uf = dados.uf;
        this.complemento = dados.complemento;
        this.numero = dados.numero;
        this.logradouro = dados.logradouro;
    }

    public void atualizarInformacoes(Endereco dados) {

        if (bairro != null) {
            this.bairro = dados.bairro;
        }
        if (cep != null) {
            this.cep = dados.cep;
        }
        if (cidade != null) {
            this.cidade = dados.cidade;
        }
        if (uf != null) {
            this.uf = dados.uf;
        }
        if (complemento != null) {
            this.complemento = dados.complemento;
        }
        if (numero != null) {
            this.numero = dados.numero;
        }
        if (logradouro != null) {
            this.logradouro = dados.logradouro;
        }
    }
}

