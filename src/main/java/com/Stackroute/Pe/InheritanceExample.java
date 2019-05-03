package com.Stackroute.Pe;

   class Vehicle {
       protected String steering;
       protected String changing_gears;
       protected int speed;

       public Vehicle() {
       }

       public Vehicle(String steering, String changing_gears, int speed) {
           this.steering = steering;
           this.changing_gears = changing_gears;
           this.speed = speed;
       }


       public  String getSteering() {
           return steering;
       }

       public String getChanging_gears() {
           return changing_gears;
       }

       public int getSpeed() {
           return speed;
       }
   }


        class  Car extends Vehicle {

           protected String colour;

           public Car(){}
           public Car(String steering, String changing_gears, int speed) {

               System.out.println("Inside consd");
               super.steering = steering;
               super.changing_gears = changing_gears;
               super.speed = speed;
               this.colour = "white";
           }



           public Car(String steering, String changing_gears, int speed, String colour) {
               super.steering = steering;
               super.changing_gears = changing_gears;
               super.speed = speed;
               this.colour = colour;
           }



           public void  setColour(String colour) {
               this.colour = colour;
           }

           public String getColour() {
               return colour;


           }
       }

class  Audi extends Car {

    protected String Airbag;


    public Audi(String steering, String changing_gears, int speed, String colour) {


        super.steering = steering;
        super.changing_gears = changing_gears;
        super.speed = speed;
        super.colour = colour;
        this.Airbag = Airbag;
    }

    public String getAirbag() {
        return Airbag;
    }

    public void setAirbag(String airbag) {
        Airbag = airbag;
    }
}

    public class InheritanceExample
     {
         public  static void  main(String ar[])
         {

             Audi audi = new Audi("left","up",100,"red");

             audi.setAirbag("yes");

             System.out.println("Derived class......");
             System.out.println(" gear property of base class---"+audi.getChanging_gears());
             System.out.println(" steering property of base class---"+audi.getSteering());
             System.out.println("speed property of base class---"+audi.getSpeed());
             System.out.println("colour property of car(derived) class---"+audi.getColour());
             System.out.println(" Airbag property of audi(derived) class---"+audi.getAirbag());

         }


     }