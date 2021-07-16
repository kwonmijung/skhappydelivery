package skhappydelivery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="stores", path="stores")
public interface StoreRepository extends CrudRepository<Store, Long>{


}
