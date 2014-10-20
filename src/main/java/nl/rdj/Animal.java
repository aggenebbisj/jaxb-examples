
package nl.rdj;

import javax.xml.bind.annotation.XmlElement;

public interface Animal {

    @XmlElement
    public String getName();

}
