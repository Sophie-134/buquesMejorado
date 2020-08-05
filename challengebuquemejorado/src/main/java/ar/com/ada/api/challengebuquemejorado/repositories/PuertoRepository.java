package ar.com.ada.api.challengebuquemejorado.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import ar.com.ada.api.challengebuquemejorado.entities.Puerto;



public interface PuertoRepository extends MongoRepository<Puerto, ObjectId> {
    Puerto findBy_id(ObjectId id);
}