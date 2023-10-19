package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraCOnsulta implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private ConsultaRepository repository;

    public void validar (DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsultaMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if (medicoPossuiOutraConsultaMesmoHorario){
            throw new ValidacaoException("Médico já tem agendamentos neste horário");
        }
    }
}
