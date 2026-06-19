package tester.com;

import java.util.ArrayList;
import java.util.Scanner;

import bank_dal.Account_DAO;
import bank_pojo.Account;

public class Test_CRUD_Account {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int ch;

			System.out.println("1:ShowAll 2:CreateNew 3:edit 4:delete 5:withdraw");

			Account_DAO actDao = new Account_DAO();//
			ArrayList<Account> bankActs;

			do {

				System.out.println("Choice:");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					bankActs = actDao.getAllActs();
					for (Account act : bankActs) {
						System.out.println(act);
					}

					break;
				case 2:
					System.out.println("Actid name email pwd bal");
					int i = actDao
							.createNewAct(new Account(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble()));

					if (i > 0)
						System.out.println("Inserted......");

					break;
				case 3:

					System.out.println("Enter Name to Edit For ActId");

					String nm = sc.next();
					int actid = sc.nextInt();
					i = actDao.editName(actid, nm);
					if (i > 0)
						System.out.println("Updated......");

					break;
				case 4:
					System.out.println("Enter ActID to delete");
					i = actDao.deleteAccount(sc.nextInt());
					if (i > 0)
						System.out.println("Deleted");
					break;

				case 5:

					// validate email,pwd :Login

					System.out.println("----Login--------");
					System.out.println("Email Pwd ");

					Account act = actDao.login(sc.next(), sc.next());
					System.out.println(act);
					if(act!=null)
					{
						System.out.println("Enter Amount To Withdraw");
						actDao.withdraw(act, sc.nextDouble());
					}
					
					// System.out.println("Enter Actid Amount to withdraw");

					break;

				}

			} while (ch != 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("---visit again----");

	}

}