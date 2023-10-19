package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidadorPacienteTemOutraConsulta implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacientePossuiOutraConsulta = repository.existsByMedicoIdAndDataBetween(dados.idPaciente(),primeiroHorario, ultimoHorario);
        if (pacientePossuiOutraConsulta){
            throw new ValidacaoException("Paciente já tem consulta agendada");
        }
    }
}
