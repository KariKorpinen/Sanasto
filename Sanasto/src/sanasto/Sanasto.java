/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanasto;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author kkkorpin
 */
public class Sanasto {

    static String korvaaMerkit(String muokkaa) {
        //funktio korvaa merkit '[',']','*','?','!','=','+'
        //replaceAll toiminta String:illä ei toiminut [ ja ] merkeillä,char korvauksilla toimii 
        //toimimaton muoto String korvaa=" ";String poista="?!+[]=";
        // String tie="=kaksi+?!kolme*[]";
        //String muokattu=tie.replaceAll(poista,korvaa); 
        String muokattu = "";
        char korvaa = ' ';
        int a =239;
        //korvaa merkin ´
        char d=(char)a;
        
         int b =187;
        //korvaa merkin ´
        char d2=(char)b;
        //187 ja 191 aiheuttavat seuraavan,trim ei auta
        //taulukkoarvo 0 = ╗┐C:/Users/Kari/documents/gitsanasto/sanasto/dist/Musiciens.txt
        int c =191;
        //korvaa merkin ´
        char d3=(char)c;
        //char korvaa2='';
        muokattu = muokkaa.replace(d2, korvaa).replace(d3, korvaa).replace(d, korvaa).replace('[', korvaa).replace(']', korvaa).replace('*', korvaa).replace('?', korvaa).replace('!', korvaa).replace('=', korvaa).replace('+', korvaa);
        //System.out.println(muokattu);
        return muokattu;
    }

    static String[] muutaTaulukkoKoko(String vanhaTaulukko[]) {
        //anArray = Arrays.copyOf(anArray, anArray.length * 2);
        vanhaTaulukko = Arrays.copyOf(vanhaTaulukko, vanhaTaulukko.length * 2);
        //funktio kasvattaa taulukon kokoa puolet suuremmaksi
        //ja sijoittaa vanhan taulukon arvot tilapäistaulukkoon
        //josta ne kopioidaan takaisin vanhaan,puolet suurempaan taulukkoon
      /*
         * String tilapainenTaulukko[]=null; //pyritään nollaamaan vanha sisältö
         * tilapainenTaulukko=vanhaTaulukko; int vanhakoko=0; int uusikoko=0;
         * vanhakoko=vanhaTaulukko.length; vanhaTaulukko=null; //pyritään
         * nollaamaan vanha taulukko ennen koon kasvatusta uusikoko=2*vanhakoko;
         * vanhaTaulukko=new String[uusikoko]; for(int i2=0;i2<uusikoko;i2++) {
         * if(i2<vanhakoko) { //tiedostonimitaulukko[i2]=Integer.toString(i);
         * vanhaTaulukko[i2]=tilapainenTaulukko[i2]; System.out.println("vanha
         * taulukko uusi pituus "+vanhaTaulukko[i2].toString()); //
         * System.out.println("vanha taulukko uusi pituus
         * "+vanhaTaulukko.length); } } tilapainenTaulukko=null;
         * System.out.println("vanha taulukko uusi pituus
         * "+vanhaTaulukko.length); // String muokattu[];
         * //System.out.println(muokattu);
         */
        return vanhaTaulukko;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] anArray = {1, 2, 3};
    /*
     * taulukointi alkaa nollasta
     * viitteet tiedostosta löytyviin riveihin = taulukkoarvo plus yksi
     */
// Report its size.
/*
         * System.out.println("anArray has a length of " + anArray.length);
         *
         * // Make a copy of the array that is twice the size.
         *
         * anArray = Arrays.copyOf(anArray, anArray.length * 2);
         *
         * // Report the new size.
         *
         * System.out.println("anArray now has a length of " + anArray.length);
         *
         * for(int h=0;h<anArray.length;h++) { System.out.println("anArray " +
         * anArray[h]);
}
         */
//Read more: How to Double the Size of an Array in Java | eHow.com http://www.ehow.com/how_8363458_double-size-array-java.html#ixzz1w3o3VbWN

        // TODO code application logic here

