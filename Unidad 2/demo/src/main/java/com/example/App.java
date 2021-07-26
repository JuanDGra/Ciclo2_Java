package com.example;

import java.util.ArrayList;

// import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // ArrayList <Integer> lista = new ArrayList();
        ArrayList <Object> lista = new ArrayList();
        lista.add(25);
        lista.add(-12);
        lista.add(20.05);
        System.out.println(lista.get(2));
    }
}
