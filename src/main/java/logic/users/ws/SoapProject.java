package logic.users.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Serhiy Dubovenko
 */

@WebService(name = "SoapProjectWs")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SoapProject {

    @WebMethod
    String sayHello(@WebParam(name = "name") @XmlElement(required=true, nillable=false) String name);

}
