package logic.users.rest;

import logic.users.example.dao.ActorDAOImpl;
import logic.users.example.enity.Actor;
import logic.users.persistence.HibernateUtil;
import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;;
import java.util.List;

/**
 * @author Serhiy Dubovenko on 2/26/2019
 */


@Path("/actor")
public class ActorsRS {


    // select name, midlename, surname, yearOfBirth, countryKey from Actor;

    @POST
    @Path("/addActorQ")
    public Response addActorsQuery( @QueryParam("name") String sName,
                               @QueryParam("midlename") String sMidlename,
                               @QueryParam("surname") String sSurname,
                               @QueryParam("yearOfBirth") String iYearOfBirth,
                               @QueryParam("countryKey") String iCountryKey ) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ActorDAOImpl aDAOImpl = new ActorDAOImpl();
        Actor newActor = new  Actor(sName, sMidlename, sSurname, iYearOfBirth, iCountryKey);
        aDAOImpl.addActorJPA(session, newActor);
        JSONObject jsonObject = null;
        if(aDAOImpl.getActorsJPA(session).contains(newActor)){
            jsonObject = new JSONObject();
            jsonObject.put("status", true);
            jsonObject.put("message", "Actors has been added.");
        }else{
            jsonObject = new JSONObject();
            jsonObject.put("status", false);
            jsonObject.put("message", "Actors has not been found.");
        }

        return Response.status(201).entity(jsonObject.toString()).build();
    }


    @POST
    @Path("/addActor/{name}/{midlename}/{surname}/{yearOfBirth}/{countryKey}")
    public Response addActorsPath( @PathParam("countryKey") String iCountryKey,
                               @PathParam("name") String sName,
                               @PathParam("midlename") String sMidlename,
                               @PathParam("surname") String sSurname,
                               @PathParam("yearOfBirth") String iYearOfBirth) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        ActorDAOImpl aDAOImpl = new ActorDAOImpl();
        Actor newActor = new  Actor(sName, sMidlename, sSurname, iYearOfBirth, iCountryKey);
        aDAOImpl.addActorJPA(session, newActor);
        JSONObject jsonObject = null;
        if(aDAOImpl.getActorsJPA(session).contains(newActor)){
            jsonObject = new JSONObject();
            jsonObject.put("status", true);
            jsonObject.put("message", "Actors has been added.");
        }else{
            jsonObject = new JSONObject();
            jsonObject.put("status", false);
            jsonObject.put("message", "Actors has not been found.");
        }

        return Response.status(201).entity(jsonObject.toString()).build();
    }


    @GET
    @Path("/getActors")
    public Response getActors() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ActorDAOImpl aDAOImpl = new ActorDAOImpl();

        List<Actor> listOfActors = aDAOImpl.getActorsJPA(session);

        JSONObject jsonObject = null;
        if(listOfActors.isEmpty()||listOfActors==null ){
            jsonObject = new JSONObject();
            jsonObject.put("status", false);
            jsonObject.put("message", "Actors has not been found.");
        }else{
            JSONArray jArrActors = new JSONArray();
            for(int i=0; i<listOfActors.size(); i++){
                JSONObject jObjActor = new JSONObject();
                jObjActor.put("actorID", listOfActors.get(i).getActorID());
                jObjActor.put("name", listOfActors.get(i).getName());
                jObjActor.put("midlename", listOfActors.get(i).getMidlename());
                jObjActor.put("surname", listOfActors.get(i).getSurname());
                jObjActor.put("yearOfBirth", listOfActors.get(i).getYearOfBirth());
                jObjActor.put("countryKey", listOfActors.get(i).getCountryKey());
                jArrActors.put(jObjActor);
            }
            jsonObject = new JSONObject();
            jsonObject.put("status", true);
            jsonObject.put("actors", jArrActors);
        }
        return Response.status(200).entity(jsonObject.toString()).build();

    }


}