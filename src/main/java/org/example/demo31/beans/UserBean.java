package org.example.demo31.beans;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.example.demo31.dao.TrackDao;
import org.example.demo31.data.User;

import java.io.Serializable;

@Named
@SessionScoped
public class UserBean implements Serializable {

    private final static long serialVersionUID = 123123413L;

    @Getter
    @Setter
    private User user = new User();

    public String hello() {
        return "hello";
    }
}
