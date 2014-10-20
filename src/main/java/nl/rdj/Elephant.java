
package nl.rdj;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Elephant implements Animal {
    @XmlElement(name = "slurf")
    private String slurf;

    public String getSlurf() {
        return slurf;
    }

    public void setSlurf(String slurf) {
        this.slurf = slurf;
    }

    @Override
    public String foo() {
        return "Dombo";
    }

    @Override
    public String toString() {
        return "Elephant{" + "slurf=" + slurf + '}';
    }

}