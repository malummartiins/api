package med.voll.api.domain.medico;

public record DadosListageMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public  DadosListageMedico (Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
