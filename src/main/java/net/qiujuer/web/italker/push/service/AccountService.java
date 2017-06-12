package net.qiujuer.web.italker.push.service;


import net.qiujuer.web.italker.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by mac on 12/06/2017.
 */
//
@Path("/account")
public class AccountService {

    @GET
    @Path("/login")
    public String get() {
        return "You are logging in";
    }

    @POST
    @Path("/login")
    // Specify the type sent and returned to be json
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post() {
        User user = new User();
        user.setName("Verge");
        user.setGender(1);
        return user;
    }
}
