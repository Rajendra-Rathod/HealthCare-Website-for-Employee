
package bean;

/**
 *
 * @author rajendra
 */
public class StockBean 
{
    
     
     private String name;
    private String email;
    private String mobile;
    private String area;

    public StockBean() 
    {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getEmail() {
        //System.out.println("get mail :"+email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
