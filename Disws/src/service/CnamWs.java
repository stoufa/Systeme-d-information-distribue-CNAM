package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bd.BD;

@Path(value="/cnam")

public class CnamWs  {

	@GET
    @Path( "/montant/{matricule}" )
    @Produces( MediaType.TEXT_PLAIN)
	public String montant(@PathParam("matricule") String cin) {
		try {
			return BD.get(cin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "erreur bd";
		}
	}
	
}
