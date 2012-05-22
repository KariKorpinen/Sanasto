/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanastoTesti;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
  * @author Kari
 */
public class SanastoTest {
    
    public SanastoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void TestauksenTestiTestaus() {
       System.out.println ("testitulostus");
    }  
    @Test
    public void testaaVoikoTiedostostaMuodostaaStream() {
       try{
          FileInputStream fstream = new FileInputStream("../Musiciens.txt");
          //luodaan streami sisäänluettavalle tiedostolle
          System.out.println ("FileInputStream ok");
          fstream.close();
          //suljetaan streami
       }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
          System.err.println("Error: " + e.getMessage());
       }   
    }   
    @Test
    public void testaaVoikoFileInputStreamistaMuodostaaDataInputStream() {
       try{
          FileInputStream fstream = new FileInputStream("../Musiciens.txt");
          //luodaan streami sisäänluettavalle tiedostolle
          DataInputStream in = new DataInputStream(fstream);
          //luodaan datankäsittelyobjekti streamille 
          System.out.println ("DataInputSream ok");
          in.close();
          //suljetaan datastreami
          fstream.close();
          //suljetaan sisäänlukustreami
       }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
          System.err.println("Error: " + e.getMessage());
       }   
    }   
    @Test
    public void testaaVoikoDataInputStreamistaMuodostaaBufferedReader() {
       try{
          FileInputStream fstream = new FileInputStream("../Musiciens.txt");
          //luodaan streami sisäänluettavalle tiedostolle
          DataInputStream in = new DataInputStream(fstream);
          //luodaan objekti streamille 
          BufferedReader br = new BufferedReader(new InputStreamReader(in));
          //luodaan streamille puskuroitu lukija 
          System.out.println ("BufferedReader ok");
          br.close();
          //suljetaan BufferedReader
          in.close();
          //suljetaan datastreami
          fstream.close();
          //suljetaan sisäänlukustreami
       }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
          System.err.println("Error: " + e.getMessage());
       }   
    }  
    @Test
    public void testaaOnkoFileStreamSuljettu() {
       try{
          FileInputStream fstream = new FileInputStream("../Musiciens.txt");
          //luodaan streami sisäänluettavalle tiedostolle
          fstream.close();
          //suljetaan streami
          fstream.available();
          System.out.println ("FileInputStream aktiivi?");
       }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
          System.err.println("Error FileStream suljettu: " + e.getMessage());
       }   
    }   
    @Test
    public void testaaOnkoDataInputStreamSuljettu() {
       try{
          FileInputStream fstream = new FileInputStream("../Musiciens.txt");
          //luodaan streami sisäänluettavalle tiedostolle
          DataInputStream in = new DataInputStream(fstream);
          //luodaan datankäsittelyobjekti streamille 
          in.close();
          //suljetaan datastreami
          in.available();
          System.out.println ("DataInput aktiivi?");
          fstream.close();
          //suljetaan sisäänlukustreami
       }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
          System.err.println("Error DataInputStream suljettu: " + e.getMessage());
       }   
    }   
    @Test
    public void testaaOnkoBufferedReaderSuljettu() {
       try{
          FileInputStream fstream = new FileInputStream("../Musiciens.txt");
          //luodaan streami sisäänluettavalle tiedostolle
          DataInputStream in = new DataInputStream(fstream);
          //luodaan objekti streamille 
          BufferedReader br = new BufferedReader(new InputStreamReader(in));
          //luodaan streamille puskuroitu lukija 
          br.close();
          //suljetaan BufferedReader
          int i=br.read();
          System.out.println ("BufferedReader sulkemisen jälkeen aktiivi? "+i);
          in.close();
          //suljetaan datastreami
          fstream.close();
          //suljetaan sisäänlukustreami
       }catch (Exception e){//siepataan poikkeus ja yritetään tulostaa virheenaiheuttaja
          System.err.println("Error BufferedReader suljettu: " + e.getMessage());
       }   
    }  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
