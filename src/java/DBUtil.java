import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("HangmanJ2EEPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
