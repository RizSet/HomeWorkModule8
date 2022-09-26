import javax.xml.namespace.QName;
import java.security.PublicKey;

public abstract class Shape {
    protected String shapeName;
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    public String getShapeName(){
            return shapeName;
    }
}
