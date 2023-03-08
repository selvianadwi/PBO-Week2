package week2;

//NOMOR 1
public class Sepeda{
    //ini adalah tempat atribut
    int gear = 5;
    
    //ini adalah tempat method
    void ngerem(){
        System.out.println("Sepeda direm");
    }
    
    //konstruktor
    Sepeda(int jumlahRoda, String jenis, String merk){
        System.out.println("Sepeda "+jenis+ " bermerk "+merk+ " memiliki jumlah roda "+ jumlahRoda);
    }
    
    
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda(2, "Gunung", "Polygon");
        sepeda.ngerem();
        System.out.println("Gear sepeda: " + sepeda.gear);
    }
}
