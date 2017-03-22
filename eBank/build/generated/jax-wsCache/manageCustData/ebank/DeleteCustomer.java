
package ebank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acntNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCustomer", propOrder = {
    "acntNumber"
})
public class DeleteCustomer {

    protected int acntNumber;

    /**
     * Gets the value of the acntNumber property.
     * 
     */
    public int getAcntNumber() {
        return acntNumber;
    }

    /**
     * Sets the value of the acntNumber property.
     * 
     */
    public void setAcntNumber(int value) {
        this.acntNumber = value;
    }

}
