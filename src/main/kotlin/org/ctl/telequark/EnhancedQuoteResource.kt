package org.ctl.telequark

import org.eclipse.microprofile.rest.client.inject.RestClient
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/quote")
class EnhancedQuoteResource {

    @Inject
    @field: RestClient
    lateinit var qotmClient: QotmClient

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        return "${qotmClient.getQuote().quote}"
    }
}