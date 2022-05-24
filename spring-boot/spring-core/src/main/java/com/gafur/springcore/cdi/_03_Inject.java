package com.gafur.springcore.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injector")
@ApplicationScoped
public class _03_Inject {
    @Inject
    private List<String> list;

    public List<String> getList() {
        return list;
    }
}
