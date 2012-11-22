package org.diveintojee.poc.web;

import org.diveintojee.poc.domain.business.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * User: lgueye Date: 22/11/12 Time: 15:37
 */
@Component
@Path(FullReIndexClassifiedsResource.COLLECTION_RESOURCE_PATH)
public class FullReIndexClassifiedsResource {

    public static final String COLLECTION_RESOURCE_PATH = "/classifieds/fullreindex";

    @Autowired
    private Facade facade;

    @POST
    public void stopConsuming() throws Throwable {
        facade.fullReIndexClassifieds();
    }

}
