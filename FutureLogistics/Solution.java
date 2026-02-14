package FutureLogistics;

import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Goods Transport details");
		String input = sc.nextLine();
		Solution sol = new Solution();
		System.out.println(sol.processInput(input));
	}
    public String processInput(String input) {
        Utility utility = new Utility();
        String id = input.split(":")[0];
         if(!utility.valiadateTransportId(id)){
             return "Invalid transportId";
         }

        GoodsTransport gt = utility.parseDetails(input);

        if(utility.findObjectType(gt).equals("BrickTransport")){
            BrickTransport bt = (BrickTransport)gt;
            
            return "Transporter id : "+bt.transportId+"\nDate of transport : "+bt.transportDate+"\nRating of the transport : "+bt.transportRating+"\nuantity of bricks : "+bt.brickQuantity+"\nBrick price : "+bt.brickPrices+"\nVehicle for transport : "+bt.vehicleSelection()+"\nTotal charge : "+bt.calculateTotalCharge();
        }
        else{
            TimberTransport tt = (TimberTransport)gt;
            return "Transporter id : "+tt.transportId+"\nDate of transport : "+tt.transportDate+"\nRating of the transport : "+tt.transportRating+"\nType of the timber : "+tt.timberType+"\nTimber price per kilo : "+tt.timberPrice+"\nVehicle for transport : "+tt.vehicleSelection()+"\nTotal charge : "+tt.calculateTotalCharge();
        }
    }
}

abstract class GoodsTransport{
    String transportId;
    String transportDate;
    int transportRating;

    public GoodsTransport(String transportId,String transportDate, int transportRating){
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }
    public String getTransportId(){
        return transportId;
    }
    public String getTransportDate(){
        return transportDate;
    }
    public int getTransportRating(){
        return transportRating;
    }

    abstract public String vehicleSelection();
    abstract public float calculateTotalCharge();
}

class BrickTransport extends GoodsTransport{
    float brickSize;
    int brickQuantity;
    float brickPrices;

    public BrickTransport(String transportId, String transportDate, int transportRating,float brickSize, int brickQuantity, float brickPrices){
        super(transportId, transportDate, transportRating);
        this.brickSize=brickSize;
        this.brickQuantity=brickQuantity;
        this.brickPrices=brickPrices;
    }
    public int getBrickQuantity(){
        return brickQuantity;
    }
    public float getBrickSize(){
        return brickSize;
    }
    public float getBrickPrice(){
        return brickPrices;
    }

    public String vehicleSelection(){
        if(brickQuantity < 300) return "Truck";
        else if(brickQuantity >= 300 && brickQuantity<=500) return "Lorry";
        else return "MonsterLorry";
    }
    public float calculateTotalCharge(){
        int vehiclePrice = vehicleSelection().equals("Truck")?1000 : vehicleSelection().equals("Lorry")?1700:3000;
        float price = brickPrices*brickQuantity;
        float tax = price*0.3f;
        float discount = transportRating == 5 ? price*0.2f:(transportRating==4 || transportRating==3)?price*0.1f:0.0f;
        return (price+vehiclePrice+tax)-discount;
    }
}

class TimberTransport extends GoodsTransport{
    float timberLength;
    float timberRadius;
    String timberType;
    float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating, float timberLength, float timberRadius, String timberType, float timberPrice){
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }
    public float getTimberLength(){
        return timberLength;
    }
    public float getTimberRadius(){
        return timberRadius;
    }
    public String getTimberType(){
        return timberType;
    }
    public float getTimberPrice(){
        return timberPrice;
    }

    public String vehicleSelection(){
        float area = 2*3.147f*timberRadius*timberLength;

        if(area < 250) return "Truck";
        else if(area >= 250 && area <= 400) return "Lorry";
        else return "MonsterLorry";

    }
    public float calculateTotalCharge(){
        int vehiclePrice = vehicleSelection().equalsIgnoreCase("Truck")?1000:vehicleSelection().equalsIgnoreCase("Lorry")?1700:3000;
        float timberTypeRate = timberType.equalsIgnoreCase("Premium")?0.25f:0.15f;
        float volume = 3.147f * timberRadius*timberRadius*timberLength;

        float price = volume * timberPrice * timberTypeRate;
        float tax = price*0.3f;
        float discount = transportRating == 5 ? price*0.2f: (transportRating == 4 || transportRating == 3) ? price*0.1f: 0.0f;
        return (price +  vehiclePrice + tax)-discount;
    }
}
class Utility{
    public GoodsTransport parseDetails(String input){
        String[] type = input.split(":");
        if(type[3].equalsIgnoreCase("BrickTransport")){
            return new BrickTransport(type[0], type[1], Integer.parseInt(type[2]), Float.parseFloat(type[4]), Integer.parseInt(type[5]), Float.parseFloat(type[6]));
        } 
        else{
            return new TimberTransport(type[0], type[1], Integer.parseInt(type[2]),Float.parseFloat(type[4]), Float.parseFloat(type[5]), type[6], Float.parseFloat(type[7]));
        }
    }
    public boolean valiadateTransportId(String transportId){
        return transportId.matches("RTS\\d{3}[A-Z]");
    }
    public String findObjectType(GoodsTransport goodsTransport){
        if( goodsTransport instanceof BrickTransport ){
            return "BrickTransport";
        }
        else{
            return "TimberTransport";
        }
    }
}