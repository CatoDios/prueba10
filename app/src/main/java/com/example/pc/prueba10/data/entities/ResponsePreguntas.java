package com.example.pc.prueba10.data.entities;

import java.util.ArrayList;

/**
 * Created by pc on 7/03/2018.
 */

public class ResponsePreguntas<T>{
    private int count;
    private String next;
    private String previous;
    private ArrayList<T> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public ArrayList<T> getResults() {
        return results;
    }

    public void setResults(ArrayList<T> results) {
        this.results = results;
    }
}
