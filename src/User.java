public class User {
    Database database;
   /* public User()
    {
        database = new MySqlDatabase();
    } */
    public User(Database database)
    {
        this.database = database;
    }
    public void add(String data)
    {
        database.persist(data);

    }
}
