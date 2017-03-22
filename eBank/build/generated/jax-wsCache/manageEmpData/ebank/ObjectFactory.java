
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

    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://eBank/", "deleteEmployeeResponse");
    private final static QName _Findempdata_QNAME = new QName("http://eBank/", "findempdata");
    private final static QName _UpdateEmpResponse_QNAME = new QName("http://eBank/", "updateEmpResponse");
    private final static QName _FindEmpDetailsResponse_QNAME = new QName("http://eBank/", "findEmpDetailsResponse");
    private final static QName _CreateEmployee_QNAME = new QName("http://eBank/", "createEmployee");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://eBank/", "createEmployeeResponse");
    private final static QName _FindEmpDetails_QNAME = new QName("http://eBank/", "findEmpDetails");
    private final static QName _UpdateEmp_QNAME = new QName("http://eBank/", "updateEmp");
    private final static QName _FindempdataResponse_QNAME = new QName("http://eBank/", "findempdataResponse");
    private final static QName _DeleteEmployee_QNAME = new QName("http://eBank/", "deleteEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link Findempdata }
     * 
     */
    public Findempdata createFindempdata() {
        return new Findempdata();
    }

    /**
     * Create an instance of {@link UpdateEmpResponse }
     * 
     */
    public UpdateEmpResponse createUpdateEmpResponse() {
        return new UpdateEmpResponse();
    }

    /**
     * Create an instance of {@link FindEmpDetailsResponse }
     * 
     */
    public FindEmpDetailsResponse createFindEmpDetailsResponse() {
        return new FindEmpDetailsResponse();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link FindEmpDetails }
     * 
     */
    public FindEmpDetails createFindEmpDetails() {
        return new FindEmpDetails();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link FindempdataResponse }
     * 
     */
    public FindempdataResponse createFindempdataResponse() {
        return new FindempdataResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link UpdateEmp }
     * 
     */
    public UpdateEmp createUpdateEmp() {
        return new UpdateEmp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findempdata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findempdata")
    public JAXBElement<Findempdata> createFindempdata(Findempdata value) {
        return new JAXBElement<Findempdata>(_Findempdata_QNAME, Findempdata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "updateEmpResponse")
    public JAXBElement<UpdateEmpResponse> createUpdateEmpResponse(UpdateEmpResponse value) {
        return new JAXBElement<UpdateEmpResponse>(_UpdateEmpResponse_QNAME, UpdateEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmpDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findEmpDetailsResponse")
    public JAXBElement<FindEmpDetailsResponse> createFindEmpDetailsResponse(FindEmpDetailsResponse value) {
        return new JAXBElement<FindEmpDetailsResponse>(_FindEmpDetailsResponse_QNAME, FindEmpDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmpDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findEmpDetails")
    public JAXBElement<FindEmpDetails> createFindEmpDetails(FindEmpDetails value) {
        return new JAXBElement<FindEmpDetails>(_FindEmpDetails_QNAME, FindEmpDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "updateEmp")
    public JAXBElement<UpdateEmp> createUpdateEmp(UpdateEmp value) {
        return new JAXBElement<UpdateEmp>(_UpdateEmp_QNAME, UpdateEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindempdataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "findempdataResponse")
    public JAXBElement<FindempdataResponse> createFindempdataResponse(FindempdataResponse value) {
        return new JAXBElement<FindempdataResponse>(_FindempdataResponse_QNAME, FindempdataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eBank/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

}
