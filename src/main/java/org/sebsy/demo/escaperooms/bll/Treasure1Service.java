package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("trap")
@Component
public class Treasure1Service implements TreasureService {

    public String ouvrir() {
        return "Perdu, vous êtes tombé dans un piège !";
    }

}
