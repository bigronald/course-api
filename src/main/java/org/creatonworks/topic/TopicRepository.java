package org.creatonworks.topic;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface TopicRepository extends CrudRepository<Topic, Id> {
    
}
