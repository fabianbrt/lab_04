public class Driver extends Car{
    private String f_name;
    private String l_name;
    private int age;
    private String driver_license;
    public Driver(String f_name, String l_name, int age, String driver_license) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
        this.driver_license = driver_license;
    }
    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
    public String getL_name() {
        return l_name;
    }
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDriver_license() {
        return driver_license;
    }
    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }
 //   @Override
    public String toString(){
        return f_name + " " + l_name + " " + age + " " + driver_license;
    }


}
