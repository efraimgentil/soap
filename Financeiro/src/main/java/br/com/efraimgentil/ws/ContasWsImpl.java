
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package br.com.efraimgentil.ws;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-06-20T21:34:34.961-03:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "ContasWsService",
                      portName = "ContasWsPort",
                      targetNamespace = "http://ws.efraimgentil.com.br/",
                      wsdlLocation = "http://efraim:8080/FinanceiroWs/ContasWs?wsdl",
                      endpointInterface = "br.com.efraimgentil.ws.ContasWs")
                      
public class ContasWsImpl implements ContasWs {

    private static final Logger LOG = Logger.getLogger(ContasWsImpl.class.getName());

    /* (non-Javadoc)
     * @see br.com.efraimgentil.ws.ContasWs#novo(br.com.efraimgentil.ws.Conta  arg0 )*
     */
    public void novo(br.com.efraimgentil.ws.Conta arg0) { 
        LOG.info("Executing operation novo");
        System.out.println(arg0);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see br.com.efraimgentil.ws.ContasWs#aPagar(*
     */
    public java.util.List<br.com.efraimgentil.ws.Conta> aPagar() { 
        LOG.info("Executing operation aPagar");
        try {
            java.util.List<br.com.efraimgentil.ws.Conta> _return = new java.util.ArrayList<br.com.efraimgentil.ws.Conta>();
            br.com.efraimgentil.ws.Conta _returnVal1 = new br.com.efraimgentil.ws.Conta();
            _returnVal1.setCedente("Cedente-1856293428");
            _returnVal1.setDataPagamento(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-06-20T21:34:34.990-03:00"));
            _returnVal1.setDataVencimento(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-06-20T21:34:34.991-03:00"));
            _returnVal1.setDescricao("Descricao1020725798");
            _returnVal1.setId(Long.valueOf(-7757915408950333753l));
            _returnVal1.setValor(Double.valueOf(0.4688330101210034));
            _returnVal1.setValorPago(Double.valueOf(0.31518562901805447));
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}