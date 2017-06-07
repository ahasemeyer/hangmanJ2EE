import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HangmanUser implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }
    
    
    
}
