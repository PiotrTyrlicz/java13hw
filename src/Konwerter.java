public class Konwerter {
    private double metry;
    private double kilogramy;

    private double centymetry;
    private double milimetry;

    private double gramy;
    private double miligramy;

    public double getMetry() {
        return metry;
    }
    public void setMetry(double metry) {
        this.metry = metry;
    }

    public double getKilogramy() {
        return kilogramy;
    }
    public void setKilogramy(double kilogramy) {
        this.kilogramy = kilogramy;
    }


    public Konwerter(){}


    public String konwertuj(double metry, double kilogramy){

        centymetry=metry*100;
        milimetry=centymetry*10;

        gramy=kilogramy*1000;
        miligramy=gramy*10;
        return "centymetry: "+centymetry+ "\nmilimetry"+milimetry+"\n\nGramy: "+gramy+ "\nmiligramy"+miligramy;
    }


}

