package br.insper.provafinal.conhecimento;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConhecimentoRepository extends MongoRepository<Conhecimento, String> {
}
