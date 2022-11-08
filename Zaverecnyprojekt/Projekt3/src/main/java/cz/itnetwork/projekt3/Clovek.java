/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.projekt3;
import java.util.Random;

/**
 *
 * @author rosea
 */

public class Clovek {
    
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefon;
       private String vypis;
      private int id;
    private static int dalsiID = 1;


    
    
    public Clovek(String jmeno, String prijmeni, int vek, int telefon)
    {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;
        this.id = dalsiID;
        dalsiID++;
        
 
    }
    
    public String dejJmeno()
    {
        return this.jmeno;
    }

    public String dejPrijmeni()
    {
        return this.prijmeni;
    }    
  @Override 
  public String toString()
  {
    String tmp = String.valueOf(id) + " " + jmeno + " " + prijmeni + " " + String.valueOf(vek) + " " + String.valueOf(telefon);
    return String.format(tmp);
  }
       
     public int vratId(){
         return id;
     }
    
}



