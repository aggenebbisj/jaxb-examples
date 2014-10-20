
package nl.rdj;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lion implements Animal {
    @XmlElement(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String foo() {
        return "lion";
    }
    
    @Override
    public String toString() {
        return "Lion{" + "name=" + name + '}';
    }

}
