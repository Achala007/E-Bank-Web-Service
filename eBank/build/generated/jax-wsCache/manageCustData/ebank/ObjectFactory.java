
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

    private final static QName _AddCustomer_QNAME = new QName("http://eBank/", "addCustomer");
    private final static QName _EditCustomer_QNAME = new QName("http://eBank/", "editCustomer");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://eBank/", "addCustomerResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://eBank/", "deleteCustomer");
    private final static QName _FindCustomerAcnt_QNAME = new QName("http://eBank/", "findCustomerAcnt");
    private final static QName _FindCustomerAcntResponse_QNAME = new QName("http://eBank/", "findCustomerAcntResponse");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://eBank/", "deleteCustomerResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://eBank/", "editCustomerResponse");
    private final static QName _FindcustdataResponse_QNAME = new QName("http://eBank/", "findcustdataResponse");
    private final static QName _Findcustdata_QNAME = new QName("http://eBank/", "findcustdata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link FindCustomerAcnt }
     * 
     */
    public FindCustomerAcnt createFindCustomerAcnt() {
        return new FindCustomerAcnt();
    }

    /**
     * Create an instance of {@link FindCustomerAcntResponse }
     * 
     */
    public FindCustomerAcntResponse createFindCustomerAcntResponse() {
        return new FindCustomerAcntResponse();
    }

    /**
     * Create an instance of {@link FindcustdataResponse }
     * 
     */
    public FindcustdataResponse createFindcustdataResponse() {
        return new FindcustdataResponse();
    }

    /**
     * Create an instance of {@link Findcustdata }
     * 
     */
    public Findcustdata createFindcustdata() {
        return new Findcustdata();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "editCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerAcnt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findCustomerAcnt")
    public JAXBElement<FindCustomerAcnt> createFindCustomerAcnt(FindCustomerAcnt value) {
        return new JAXBElement<FindCustomerAcnt>(_FindCustomerAcnt_QNAME, FindCustomerAcnt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerAcntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findCustomerAcntResponse")
    public JAXBElement<FindCustomerAcntResponse> createFindCustomerAcntResponse(FindCustomerAcntResponse value) {
        return new JAXBElement<FindCustomerAcntResponse>(_FindCustomerAcntResponse_QNAME, FindCustomerAcntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "editCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindcustdataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findcustdataResponse")
    public JAXBElement<FindcustdataResponse> createFindcustdataResponse(FindcustdataResponse value) {
        return new JAXBElement<FindcustdataResponse>(_FindcustdataResponse_QNAME, FindcustdataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findcustdata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findcustdata")
    public JAXBElement<Findcustdata> createFindcustdata(Findcustdata value) {
        return new JAXBElement<Findcustdata>(_Findcustdata_QNAME, Findcustdata.class, null, value);
    }

}
