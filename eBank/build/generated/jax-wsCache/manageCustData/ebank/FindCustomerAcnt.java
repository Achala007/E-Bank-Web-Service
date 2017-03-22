
package ebank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findCustomerAcnt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCustomerAcnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acntNmb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCustomerAcnt", propOrder = {
    "acntNmb"
})
public class FindCustomerAcnt {

    protected int acntNmb;

    /**
     * Gets the value of the acntNmb property.
     * 
     */
    public int getAcntNmb() {
        return acntNmb;
    }

    /**
     * Sets the value of the acntNmb property.
     * 
     */
    public void setAcntNmb(int value) {
        this.acntNmb = value;
    }

}
