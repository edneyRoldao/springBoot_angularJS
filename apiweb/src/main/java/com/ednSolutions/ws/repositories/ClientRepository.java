package com.ednSolutions.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ednSolutions.ws.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
