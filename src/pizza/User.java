package pizza;

/**
 * This class represents User Info
 *
 * @author navde
 */
public class User {

    private String name;
    private String phone;

    /**
     * 
     * @param name
     * @param contact 
     */
    public User(String name, String contact) {
        this.name = name;
        this.phone = contact;
    }

    public User() {
    }

    /**
     * 
     * @return name of the user
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return phone/contact number of user
     */
    public String getPhone() {
         if (String.valueOf(phone).length() != 10){
        return phone;
        }
         return null;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @param name
     * @param phone
     * @return prints customer's/user's name and phone number 
     */
    public String Contact(String name, String phone) {
        String finalName = "\nName : " + name + "\nPhone : " + Validation(phone);
        return finalName;

    }

    /**
     * 
     * @param phone
     * @return breaks string in three substring and give out contact number in this format (xxx) xxxx-xxx
     */
    public String Validation(String phone) {
        String firstPart = phone.substring(0, 3);
        String secondPart = phone.substring(3, 6);
        String thirdPart = phone.substring(6, 10);

        String finalPhone = "(" + firstPart + ")" + " " + secondPart + "-" + thirdPart;
        return finalPhone;

    }

}
