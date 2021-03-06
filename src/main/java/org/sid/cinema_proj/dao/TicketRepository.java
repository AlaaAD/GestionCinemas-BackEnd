package org.sid.cinema_proj.dao;

import org.sid.cinema_proj.entities.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    Page<Ticket> findByNomClientContains(String nomClient, Pageable pageable);
    public boolean existsTicketByPlaceSalleName(String name);
}
