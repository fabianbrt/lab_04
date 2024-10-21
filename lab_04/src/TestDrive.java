public class TestDrive extends Car{
    static int distance;
    static int time_travelled;
    public TestDrive(){
        this.distance = 0;
        this.time_travelled = 0;
    }
    public static void cnt_state(Car car){
        System.out.println("Cnt_speed: " + car.getCnt_speed() + " Cnt_gear: " + car.cnt_gear + " distance : " + distance + " time_travelled: " + time_travelled);
    }
    public static void test_drive(Car car){

        car.accelerate();
        time_travelled++;
        distance += car.cnt_speed;
        cnt_state(car);  //state
        car.accelerate();
        time_travelled++;
        distance += car.cnt_speed;
        car.up_shift();
        car.accelerate();
        time_travelled++;
        distance += car.cnt_speed;
        car.up_shift();
        cnt_state(car);
        car.decelerate();
        time_travelled++;
        distance += car.cnt_speed;
        cnt_state(car);
        car.decelerate();
        time_travelled++;
        distance += car.cnt_speed;
        car.down_shift();
        cnt_state(car);
        car.decelerate();
        car.down_shift();
        car.STOP();
        cnt_state(car);
    }
}
