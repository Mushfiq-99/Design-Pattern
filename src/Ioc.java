public class Ioc {
    public static void main(String[] args) {

        //Ioc container = new Ioc();
        User user = new User(new OracleDatabase());
        user.add("this is some data");
    }
}