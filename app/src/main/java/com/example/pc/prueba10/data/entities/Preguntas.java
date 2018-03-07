package com.example.pc.prueba10.data.entities;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by pc on 7/03/2018.
 */

public class Preguntas {
    private int id;
    private Date created_at;
    private String text;
    private String image;
    private int num_likes;

    private boolean is_like;
    private boolean is_closed;
    private boolean is_my_question;
    private User user;
    private String course;
    private ArrayList<Answer> answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getNum_likes() {
        return num_likes;
    }

    public void setNum_likes(int num_likes) {
        this.num_likes = num_likes;
    }

    public boolean isIs_like() {
        return is_like;
    }

    public void setIs_like(boolean is_like) {
        this.is_like = is_like;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public boolean isIs_my_question() {
        return is_my_question;
    }

    public void setIs_my_question(boolean is_my_question) {
        this.is_my_question = is_my_question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public ArrayList<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<Answer> answer) {
        this.answer = answer;
    }
}
