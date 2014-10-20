
package nl.rdj;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Lion implements Animal {
     private String name;

    public Lion(){}

    public Lion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lion{" + "name=" + name + '}';
    }

 }
