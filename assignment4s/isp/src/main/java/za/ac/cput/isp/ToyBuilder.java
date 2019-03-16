package za.ac.cput.isp;

public class ToyBuilder {
    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse=new ToyHouse(18.00,"Red");
        toyHouse.getColor();
        toyHouse.getPrice();
        return toyHouse;
    }
}
