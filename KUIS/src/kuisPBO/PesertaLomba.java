/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPBO;
import kuis.enter.Lombaanimasi;
import kuis.enter.Lombasurat;
/**
 *
 * @author IIN
 */
public class PesertaLomba implements Lombaanimasi,Lombasurat{
    double alurcerita, konten, kreatifitas, sinematografi, total;
    double ssurat,isisurat,kretiv,kaidah;

    public PesertaLomba(double alurcerita, double konten, double kreatifitas, double sinematografi, double total, double ssurat, double isisurat, double kretiv, double kaidah) {
        this.alurcerita = alurcerita;
        this.konten = konten;
        this.kreatifitas = kreatifitas;
        this.sinematografi = sinematografi;
        this.total = total;
        this.ssurat = ssurat;
        this.isisurat = isisurat;
        this.kretiv = kretiv;
        this.kaidah = kaidah;
    }

    public double getAlurcerita() {
        return alurcerita;
    }

    public void setAlurcerita(double alurcerita) {
        this.alurcerita = alurcerita;
    }

    public double getKonten() {
        return konten;
    }

    public void setKonten(double konten) {
        this.konten = konten;
    }

    public double getKreatifitas() {
        return kreatifitas;
    }

    public void setKreatifitas(double kreatifitas) {
        this.kreatifitas = kreatifitas;
    }

    public double getSinematografi() {
        return sinematografi;
    }

    public void setSinematografi(double sinematografi) {
        this.sinematografi = sinematografi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSsurat() {
        return ssurat;
    }

    public void setSsurat(double ssurat) {
        this.ssurat = ssurat;
    }

    public double getIsisurat() {
        return isisurat;
    }

    public void setIsisurat(double isisurat) {
        this.isisurat = isisurat;
    }

    public double getKretiv() {
        return kretiv;
    }

    public void setKretiv(double kretiv) {
        this.kretiv = kretiv;
    }

    public double getKaidah() {
        return kaidah;
    }

    public void setKaidah(double kaidah) {
        this.kaidah = kaidah;
    }

    
    @Override
    public void alurcerita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        halurcerita = ((15/100)*alurcerita);
    }
    

    @Override
    public void konten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        konten = ((35/100)*konten)
    }

    @Override
    public void kreatifitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        kreatifitas = ((30/100)*kreatifitas);
    }
    
    

    @Override
    public void sinematografi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    sinematografi = ((15/100)*sinematografi);
    }
   
}


