package org.bmshackathon;

import org.springframework.data.repository.Repository;

import java.util.Optional;

//@RepositoryRestResource
public interface ClientRepository extends Repository<Client, Long> {

    Optional<Client> findOne(Long id);

    Iterable<Client> findAll();
}
