package tp2_convertisseurobjet_boree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author leoboree
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
    nbConversions = 0 ;
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        tCelcius = tCelcius + 273; 
        nbConversions = nbConversions + 1;
        return tCelcius;
        
    }
    public double  KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273;  
        nbConversions = nbConversions + 1;

        return tKelvin;
    }
    public double  FarenheitVersCelcius(double tFarenheit ) {
        tFarenheit = (tFarenheit - 32) * 1.8 ;  
        nbConversions = nbConversions + 1;

        return tFarenheit;   
    }    
    public double  CelciusVersFarenheit(double celcius) {
        celcius = (celcius * 1.8 ) + 32 ;  
        nbConversions = nbConversions + 1;
        return celcius;    
    }
    public  double   KelvinVersFarenheit(double kelvin) {
        double celcius = KelvinVersCelcius ( kelvin);
        double farenheit = CelciusVersFarenheit(celcius);
        nbConversions = nbConversions - 1;
        return farenheit;
     
    }
    public double FarenheitVersKelvin (double  Farenheit) {
         double celsius = FarenheitVersCelcius(Farenheit);
         double Kelvin = CelciusVersFarenheit(celsius);
        nbConversions = nbConversions - 1;
         return Kelvin;
    }     
@Override
public String toString () {
 return "nb de conversions" + nbConversions;
}
    
}

