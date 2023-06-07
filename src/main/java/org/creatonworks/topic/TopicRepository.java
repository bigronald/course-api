package org.creatonworks.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface TopicRepository extends JpaRepository<Topic, Id> {
    Topic findById(String id);
    Topic deleteById(String id);
}
