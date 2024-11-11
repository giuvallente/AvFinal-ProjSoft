package br.insper.provafinal.conhecimento;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ConhecimentoService {
    @Autowired
    private ConhecimentoRepository conhecimentoRepository;
    public Conhecimento salvar(Conhecimento conhecimento) {

        conhecimento.setId(UUID.randomUUID().toString());
        return conhecimentoRepository.save(conhecimento);

    }

    public Conhecimento deletar(String idConhecimento) {
        Conhecimento conhecimento = conhecimentoRepository.findById(idConhecimento)
                .orElseThrow(() -> new ConhecimentoNaoEncontradoException("Conhecimento não encontrado"));
        conhecimentoRepository.delete(conhecimento);
        return conhecimento;
    }

    public Conhecimento getConhecimento(String idConhecimento) {
        return conhecimentoRepository.findById(idConhecimento)
                .orElseThrow(() -> new ConhecimentoNaoEncontradoException("Conhecimento não encontrado"));
    }

    public List<Conhecimento> listar() {
        return conhecimentoRepository.findAll();
    }
}