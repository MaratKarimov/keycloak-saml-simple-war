package ru.maratk;

import ru.maratk.rest.SecuredResource;
import ru.maratk.rest.UnSecuredResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/")
public class RestAppActivator extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(UnSecuredResource.class);
        resources.add(SecuredResource.class);
    }
}