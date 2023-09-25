package service.impl;

import service.abstrac.PersonAbstract;
import models.datacollect.DataCollect;
import service.inter.DirectorInter;
import models.Director;

public class DirectorImpl extends PersonAbstract implements DirectorInter {





    public void addDirector(Director director) {
        Director[] directors = DataCollect.getDirectors();

        for (int i = 0; i < directors.length; i++) {
            if (directors[i] == null) {
                director = directors[i];
                break;
            }
        }
    }

    @Override
    public Director getDirector(String Expertise) {
        Director[] directors = DataCollect.getDirectors();
        Director director = null;
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getExpertise().equals(Expertise)) ;
            {
                director = directors[i];
            }
        }
        return director;
    }
}
