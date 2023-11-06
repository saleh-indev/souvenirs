package com.vacance.souvenirs;

import java.util.Date;

public class Lieu {
    private String date;
    private String commentaire;

    public Lieu(String date, String commentaire) {
        this.date = date;
        this.commentaire = commentaire;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
