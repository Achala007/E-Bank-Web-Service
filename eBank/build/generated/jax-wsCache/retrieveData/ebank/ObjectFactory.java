
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

    private final static QName _RetrieveCustomerListResponse_QNAME = new QName("http://eBank/", "retrieveCustomerListResponse");
    private final static QName _RetrieveEmployeeListResponse_QNAME = new QName("http://eBank/", "retrieveEmployeeListResponse");
    private final static QName _RetrieveEmployeeList_QNAME = new QName("http://eBank/", "retrieveEmployeeList");
    private final static QName _RetrieveCustomerList_QNAME = new QName("http://eBank/", "retrieveCustomerList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveEmployeeListResponse }
     * 
     */
    public RetrieveEmployeeListResponse createRetrieveEmployeeListResponse() {
        return new RetrieveEmployeeListResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerListResponse }
     * 
     */
    public RetrieveCustomerListResponse createRetrieveCustomerListResponse() {
        return new RetrieveCustomerListResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerList }
     * 
     */
    public RetrieveCustomerList createRetrieveCustomerList() {
        return new RetrieveCustomerList();
    }

    /**
     * Create an instance of {@link RetrieveEmployeeList }
     * 
     */
    public RetrieveEmployeeList createRetrieveEmployeeList() {
        return new RetrieveEmployeeList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "retrieveCustomerListResponse")
    public JAXBElement<RetrieveCustomerListResponse> createRetrieveCustomerListResponse(RetrieveCustomerListResponse value) {
        return new JAXBElement<RetrieveCustomerListResponse>(_RetrieveCustomerListResponse_QNAME, RetrieveCustomerListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEmployeeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "retrieveEmployeeListResponse")
    public JAXBElement<RetrieveEmployeeListResponse> createRetrieveEmployeeListResponse(RetrieveEmployeeListResponse value) {
        return new JAXBElement<RetrieveEmployeeListResponse>(_RetrieveEmployeeListResponse_QNAME, RetrieveEmployeeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveEmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "retrieveEmployeeList")
    public JAXBElement<RetrieveEmployeeList> createRetrieveEmployeeList(RetrieveEmployeeList value) {
        return new JAXBElement<RetrieveEmployeeList>(_RetrieveEmployeeList_QNAME, RetrieveEmployeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "retrieveCustomerList")
    public JAXBElement<RetrieveCustomerList> createRetrieveCustomerList(RetrieveCustomerList value) {
        return new JAXBElement<RetrieveCustomerList>(_RetrieveCustomerList_QNAME, RetrieveCustomerList.class, null, value);
    }

}
