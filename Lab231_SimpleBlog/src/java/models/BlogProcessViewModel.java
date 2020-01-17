/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BlogProcessViewModel implements Serializable{
    private List<String> listStatus;
    private int size;

    public BlogProcessViewModel( List<String> listStatus, int size) {
        this.listStatus = listStatus;
        this.size = size;
    }

    public List<String> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<String> listStatus) {
        this.listStatus = listStatus;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
