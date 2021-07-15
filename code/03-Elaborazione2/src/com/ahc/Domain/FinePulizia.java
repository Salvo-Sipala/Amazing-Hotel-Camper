package com.ahc.Domain;

import java.util.List;

public class FinePulizia {

    private List<CameraDaPulire> listaCamereDaPulire;

    public FinePulizia(List<CameraDaPulire> listaCamereDaPulire) {
        this.listaCamereDaPulire = listaCamereDaPulire;
    }

    public List<CameraDaPulire> getListaCamereDaPulire() {
        return listaCamereDaPulire;
    }

    public void setListaCamereDaPulire(List<CameraDaPulire> listaCamereDaPulire) {
        this.listaCamereDaPulire = listaCamereDaPulire;
    }

    public void addCameraDaPulire(CameraDaPulire cameraDaPulire){
        listaCamereDaPulire.add(cameraDaPulire);
    }

    @Override
    public String toString() {
        return "FinePulizia{" +
                "listaCamereDaPulire=" + listaCamereDaPulire +
                '}';
    }
}
