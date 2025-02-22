public class Department {
    private int depID;
    private String name;
    private String city;
    private String province;

    Department(int depID,String name){
        city = "siracha";
        province = "chonburi";
    }

    Department(int depID,String name,String city,String province){
        this.depID = depID;
        this.name = name;
        this.city = city;
        this.province = province;
    }

    public int getDepID() {
        return depID;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getProvince() {
        return province;
    }
    public void setDepID(int depID) {
        this.depID = depID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public void displayAll(){
        System.out.println(this.depID);
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.province);
    }
}
