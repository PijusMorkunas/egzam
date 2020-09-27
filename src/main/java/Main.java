import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //i. Peržiūrėti savo sąsakaitas ir balansus
        //ii. Tranzakcijų istoriją
        //iii. Įnešti pinigų
        //iv. Išsiimti pinigus
        //v. Padaryti pavedimą
        //vi. Išeksportuoti transakcijų istoriją už norimą datą į failą (t.y. Visas
        //tranzakcijas atliktas 2020-01-20 - 2020-02-02)
//fix - only one add or mines can work at once
Info info = new Info();
info.info();
Add add = new Add();
Minus minus = new Minus();
Send send = new Send();
send.to();

    }
}
