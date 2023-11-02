public abstract class TangibleAsset {
  Private String name;
  Private int price;
  Private String color;
  public TangibleAsset(String name,int price,String color){
    this.name = name;
    this.price = price;
    this.color = color;
  }
  public String getName(){return this.name;}
  public int getPrice(){return this.price;}
  pubric String getColor(){return this.color;}
