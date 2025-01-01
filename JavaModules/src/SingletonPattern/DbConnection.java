package SingletonPattern;

public class DbConnection {
    public String abc = "Hello connection";

    private DbConnection(){

    }

    public static DbConnection getInstance(){
        return new DbConnection();
    }

}
