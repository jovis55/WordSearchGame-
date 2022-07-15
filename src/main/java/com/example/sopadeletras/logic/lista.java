package com.example.sopadeletras.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lista {
    private  String type;
    private ArrayList<String> lista;

    public lista(String soup){
        this.type = soup;
        readDataBase();

    }

    public void readDataBase(){
        String fileName = "";

        switch (type){
            case "frutas":
                System.out.println("frutas");
                fileName = "C:\\Users\\DELL\\IdeaProjects\\SopaDeLetras\\src\\main\\java\\com\\example\\sopadeletras\\basesDeDatos\\frutas.txt";
                break;
            case "paises"  :
                fileName = "C:\\Users\\DELL\\IdeaProjects\\SopaDeLetras\\src\\main\\java\\com\\example\\sopadeletras\\basesDeDatos\\paises.txt";
                break;
            case "animales":
                fileName = "C:\\Users\\DELL\\IdeaProjects\\SopaDeLetras\\src\\main\\java\\com\\example\\sopadeletras\\basesDeDatos\\animales.txt";
                break;
            default:
                fileName = "";

        }


        try {
            File lista = new File(fileName);
            Scanner lector = new Scanner(lista);
            if(!fileName.equals("")){
                this.lista = new ArrayList<String>();
                while(lector.hasNextLine()){
                    this.lista.add(lector.nextLine());
                }
                lector.close();
                ArrayList<String> listaTemporal = new ArrayList<String>();

                for(int i = 0; i < 10; i++){
                    String temp = this.lista.get(generateRandomNumbers(0, this.lista.size()-1));

                    listaTemporal.add(temp);
                    this.lista.remove(this.lista.indexOf(temp));
                }
                this.lista = listaTemporal;


            }
        }catch (FileNotFoundException e){
        }


    }

    public static int generateRandomNumbers(int min, int max){
        Random random = new Random();
        return  random.nextInt(max)+min;
    }

    public ArrayList<String> getLista(){
        return this.lista;
    }

    public String getType(){
        return  this.type;
    }


}
