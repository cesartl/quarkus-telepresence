package org.ctl.telequark



import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/")
@RegisterRestClient
interface QotmClient {

    @GET
    @Produces("application/json")
    fun getQuote() : Quote
}