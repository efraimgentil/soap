
package br.com.efraimgentil.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-06-17T11:40:52.241-03:00
 * Generated source version: 2.7.11
 * 
 */
public final class UserWS_UserWSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.efraimgentil.com.br/", "UserWSService");

    private UserWS_UserWSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UserWSService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UserWSService ss = new UserWSService(wsdlURL, SERVICE_NAME);
        UserWS port = ss.getUserWSPort();  
        
        {
        System.out.println("Invoking addUser...");
        br.com.efraimgentil.ws.User _addUser_user = new br.com.efraimgentil.ws.User();
        _addUser_user.setEmail("Email1291484034");
        _addUser_user.setId(Long.valueOf(-6146602438940278933l));
        _addUser_user.setPassword("Password834609698");
        _addUser_user.setUser("User1328135384");
        port.addUser(_addUser_user);


        }
        {
        System.out.println("Invoking findUser...");
        java.lang.String _findUser_email = "_findUser_email1081171514";
        java.lang.String _findUser__return = port.findUser(_findUser_email);
        System.out.println("findUser.result=" + _findUser__return);


        }

        System.exit(0);
    }

}
