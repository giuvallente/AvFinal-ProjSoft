package br.insper.provafinal.conhecimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artigos")
public class ConhecimentoController {

    @Autowired
    private ConhecimentoService conhecimentoService;


    @PostMapping
    public ResponseEntity<Conhecimento> criar(@RequestBody Conhecimento conhecimento) {
        Conhecimento criado = conhecimentoService.salvar(conhecimento);
        return ResponseEntity.status(HttpStatus.CREATED).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Conhecimento> deletar(@PathVariable("id") String id) {
        Conhecimento deletado = conhecimentoService.deletar(id);
        return ResponseEntity.ok(deletado);
    }

    @GetMapping
    public ResponseEntity<List<Conhecimento>> listar() {
        List<Conhecimento> conhecimentos = conhecimentoService.listar();
        return ResponseEntity.ok(conhecimentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conhecimento> getConhecimento(@PathVariable("id") String id) {
        Conhecimento conhecimento = conhecimentoService.getConhecimento(id);
        return ResponseEntity.ok(conhecimento);
    }
}
