package daca.myevent.myevent.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import daca.myevent.myevent.models.event.Event;

@Repository
public interface EventRepositoryInterface extends JpaRepository<Event, Long>{

}