        // TreeSet <String>tree = new TreeSet<String>(); 
        int rivilaskuri = 0;
        String tiedostot[] = args;
        //String tiedosto="../Musiciens.txt";
        //args[0].toString();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i].toString());
        }
        //for(int i=0;i<tiedostot.length;i++)
        //{
        //System.out.println("tiedosto "+i+" "+tiedostot[i].toString());
        // }
        //String tiedosto="C:/Users/Kari/documents/gitsanasto/sanasto/dist/Musiciens.txt";
        String tiedosto = "";
        tiedosto = tiedostot[0].toString();
        int rivilaskuri2 = 0;
        String strLine2 = "";
        String tiedostolista[] = {" "};
        String tiedostonimitaulukko[];
        int tiedostotaulukkopituus = 0;
        int sisaanLuettuTiedostoNimiMaara = 0;
        int testiLuku = 0;
        int uusiTiedostolukupituus = 0;
        tiedostonimitaulukko = new String[10];
        String tiedostonLukuTaulukko[];
        tiedostonLukuTaulukko=new String[100];
        //static String [] muutaTaulukkoKoko(String vanhaTaulukko[])
        System.out.println("muuttamaton taulukko " + tiedostonimitaulukko.length);
        /*
         * int ih=0; //for(int ih=0;ih<10000;ih++)
         * while(uusiTiedostolukupituus!=null) { System.out.println("ih "+ih);
         * if(ih<tiedostonimitaulukko.length) { // System.out.println("pienempi
         * kuin luuppi sisällä"); // if(tiedostonimitaulukko.length%10==0) // {
         * // System.out.println("pienempi kuin 10 % luuppi sisällä"); // }
         * tiedostonimitaulukko[ih]=Integer.toString(ih).toString();
         * //System.out.println("taulukkoarvo "+ih+" =
         * "+tiedostonimitaulukko[ih].toString()); } else
         * if(tiedostonimitaulukko.length==ih) {
         * //tiedostonimitaulukko[ih]=Integer.toString(ih);
         * //System.out.println("yhtäsuuri luuppi sisällä");
         * tiedostonimitaulukko=muutaTaulukkoKoko(tiedostonimitaulukko);
         * tiedostonimitaulukko[ih]=Integer.toString(ih);
         * //System.out.println("taulukkoarvo "+ih+" =
         * "+tiedostonimitaulukko[ih].toString()); } ih++; }
         * System.out.println("tulostus"); for(int ij=0;ij<10000;ij++) {
         * System.out.println("taulukkoarvo "+ij+" =
         * "+tiedostonimitaulukko[ij].toString()); }
         *
         */
        ////////////////////////////////////////////////////////////////
        System.out.println("luettava tiedosto " + tiedosto);

        try {
            FileInputStream fstream = new FileInputStream(tiedosto);
            //luodaan streami sisäänluettavalle tiedostolle
            DataInputStream in = new DataInputStream(fstream);
            //luodaan objekti streamille 
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //luodaan streamille puskuroitu lukija 
            String strLine;
            //String tiedostolista[];
            while ((strLine = br.readLine()) != null) {
                //luetaan tiedostoa rivi riviltä
                System.out.println("rivilaskuri " + rivilaskuri);
                if (rivilaskuri < tiedostonimitaulukko.length) {
                    // System.out.println("pienempi kuin luuppi sisällä");
                    // if(tiedostonimitaulukko.length%10==0)
                    // {
                    //    System.out.println("pienempi kuin 10 % luuppi sisällä");
                    // }
                    strLine=korvaaMerkit(strLine);
                    strLine=strLine.trim();
                    tiedostonimitaulukko[rivilaskuri] = strLine.toString();
                    //System.out.println("taulukkoarvo "+ih+" = "+tiedostonimitaulukko[ih].toString());
                } else if (tiedostonimitaulukko.length == rivilaskuri) {
                    //tiedostonimitaulukko[ih]=Integer.toString(ih);
                    //System.out.println("yhtäsuuri luuppi sisällä");
                    tiedostonimitaulukko = muutaTaulukkoKoko(tiedostonimitaulukko);
                    tiedostonimitaulukko[rivilaskuri] = strLine.toString();
                    //System.out.println("taulukkoarvo "+ih+" = "+tiedostonimitaulukko[ih].toString());
                }
                rivilaskuri++;
                //tiedostolista.[rivilaskuri]=strLine2;
                //lisätään luettuun riviin tiedostonimi ja rivinumero
                //tree.add("tiedosto "+tiedosto.substring(3)+" rivi "+rivilaskuri+" "+strLine);
                //tree.add("tiedosto "+tiedosto.substring(3)+" rivi "+rivilaskuri+" "+strLine);
                //tree.add(tiedosto.substring(3)+" "+rivilaskuri+" "+strLine);
            }
            in.close();
            //in2.close();
            //suljetaan sisäänlukustreami
        } catch (Exception e) {//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
            System.err.println("tama Error: " + e.getMessage());
        }
        System.out.println("tulostus");
        for (int ij = 0; ij < rivilaskuri; ij++) {
            System.out.println("taulukkoarvo " + ij + " = " + tiedostonimitaulukko[ij].toString());
        }
        char c = tiedostonimitaulukko[0].charAt(0);
        //mukaan tulee ekaksi character value 239
        //int a =c;
        int a =239;
        char d=(char)a;
        //   char g=Character.toChars(c);
        //   '`c'
        // 
        for(int g=0;g<tiedostonimitaulukko[0].length();g++)
        {
           c=' '; 
           c = tiedostonimitaulukko[0].charAt(g);
           a =0;
           a=c;
           System.out.println("merkki " + g+ " "+c);
           System.out.println("merkin numero " + g+ " "+a);
        }    
       // String d = Character.toString(
       // '-1');
      //if (c == d) {
       //     System.out.println("löyty " + d);
       // }
        // String s = toString();
        // int i = int(c);//Integer.parseInt(s);
        //int g=Integer.parseInt(c);
        System.out.println("c " + c);
        System.out.println("c d " + d);
        ////////////////////////////////////////////////////////////////////////////////////
        //luettava tiedosto luku
        System.out.println("Luetaan tiedosto yksi ");
        String strLine3="";
        rivilaskuri=0;
         try{ //käsitellään toinen tiedosto rivilaskuri=0;; tiedosto="";
            //* //tiedosto="../Berlioz.txt";
            // tiedostonimitaulukko
            //tiedosto="C:/Users/Kari/documents/gitsanasto/sanasto/dist/Berlioz.txt";
            tiedosto=tiedostonimitaulukko[0].toString();
            System.out.println("sisaanluku tiedostonimi "+tiedosto);
            FileInputStream fstream2 = new FileInputStream(tiedosto);
            DataInputStream in2 = new DataInputStream(fstream2); BufferedReader
            br2 = new BufferedReader(new InputStreamReader(in2)); 
            strLine3=""; 
            while ((strLine3 = br2.readLine()) != null) {
                System.out.println("rivilaskuri " + rivilaskuri);
                if (rivilaskuri < tiedostonLukuTaulukko.length) {
                    // System.out.println("pienempi kuin luuppi sisällä");
                    // if(tiedostonimitaulukko.length%10==0)
                    // {
                    //    System.out.println("pienempi kuin 10 % luuppi sisällä");
                    // }
                    strLine3=korvaaMerkit(strLine3);
                    strLine3=strLine3.trim();
                    tiedostonLukuTaulukko[rivilaskuri] = strLine3.toString();
                    System.out.println("taulukkoarvo "+rivilaskuri+" = "+tiedostonLukuTaulukko[rivilaskuri].toString());
                } else if (tiedostonLukuTaulukko.length == rivilaskuri) {
                    //tiedostonimitaulukko[ih]=Integer.toString(ih);
                    //System.out.println("yhtäsuuri luuppi sisällä");
                    tiedostonLukuTaulukko = muutaTaulukkoKoko(tiedostonLukuTaulukko);
                    tiedostonLukuTaulukko[rivilaskuri] = strLine3.toString();
                    System.out.println("taulukkoarvo "+rivilaskuri+" = "+tiedostonLukuTaulukko[rivilaskuri].toString());
                }
                //rivilaskuri++;
               rivilaskuri++; //tree.add("tiedosto "+tiedosto.substring(3)+" rivi
            //* "+rivilaskuri+" "+strLine2); tree.add(tiedosto +" "+rivilaskuri+"
            //* "+strLine2); //tree.add(tiedosto.substring(3) +" "+rivilaskuri+"
            //* "+strLine2); "
            //+ "} in2.close(); "
               }
            }
            catch (Exception e){
            System.err.println("Error: " + e.getMessage()); } 
             //Iterator iterator;
            //* iterator = tree.iterator(); //haku ei palauta sanoja,joihin kuuluu
            //* muita merkkejä,kuten "Beethoven,"tai "-Beethoven" String
            //* haku="Beethoven"; while (iterator.hasNext()){ String s =
            //* iterator.next().toString(); //pilkotaan rivi sanoiksi String[] words2
            //* = s.split(" "); for (String word : words2)//käydään sanat läpi {
            //* if(word.equals(haku))//jos sana on sama kuin hakuarvo,se tulostetaan
            //* { System.out.println(s); //Haun tulostus tulee muodossa //Berlioz.txt
            //* 9119 directeur des Beaux-Arts s'exprimer ainsi. Il admettait que
            //* Beethoven //Musiciens.txt 581 romantisme indompté de Beethoven et de
            //* Berlioz, la tragédie du siècle, } } }
            //iterator=null;
        
        //luettava tiedostoluku loppuu
        ////////////////////////////////////////////////////////////////////////////////////
        
        //char[]uusi={tiedostonimitaulukko[0]};
        //----------------------------------------
        //   String[] anArrayOfStrings;
