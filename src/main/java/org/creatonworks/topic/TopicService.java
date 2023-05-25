package org.creatonworks.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

private List<Topic> topics =new ArrayList<>( Arrays.asList(
        new Topic("spring","SpringTests","Spring testing handbook"),
        new Topic("vb.net","VB.Net Tests","Visual Basic testing handbook"),
        new Topic("java","JavaTests","Java testing handbook")
));

public List<Topic> getAllTopics(){
    return topics;
}

public Topic getTopic(String id){

    return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}

    public void addTopic(Topic topic) {
    topics.add(topic);

    }
}
