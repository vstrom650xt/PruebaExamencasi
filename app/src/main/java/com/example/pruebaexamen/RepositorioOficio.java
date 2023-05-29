package com.example.pruebaexamen;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class RepositorioOficio {

    private List<Oficio> oficioList;
    private static  RepositorioOficio instance;


    public  RepositorioOficio (Context context) {

        oficioList = new ArrayList<>();
        oficioList.add(new Oficio("js",22));


    }
}
