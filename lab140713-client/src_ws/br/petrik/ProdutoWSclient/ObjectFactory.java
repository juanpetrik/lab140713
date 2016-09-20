
package br.petrik.ProdutoWSclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.petrik.ProdutoWSclient package. 
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

    private final static QName _ListarTodosService_QNAME = new QName("http://webservices.petrik.br/", "listarTodosService");
    private final static QName _GetProdutoService_QNAME = new QName("http://webservices.petrik.br/", "getProdutoService");
    private final static QName _ListarTodosServiceResponse_QNAME = new QName("http://webservices.petrik.br/", "listarTodosServiceResponse");
    private final static QName _GetProdutoServiceResponse_QNAME = new QName("http://webservices.petrik.br/", "getProdutoServiceResponse");
    private final static QName _SalvarServiceResponse_QNAME = new QName("http://webservices.petrik.br/", "salvarServiceResponse");
    private final static QName _DeletarService_QNAME = new QName("http://webservices.petrik.br/", "deletarService");
    private final static QName _AlterarServiceResponse_QNAME = new QName("http://webservices.petrik.br/", "alterarServiceResponse");
    private final static QName _AlterarService_QNAME = new QName("http://webservices.petrik.br/", "alterarService");
    private final static QName _DeletarServiceResponse_QNAME = new QName("http://webservices.petrik.br/", "deletarServiceResponse");
    private final static QName _SalvarService_QNAME = new QName("http://webservices.petrik.br/", "salvarService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.petrik.ProdutoWSclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlterarService }
     * 
     */
    public AlterarService createAlterarService() {
        return new AlterarService();
    }

    /**
     * Create an instance of {@link AlterarServiceResponse }
     * 
     */
    public AlterarServiceResponse createAlterarServiceResponse() {
        return new AlterarServiceResponse();
    }

    /**
     * Create an instance of {@link DeletarService }
     * 
     */
    public DeletarService createDeletarService() {
        return new DeletarService();
    }

    /**
     * Create an instance of {@link GetProdutoServiceResponse }
     * 
     */
    public GetProdutoServiceResponse createGetProdutoServiceResponse() {
        return new GetProdutoServiceResponse();
    }

    /**
     * Create an instance of {@link SalvarServiceResponse }
     * 
     */
    public SalvarServiceResponse createSalvarServiceResponse() {
        return new SalvarServiceResponse();
    }

    /**
     * Create an instance of {@link GetProdutoService }
     * 
     */
    public GetProdutoService createGetProdutoService() {
        return new GetProdutoService();
    }

    /**
     * Create an instance of {@link ListarTodosServiceResponse }
     * 
     */
    public ListarTodosServiceResponse createListarTodosServiceResponse() {
        return new ListarTodosServiceResponse();
    }

    /**
     * Create an instance of {@link ListarTodosService }
     * 
     */
    public ListarTodosService createListarTodosService() {
        return new ListarTodosService();
    }

    /**
     * Create an instance of {@link SalvarService }
     * 
     */
    public SalvarService createSalvarService() {
        return new SalvarService();
    }

    /**
     * Create an instance of {@link DeletarServiceResponse }
     * 
     */
    public DeletarServiceResponse createDeletarServiceResponse() {
        return new DeletarServiceResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "listarTodosService")
    public JAXBElement<ListarTodosService> createListarTodosService(ListarTodosService value) {
        return new JAXBElement<ListarTodosService>(_ListarTodosService_QNAME, ListarTodosService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutoService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "getProdutoService")
    public JAXBElement<GetProdutoService> createGetProdutoService(GetProdutoService value) {
        return new JAXBElement<GetProdutoService>(_GetProdutoService_QNAME, GetProdutoService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "listarTodosServiceResponse")
    public JAXBElement<ListarTodosServiceResponse> createListarTodosServiceResponse(ListarTodosServiceResponse value) {
        return new JAXBElement<ListarTodosServiceResponse>(_ListarTodosServiceResponse_QNAME, ListarTodosServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutoServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "getProdutoServiceResponse")
    public JAXBElement<GetProdutoServiceResponse> createGetProdutoServiceResponse(GetProdutoServiceResponse value) {
        return new JAXBElement<GetProdutoServiceResponse>(_GetProdutoServiceResponse_QNAME, GetProdutoServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "salvarServiceResponse")
    public JAXBElement<SalvarServiceResponse> createSalvarServiceResponse(SalvarServiceResponse value) {
        return new JAXBElement<SalvarServiceResponse>(_SalvarServiceResponse_QNAME, SalvarServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "deletarService")
    public JAXBElement<DeletarService> createDeletarService(DeletarService value) {
        return new JAXBElement<DeletarService>(_DeletarService_QNAME, DeletarService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "alterarServiceResponse")
    public JAXBElement<AlterarServiceResponse> createAlterarServiceResponse(AlterarServiceResponse value) {
        return new JAXBElement<AlterarServiceResponse>(_AlterarServiceResponse_QNAME, AlterarServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "alterarService")
    public JAXBElement<AlterarService> createAlterarService(AlterarService value) {
        return new JAXBElement<AlterarService>(_AlterarService_QNAME, AlterarService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "deletarServiceResponse")
    public JAXBElement<DeletarServiceResponse> createDeletarServiceResponse(DeletarServiceResponse value) {
        return new JAXBElement<DeletarServiceResponse>(_DeletarServiceResponse_QNAME, DeletarServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.petrik.br/", name = "salvarService")
    public JAXBElement<SalvarService> createSalvarService(SalvarService value) {
        return new JAXBElement<SalvarService>(_SalvarService_QNAME, SalvarService.class, null, value);
    }

}
