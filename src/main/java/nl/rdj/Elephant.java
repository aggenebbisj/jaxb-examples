
package nl.rdj;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Elephant implements Animal {

    private String slurf;

   public Elephant(){}

    public Elephant(String slurf) {
        this.slurf = slurf;
    }

    public String getSlurf() {
        return slurf;
    }

    public void setSlurf(String slurf) {
        this.slurf = slurf;
    }

    @Override
    public String getName() {
        return "Dombo";
    }

    @Override
    public String toString() {
        return "Elephant{" + "slurf=" + slurf + '}';
    }

}