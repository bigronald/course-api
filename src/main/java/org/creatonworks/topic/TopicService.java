package org.creatonworks.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
@Autowired
 private TopicRepository topicRepository;
private List<Topic> topics =new ArrayList<>( Arrays.asList(
        new Topic("spring","SpringTests","Spring testing handbook"),
        new Topic("vb.net","VB.Net Tests","Visual Basic testing handbook"),
        new Topic("java","JavaTests","Java testing handbook")
));

public List<Topic> getAllTopics(){
    List<Topic> topics = new ArrayList<>();
    topicRepository.findAll().forEach(topics::add);
    return topics;
}

public Topic getTopic(String id){

    return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}

    public void addTopic(Topic topic) {
    topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
      /**  for (int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }

        }**/

     // topicRepository.save(Id);

}
    public void deleteTopic(String id) {
    topics.removeIf(t->t.getId().equals(id));
    }
}
