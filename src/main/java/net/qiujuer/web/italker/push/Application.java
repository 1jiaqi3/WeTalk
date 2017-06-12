package net.qiujuer.web.italker.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.qiujuer.web.italker.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * Created by mac on 12/06/2017.
 */
public class Application extends ResourceConfig{
    public Application() {
        // register the package name for services
        packages(AccountService.class.getPackage().getName());

        // register the Json interpreter
        register(JacksonJsonProvider.class);

        // register the logs
        register(Logger.class);
    }
}
