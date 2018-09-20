package logserver;

import java.util.Arrays;
import java.util.Properties;

import com.mongodb.client.MongoDatabase;
import logserver.Kafka.KafkaProperties;
import logserver.Mongo.MongoHelper;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.util.JSON;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

/**
 * Created by Administrator on 2018/9/19.
 */
public class LoggerConsumer {

    public static void main(String[] args) {
        Properties props=KafkaProperties.kafakPro();
        Consumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        consumer.subscribe(Arrays.asList("applog"));

        MongoHelper mongoHelper=new MongoHelper();
        MongoDatabase mongoDatabase= mongoHelper.getMongoDataBase(mongoHelper.getMongoClient());
        MongoCollection<DBObject> collection = mongoDatabase.getCollection("applog", DBObject.class);

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                DBObject bson = (DBObject)JSON.parse(record.value());
               collection.insertOne(bson);
            }
        }
    }
}
