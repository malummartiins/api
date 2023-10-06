package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

import java.util.SplittableRandom;

public record DadosDetalhamentomedico(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public  DadosDetalhamentomedico (Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }

}
