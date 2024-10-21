public class GasTank extends Car{
    int cnt_capacity;
    final int max_capacity = 50;
    public GasTank(int cnt_capacity){
        this.cnt_capacity = cnt_capacity;
    }
    public void fill(){
        this.cnt_capacity = max_capacity;
    }
    public void empty(){
        this.cnt_capacity = 0;
    }
    public int getCapacity(){
        return this.cnt_capacity;
    }

}
