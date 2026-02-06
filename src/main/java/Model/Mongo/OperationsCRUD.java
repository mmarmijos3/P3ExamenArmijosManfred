package Model.Mongo;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author Manfred Armijos
 */
public interface OperationsCRUD {
    
    public void create(Document document);

    public List<Document> read();
    
    public List<Document> find(String filter);
    
    public void update(Object filter, Document updates);

    public void delete(Object filter);
    
    public void deleteCollection();

    public void deleteDatabase();
    
}
