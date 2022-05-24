package com.gafur.springcore.cdi;

import javax.enterprise.inject.Produces;
import java.util.List;

public class _02_Produces {

    @Produces
    public List<String> produceListOfWebTechnologies(){
        return List.of("HTML5", "CSS3", "JS", "React", "Angular");
    }
}
