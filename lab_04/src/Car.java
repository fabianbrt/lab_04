import java.awt.Color;
import java.util.Random;
public class Car {
    String make;
    Color color;
    int cnt_speed;
    int cnt_gear;
    int max_speed;
    final int total_gears;
    public Car(String make, Color color, int cnt_speed, int cnt_gear, int max_speed, int total_gears){
        this.make = make;
        this.color = color;
        this.cnt_speed = cnt_speed;
        this.cnt_gear = cnt_gear;
        this.max_speed = max_speed;
        this.total_gears = total_gears;
    }
    public Car(){
        this("VW", Color.gray, 0, 0, 260, 6);
    }
    public String getMake(){
        return make;
    }
    public Color getColor(){
        return color;
    }
    public int getCnt_speed(){
        return cnt_speed;
    }
    public int getCnt_gear(){
        return cnt_gear;
    }
    public int getMax_speed(){
        return max_speed;
    }
    public int getTotal_gears(){
        return total_gears;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setCnt_speed(int cnt_speed){
        this.cnt_speed = cnt_speed;
    }
    public void setCnt_gear(int cnt_gear){
        this.cnt_gear = cnt_gear;
    }
    public void setMax_speed(int max_speed){
        this.max_speed = max_speed;
    }
    public String toString(){
        return "This car with make " + this.make + ", color " + this.color + " has the current speed " + this.cnt_speed + "km/h " +
                " and current gear " + this.cnt_gear + " with max speed " + this.max_speed + "km/h " + "and total gears " + this.total_gears;
    }

    public void accelerate(){
       if(this.cnt_speed + 10 <= this.max_speed){
           this.cnt_speed += 10;
       }

    }
    public void decelerate(){
        if(this.cnt_speed - 10 >= 0){
            this.cnt_speed -= 10;
        }
    }
    public void up_shift(){
        if(this.cnt_gear + 1 < this.total_gears){
            this.cnt_gear++;
        }
    }
    public void down_shift(){
       if(this.cnt_gear - 1 >= 0){
           this.cnt_gear--;
       }
    }
    public void STOP(){
        this.cnt_speed = 0;
        this.cnt_gear = 0;
    }



}
