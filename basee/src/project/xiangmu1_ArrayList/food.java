package xiangmu1_ArrayList;

public class food {
    private String menu;
    private  double price;
    private String guide;
    public food(){}
    public food(String menu,double price,String guide)
    {this.menu = menu;this.price = price;this.guide = guide;
    }
    public String getMenu() {
        return menu;
    }

    public String getGuide() {
        return guide;
    }

    public double getPrice() {
        return price;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }
}
