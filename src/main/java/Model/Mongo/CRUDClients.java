package Model.Mongo;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class CRUDClients implements OperationsCRUD {

    private final MongoConnection mongo = MongoConnection.getInstance();

    @Override
    public void create(Document document) {
        try {
            mongo.getCollection().insertOne(document);
        } catch (MongoException e) {
            throw new RuntimeException("Error CREATE", e);
        }
    }

    @Override
    public List<Document> read() {
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find().forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error READ", e);
        }
        return list;
    }

    @Override
    public List<Document> find(String cedula) {
        List<Document> list = new ArrayList<>();
        try {
            mongo.getCollection().find(Filters.eq("cedula", cedula)).forEach(list::add);
        } catch (MongoException e) {
            throw new RuntimeException("Error SEARCH", e);
        }
        return list;
    }

    @Override
    public void delete(Object cedula) {
        try {
            mongo.getCollection().deleteOne(Filters.eq("cedula", cedula));
        } catch (MongoException e) {
            throw new RuntimeException("Error DELETE ONE", e);
        }
    }

    @Override
    public void update(Object cedula, Document updates) {
        try {
            mongo.getCollection().updateOne(
                Filters.eq("cedula", cedula),
                new Document("$set", updates)
            );
        } catch (MongoException e) {
            throw new RuntimeException("Error UPDATE", e);
        }
    }

    @Override
    public void deleteCollection() {
        try {
            mongo.getCollection().deleteMany(new Document());
        } catch (MongoException e) {
            throw new RuntimeException("Error al borrar coleccion", e);
        }
    }

    @Override
    public void deleteDatabase() {
        try {
            mongo.getCollection().drop();
        } catch (MongoException e) {
            throw new RuntimeException("Error DROP", e);
        }
    }
}
