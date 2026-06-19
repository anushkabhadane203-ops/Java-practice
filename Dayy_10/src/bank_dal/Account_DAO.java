package bank_dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Bank_util.ConnectionUtil;
import bank_pojo.Account;

public class Account_DAO {

    private Connection con;

    public Account_DAO() throws Exception {
        con = ConnectionUtil.getDbConnection();
        System.out.println("DAO Object Created...");
    }

    // Show all accounts
    public ArrayList<Account> getAllActs() throws SQLException {

        ArrayList<Account> allActs = new ArrayList<>();

        String sql = "select * from Account";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            Account act = new Account(
                    rs.getInt("actid"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("pwd"),
                    rs.getDouble("balance"));

            allActs.add(act);
        }

        return allActs;
    }

    // Create Account
    public int createNewAct(Account act) throws SQLException {

        String sql = "insert into Account values(?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, act.getActid());
        pst.setString(2, act.getName());
        pst.setString(3, act.getEmail());
        pst.setString(4, act.getPwd());
        pst.setDouble(5, act.getBalance());

        return pst.executeUpdate();
    }

    // Edit Name
    public int editName(int actid, String name) throws SQLException {

        String sql = "update Account set name=? where actid=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, name);
        pst.setInt(2, actid);

        return pst.executeUpdate();
    }

    // Delete Account
    public int deleteAccount(int actid) throws SQLException {

        String sql = "delete from Account where actid=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, actid);

        return pst.executeUpdate();
    }

    // Get Account Details
    public Account getActDtls(int actid) throws SQLException {

        String sql = "select * from Account where actid=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setInt(1, actid);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            return new Account(
                    rs.getInt("actid"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("pwd"),
                    rs.getDouble("balance"));
        }

        return null;
    }

    // Login
    public Account login(String email, String pwd) throws SQLException {

        String sql = "select * from Account where email=? and pwd=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, email);
        pst.setString(2, pwd);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            return new Account(
                    rs.getInt("actid"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("pwd"),
                    rs.getDouble("balance"));
        }

        return null;
    }

    // Withdraw Money
    public void withdraw(Account act, double amount) throws SQLException {

        if (amount > act.getBalance()) {
            System.out.println("Insufficient Balance");
            return;
        }

        double newBalance = act.getBalance() - amount;

        String sql = "update Account set balance=? where actid=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setDouble(1, newBalance);
        pst.setInt(2, act.getActid());

        int rows = pst.executeUpdate();

        if (rows > 0) {
            System.out.println("Withdrawal Successful");
            System.out.println("Updated Balance : " + newBalance);
        }
    }

    // Deposit Money
    public void deposit(Account act, double amount) throws SQLException {

        double newBalance = act.getBalance() + amount;

        String sql = "update Account set balance=? where actid=?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setDouble(1, newBalance);
        pst.setInt(2, act.getActid());

        int rows = pst.executeUpdate();

        if (rows > 0) {
            System.out.println("Deposit Successful");
            System.out.println("Updated Balance : " + newBalance);
        }
    }

    // Money Transfer
    public void moneyTransfer(Account sender, int receiverId, double amount)
            throws SQLException {

        Account receiver = getActDtls(receiverId);

        if (receiver == null) {
            System.out.println("Receiver Account Not Found");
            return;
        }

        if (sender.getBalance() < amount) {
            System.out.println("Insufficient Balance");
            return;
        }

        String senderSql = "update Account set balance=? where actid=?";
        PreparedStatement pst1 = con.prepareStatement(senderSql);

        pst1.setDouble(1, sender.getBalance() - amount);
        pst1.setInt(2, sender.getActid());

        String receiverSql = "update Account set balance=? where actid=?";
        PreparedStatement pst2 = con.prepareStatement(receiverSql);

        pst2.setDouble(1, receiver.getBalance() + amount);
        pst2.setInt(2, receiver.getActid());

        pst1.executeUpdate();
        pst2.executeUpdate();

        System.out.println("Money Transfer Successful");
        System.out.println("Transferred Amount : " + amount);
    }
}