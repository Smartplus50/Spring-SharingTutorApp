package com.udacity.mvc.model;

import java.util.List;

public class Tutor {
    private Integer tutorid;
    private String tutorname;
    private String salt2;
    private String tutorpassword;
    private String firsttutorname;
    private String lasttutorname;

    public Tutor(Integer tutorid, String tutorname, String salt2, String tutorpassword, String firsttutorname, String lasttutorname) {
        this.tutorid = tutorid;
        this.tutorname = tutorname;
        this.salt2 = salt2;
        this.tutorpassword = tutorpassword;
        this.firsttutorname = firsttutorname;
        this.lasttutorname = lasttutorname;
    }

    public Integer gettutorid() {
        return tutorid;
    }

    public void settutorid(Integer tutorid) {
        this.tutorid = tutorid;
    }

    public String gettutorname() {
        return tutorname;
    }

    public void settutorname(String tutorname) {
        this.tutorname = tutorname;
    }

    public String getsalt2() {
        return salt2;
    }

    public void setsalt2(String salt2) {
        this.salt2 = salt2;
    }

    public String gettutorpassword() {
        return tutorpassword;
    }

    public void settutorpassword(String tutorpassword) {
        this.tutorpassword = tutorpassword;
    }

    public String getfirsttutorname() {
        return firsttutorname;
    }

    public void setfirsttutorname(String firsttutorname) {
        this.firsttutorname = firsttutorname;
    }

    public String getlasttutorname() {
        return lasttutorname;
    }

    public void setlasttutorname(String lasttutorname) {
        this.lasttutorname = lasttutorname;
    }
}