/*
         * //You can also place the square brackets after the array's name:
         *
         * // this form is discouraged //float anArrayOfFloats[];
         *
         * //However, convention discourages this form; the brackets identify
         * the array type and should appear with the type designation.
         * //Creating, Initializing, and Accessing an Array
         *
         * //One way to create an array is with the new operator. The next
         * statement in the ArrayDemo program allocates an array with enough
         * memory for ten integer elements and assigns the array to the anArray
         * variable.
         *
         * // create an array of integers //anArray = new int[10];
         *
         * //------------------------------------------ // String
         * tiedostolista[][]; tiedostolista=new String[rivilaskuri];
         * FileInputStream fstream2 = new FileInputStream(tiedosto);
         * DataInputStream in2 = new DataInputStream(fstream2); BufferedReader
         * br2 = new BufferedReader(new InputStreamReader(in2));
         * //BufferedReader br2 = new BufferedReader(new InputStreamReader(in));
         * //String tiedostolista[]; //br2 // for (int j=0;j<rivilaskuri;j++) //
         * { // if(strLine2 = br2.readLine()) != null)) // {
         *
         * // } // } while ((strLine2 = br2.readLine()) != null) { //luetaan
         * tiedostoa rivi riviltä
         *
         * //tiedostolista[rivilaskuri2][rivilaskuri2]={{rivilaskuri2},{strLine2}};
         * //tiedostolista[rivilaskuri2][0]=Integer.toString(rivilaskuri2);
         * if(rivilaskuri2<=rivilaskuri) { System.out.println("rivi
         * "+strLine2.trim()); tiedostolista[rivilaskuri2]=strLine2.toString();
         * } rivilaskuri2++; //lisätään luettuun riviin tiedostonimi ja
         * rivinumero // tree.add("tiedosto "+tiedosto.substring(3)+" rivi
         * "+rivilaskuri+" "+strLine); // tree.add("tiedosto
         * "+tiedosto.substring(3)+" rivi "+rivilaskuri+" "+strLine);
         * //tree.add(tiedosto.substring(3)+" "+rivilaskuri+" "+strLine); }
         * in.close(); in2.close(); //suljetaan sisäänlukustreami }catch
         * (Exception e){//siepataan poikkeus ja yritetään tulostaa
         * virheenaiheuttaja System.err.println("tama Error: " +
         * e.getMessage()); } System.out.println("tiedostolista koko
         * "+tiedostolista.length); for(int i=0;i<rivilaskuri;i++) { //
         * System.out.println("tiedostolista "+i);
         * System.out.println("tiedostolista "+i);
         * System.out.println("tiedostolista "+i+"
         * "+tiedostolista[i].toString()); // System.out.println("tiedostolista
         * "+i+" "+tiedostolista[1][0].toString()); 
      }
         */
        //25-5-2012 
        //taulukon koon kasvattamisen testaus kesken
        //toteutus on tarkoitus käyttää tiedostonimiin ja tiedostojen riveihin
        //ja sitten puuttuu koko algoritmi
        //
      /*
         * String tiedostonimitaulukko[]; int tiedostotaulukkopituus=0; int
         * sisaanLuettuTiedostoNimiMaara=0; int testiLuku=0; int
         * uusiTiedostolukupituus=0; tiedostonimitaulukko=new String[10];
         * //static String [] muutaTaulukkoKoko(String vanhaTaulukko[])
         * System.out.println("muuttamaton taulukko
         * "+tiedostonimitaulukko.length); int ih=0; //for(int
         * ih=0;ih<10000;ih++) while(uusiTiedostolukupituus!=null) {
         * System.out.println("ih "+ih); if(ih<tiedostonimitaulukko.length) { //
         * System.out.println("pienempi kuin luuppi sisällä"); //
         * if(tiedostonimitaulukko.length%10==0) // { //
         * System.out.println("pienempi kuin 10 % luuppi sisällä"); // }
         * tiedostonimitaulukko[ih]=Integer.toString(ih).toString();
         * //System.out.println("taulukkoarvo "+ih+" =
         * "+tiedostonimitaulukko[ih].toString()); } else
         * if(tiedostonimitaulukko.length==ih) {
         * //tiedostonimitaulukko[ih]=Integer.toString(ih);
         * //System.out.println("yhtäsuuri luuppi sisällä");
         * tiedostonimitaulukko=muutaTaulukkoKoko(tiedostonimitaulukko);
         * tiedostonimitaulukko[ih]=Integer.toString(ih);
         * //System.out.println("taulukkoarvo "+ih+" =
         * "+tiedostonimitaulukko[ih].toString()); } ih++; }
         * System.out.println("tulostus"); for(int ij=0;ij<10000;ij++) {
         * System.out.println("taulukkoarvo "+ij+" =
         * "+tiedostonimitaulukko[ij].toString()); }
         */
        /*
         * tiedostonimitaulukko=muutaTaulukkoKoko(tiedostonimitaulukko);
         * System.out.println("muutettu isommaksi taulukko
         * "+tiedostonimitaulukko.length);
         * tiedostonimitaulukko=muutaTaulukkoKoko(tiedostonimitaulukko);
         * System.out.println("muutettu isommaksi taulukko2
         * "+tiedostonimitaulukko.length);
         * tiedostonimitaulukko=muutaTaulukkoKoko(tiedostonimitaulukko);
         * System.out.println("muutettu isommaksi taulukko3
         * "+tiedostonimitaulukko.length);
         *
         * // String tiedostonimitaulukko2[]={""}; //
         * tiedostotaulukkopituus=tiedostonimitaulukko.length; // testiLuku=50;
         * //for(int i=0;i<tiedostotaulukkopituus;i++) /* for(int
         * i=0;i<testiLuku;i++) { if(i<tiedostotaulukkopituus) {
         * tiedostonimitaulukko[i]=Integer.toString(i);
         * sisaanLuettuTiedostoNimiMaara++; }
         *
         * if(sisaanLuettuTiedostoNimiMaara==tiedostotaulukkopituus) {
         * uusiTiedostolukupituus=2*tiedostotaulukkopituus;
         * tiedostonimitaulukko2=new String[uusiTiedostolukupituus];
         * System.out.println("uusi tiedostonimitaulukko eka pituus
         * "+tiedostonimitaulukko2.length); sisaanLuettuTiedostoNimiMaara=0;
         * for(int i2=0;i2<testiLuku;i2++) {
         *
         * if(i2<tiedostotaulukkopituus) {
         * //tiedostonimitaulukko[i2]=Integer.toString(i);
         *
         *
         * tiedostonimitaulukko2[i2]=tiedostonimitaulukko[i2];
         * System.out.println("uusi tiedostonimitaulukko toka pituus
         * "+tiedostonimitaulukko2.length); } } }
         *
         * }
         */
        /*
         * //tiedostotaulukkopituus System.out.println("tiedostonimitaulukko
         * pituus "+tiedostotaulukkopituus);
         * System.out.println("tiedostonimitaulukko uusi pituus
         * "+tiedostonimitaulukko2.length); String tiedostonimitaulukko3[];
         * tiedostonimitaulukko3=new String[50];
         * tiedostonimitaulukko2=tiedostonimitaulukko3;
         * System.out.println("tiedostonimitaulukko2 uusi pituus
         * "+tiedostonimitaulukko2.length); String ulos=""; for(int
         * j=0;j<tiedostonimitaulukko2.length;j++) { ulos=" "; try {
         * ulos=tiedostonimitaulukko2[j];//=Integer.toString(i); if(ulos==null)
         * { break; } else {
         *
         * System.out.println(tiedostonimitaulukko2[j]);//=Integer.toString(i);
         * sisaanLuettuTiedostoNimiMaara++; } } catch(Exception e) {
         * System.err.println("tama onko null Error: " + e.getMessage()); }
         *
         * }
         *
         */
        String tie = "=kaksi+?!kolme*[]";
        String muokattu = "";
        muokattu = korvaaMerkit(tie);
        //String muokattu="";
        // char korvaa=' '; 
        // String poista="? ! + [ ] =";
        // muokattu=tie.replace('[',korvaa).replace(']',korvaa).replace('*',korvaa).replace('?',korvaa).replace('!',korvaa).replace('=',korvaa).replace('+',korvaa);
        //muokattu=tie.replaceAll(poista," ");
        System.out.println(muokattu);
        // poista="\\]";
        // muokattu=muokattu.replaceAll(poista," ");
        //  System.out.println(muokattu);
        // poista="*+!?=,;";
        //poista="\\[";
        // muokattu=muokattu.replaceAll(poista," ");
        //  System.out.println(muokattu);
        //poista="[]";
        //muokattu=tie.replaceAll(poista," ");
        //System.out.println(muokattu);
              /*
         * try{ //käsitellään toinen tiedosto rivilaskuri=0;; tiedosto="";
         * //tiedosto="../Berlioz.txt";
         * tiedosto="C:/Users/Kari/documents/gitsanasto/sanasto/dist/Berlioz.txt";
         * FileInputStream fstream2 = new FileInputStream(tiedosto);
         * DataInputStream in2 = new DataInputStream(fstream2); BufferedReader
         * br2 = new BufferedReader(new InputStreamReader(in2)); String
         * strLine2; while ((strLine2 = br2.readLine()) != null) {
         * rivilaskuri++; //tree.add("tiedosto "+tiedosto.substring(3)+" rivi
         * "+rivilaskuri+" "+strLine2); tree.add(tiedosto +" "+rivilaskuri+"
         * "+strLine2); //tree.add(tiedosto.substring(3) +" "+rivilaskuri+"
         * "+strLine2); } in2.close(); }catch (Exception e){
         * System.err.println("Error: " + e.getMessage()); } Iterator iterator;
         * iterator = tree.iterator(); //haku ei palauta sanoja,joihin kuuluu
         * muita merkkejä,kuten "Beethoven,"tai "-Beethoven" String
         * haku="Beethoven"; while (iterator.hasNext()){ String s =
         * iterator.next().toString(); //pilkotaan rivi sanoiksi String[] words2
         * = s.split(" "); for (String word : words2)//käydään sanat läpi {
         * if(word.equals(haku))//jos sana on sama kuin hakuarvo,se tulostetaan
         * { System.out.println(s); //Haun tulostus tulee muodossa //Berlioz.txt
         * 9119 directeur des Beaux-Arts s'exprimer ainsi. Il admettait que
         * Beethoven //Musiciens.txt 581 romantisme indompté de Beethoven et de
         * Berlioz, la tragédie du siècle, } } }
      iterator=null;
         */
    }
}
