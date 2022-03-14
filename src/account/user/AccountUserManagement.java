package account.user;

import service.AccountUser.IOFileUser;

import java.util.ArrayList;
import java.util.List;

public class AccountUserManagement {
    private final List<AccountUser> accountUserList = new ArrayList<>();
    private final IOFileUser<AccountUser> ioFileUser = new IOFileUser<>();
    private final String PATHNAME_OF_ACCOUNTUSER = "lequan:\\IdeaProjects\\HospitalManagement\\";

    public AccountUserManagement() {
    }

    public List<AccountUser> getAccountUserList() {
        return ioFileUser.readFileData(PATHNAME_OF_ACCOUNTUSER + "account-user.txt");
    }

    public boolean checkFile() {
        List<AccountUser> accountUserList = getAccountUserList();
        return accountUserList == null;
    }


    public void setNewListAccountUser(AccountUser user, int index) {
        List<AccountUser> accountUsers = getAccountUserList();
        accountUsers.set(index, user);
        ioFileUser.writerFileData(accountUsers, PATHNAME_OF_ACCOUNTUSER + "account-user.txt");
    }

    public void setListAccountUser(String id, String password) {
        List<AccountUser> accountUsers;
        if (checkFile()) {
            accountUsers = accountUserList;
        }else {
            accountUsers = getAccountUserList();
        }
        accountUsers.add(new AccountUser(id, password));
        ioFileUser.writerFileData(accountUsers, PATHNAME_OF_ACCOUNTUSER+ "account-user.txt");
    }

    public static void main(String[] args) {
        AccountUserManagement accountUserManagement = new AccountUserManagement();
        System.out.println(accountUserManagement.checkFile());
        System.out.println(accountUserManagement.getAccountUserList().size());
        for (AccountUser x : accountUserManagement.getAccountUserList()) {
            System.out.println(x.getUserId());
            System.out.println(x.getUserPassword());
        }
    }
}
