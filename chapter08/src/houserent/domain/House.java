package houserent.domain;
//domain数据层
public class House {
    /**
     * House对象表示房屋信息
     */
    //编号 房主 电话 地址 月租 状态(已出租/未出租)
    private int id;
    private String name;
    private String telephone;
    private String address;
    private double rent;
    private String state;
    //构造器和getter setter

    public House(int id, String name, String telephone, String address, double rent, String state) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t\t" + telephone +
                "\t\t" + address +
                "\t\t" + rent +
                "\t\t" + state;
    }
}
