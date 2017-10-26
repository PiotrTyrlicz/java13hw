public class Informacje {

    private String wiadomosc;

    public Informacje(String tekst) {
        this.wiadomosc = tekst;
    }

    public String getTekst() {
        return wiadomosc;
    }
    public void setTekst(String tekst) {
        this.wiadomosc = tekst;
    }

    public String pokazInformacje(){
        int dlugosc=wiadomosc.length();
        int iloscSpacji=0;
        boolean palindrom=true;
        //ilosc spacji
        for (int i=0; i<dlugosc; i++){
            if ((wiadomosc.charAt(i))==' ') {
               iloscSpacji++;
            }
        }
        int bezSpacji=dlugosc-iloscSpacji;
       //palindrom - uwzglednia wielkosc liter
        for (int i=0; i<dlugosc/2; i++){
            if(!(wiadomosc.charAt(i)==wiadomosc.charAt(dlugosc-i-1))){
                palindrom=false;
            }

        }

        //ilosc wyrazow
        int iloscWyrazow=1;
        if ((wiadomosc.charAt(0))==' ' && (wiadomosc.charAt(1))==' '){
            iloscWyrazow--;
        }
        for (int i=0; i<dlugosc; i++){

            if ((wiadomosc.charAt(i))==' ' && (wiadomosc.charAt(i+1))!=' '){
                iloscWyrazow++;
            }
        }


        wiadomosc="Długosc calkowita"+dlugosc + "\nDlugosc bez spacji: "+bezSpacji+ "\nIlosc wyrazow: "+iloscWyrazow + "\nCzy jest palindromem? "+palindrom;


        return wiadomosc;
    }





}
