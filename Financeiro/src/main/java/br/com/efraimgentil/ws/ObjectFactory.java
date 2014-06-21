
package br.com.efraimgentil.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.efraimgentil.ws package. 
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

    private final static QName _Novo_QNAME = new QName("http://ws.efraimgentil.com.br/", "novo");
    private final static QName _NovoResponse_QNAME = new QName("http://ws.efraimgentil.com.br/", "novoResponse");
    private final static QName _APagar_QNAME = new QName("http://ws.efraimgentil.com.br/", "aPagar");
    private final static QName _APagarResponse_QNAME = new QName("http://ws.efraimgentil.com.br/", "aPagarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.efraimgentil.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NovoResponse }
     * 
     */
    public NovoResponse createNovoResponse() {
        return new NovoResponse();
    }

    /**
     * Create an instance of {@link APagar }
     * 
     */
    public APagar createAPagar() {
        return new APagar();
    }

    /**
     * Create an instance of {@link Novo }
     * 
     */
    public Novo createNovo() {
        return new Novo();
    }

    /**
     * Create an instance of {@link APagarResponse }
     * 
     */
    public APagarResponse createAPagarResponse() {
        return new APagarResponse();
    }

    /**
     * Create an instance of {@link Conta }
     * 
     */
    public Conta createConta() {
        return new Conta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Novo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.efraimgentil.com.br/", name = "novo")
    public JAXBElement<Novo> createNovo(Novo value) {
        return new JAXBElement<Novo>(_Novo_QNAME, Novo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NovoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.efraimgentil.com.br/", name = "novoResponse")
    public JAXBElement<NovoResponse> createNovoResponse(NovoResponse value) {
        return new JAXBElement<NovoResponse>(_NovoResponse_QNAME, NovoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APagar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.efraimgentil.com.br/", name = "aPagar")
    public JAXBElement<APagar> createAPagar(APagar value) {
        return new JAXBElement<APagar>(_APagar_QNAME, APagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APagarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.efraimgentil.com.br/", name = "aPagarResponse")
    public JAXBElement<APagarResponse> createAPagarResponse(APagarResponse value) {
        return new JAXBElement<APagarResponse>(_APagarResponse_QNAME, APagarResponse.class, null, value);
    }

}
