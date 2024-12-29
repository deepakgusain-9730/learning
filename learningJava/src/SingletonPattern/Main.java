package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        DbConnection db = Singleton.getInstance();
        System.out.println(db.abc);

        DbConnection db2 = Singleton.getInstance();
        System.out.println(db2 == db);
    }
}
