package logic.users.ws;

import com.google.gson.Gson;
import logic.users.example.dao.ActorDAOImpl;
import logic.users.example.dao.MovieDAOImpl;
import logic.users.example.enity.Actor;
import logic.users.example.enity.Hello;
import logic.users.example.enity.Movies;
import logic.users.persistence.HibernateUtil;
import org.hibernate.Session;
import org.json.JSONObject;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
@WebService(name = "SoapProjectWs")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SoapProjectWs implements SoapProject{

    public String sayHello(@WebParam(name = "name") @XmlElement(required=true, nillable=false) String name) {

        JSONObject response = null;
        if (name == null || name.length()==0) {
            return new Gson().toJson(new Hello(false, "Hello")).toString();
        }else{
            return new Gson().toJson(new Hello(false, "Hello, " + name + "!")).toString();
        }
    }





    public String addActor(@WebParam(name = "name") @XmlElement(required=true, nillable=false) String name,
                           @WebParam(name = "midlename") @XmlElement(required=true, nillable=false) String midlename,
                           @WebParam(name = "surname") @XmlElement(required=true, nillable=false) String surname,
                           @WebParam(name = "yearOfBirth") @XmlElement(required=true, nillable=false) String yearOfBirth,
                           @WebParam(name = "countryKey") @XmlElement(required=true, nillable=false) String countryKey) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        ActorDAOImpl aDAOImpl = new ActorDAOImpl();
        Actor newActor = new Actor(name, midlename, surname, yearOfBirth, countryKey);
        aDAOImpl.addActorJPA(session, newActor);
        List<Actor> listOfActors = aDAOImpl.getActorsJPA(session);
        HibernateUtil.shutdown();

        JSONObject response = null;
        if (!listOfActors.contains(newActor)) {
            response = new JSONObject();
            response.put("success", false);
            response.put("message", "The Actor "+newActor.getName()+ " "+newActor.getSurname()+" has not been found.");
            return response.toString();
        }else{
            response = new JSONObject();
            response.put("success", true);
            response.put("message",  "Success!. The actor has been added.");
        }
        return  response.toString();
    }



}
