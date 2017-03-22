
package ebank;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ebank package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpLogInResponse_QNAME = new QName("http://eBank/", "empLogInResponse");
    private final static QName _EmpLogIn_QNAME = new QName("http://eBank/", "empLogIn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpLogInResponse }
     * 
     */
    public EmpLogInResponse createEmpLogInResponse() {
        return new EmpLogInResponse();
    }

    /**
     * Create an instance of {@link EmpLogIn }
     * 
     */
    public EmpLogIn createEmpLogIn() {
        return new EmpLogIn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpLogInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "empLogInResponse")
    public JAXBElement<EmpLogInResponse> createEmpLogInResponse(EmpLogInResponse value) {
        return new JAXBElement<EmpLogInResponse>(_EmpLogInResponse_QNAME, EmpLogInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpLogIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "empLogIn")
    public JAXBElement<EmpLogIn> createEmpLogIn(EmpLogIn value) {
        return new JAXBElement<EmpLogIn>(_EmpLogIn_QNAME, EmpLogIn.class, null, value);
    }

}
