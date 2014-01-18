package org.jeetrans.pl;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/examples")
public class ExamplesList {

    @EJB
    private ExamplesBean examplesBean;

    @Path("/sanity")
    @GET
    public String sanityCheck() {
        return examplesBean.sanityCheck();
    }
}
