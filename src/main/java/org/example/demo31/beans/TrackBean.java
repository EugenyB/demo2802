package org.example.demo31.beans;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.example.demo31.dao.TrackDao;
import org.example.demo31.data.Track;

import java.util.List;

@Named
@RequestScoped
public class TrackBean {
    @EJB
    private TrackDao trackDao;

    public List<Track> getTracks() {
        return trackDao.findAll();
    }
}
