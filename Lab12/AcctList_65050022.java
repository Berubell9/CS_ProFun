package ProFun.Lab12;

import java.util.ArrayList;

class AcctList_65050022 {
    ArrayList<Account_650022> acctList;

    AcctList_65050022() {
        acctList = new ArrayList<>();
        acctList.add(new Account_650022(1, "Cactus", 1000));
        acctList.add(new Account_650022(2, "Celsia", 500));
        acctList.add(new Account_650022(3, "Clove pink", 1500));
        acctList.add(new Account_650022(4, "Crown Imperial", 900));
        acctList.add(new Account_650022(5, "Daffodil", 1200));
        acctList.add(new Account_650022(6, "Daisy", 1700));
        acctList.add(new Account_650022(7, "Dandelion", 500));
        acctList.add(new Account_650022(8, "Dittany", 600));
    }

    ArrayList<Account_650022> filterName(String c) {
        char[] charStartWith = c.toCharArray();
        ArrayList<Account_650022> result = new ArrayList<>();
        for(int i=0;i<acctList.size();i++){
            if(charStartWith[0] == acctList.get(i).getName().charAt(0)){
                result.add(acctList.get(i));
            }
        }
        return result;
    }

    ArrayList<Account_650022> balanceLessThan(int b) {
        ArrayList<Account_650022> result = new ArrayList<>();
        for(int i=0;i<acctList.size();i++){
            if(acctList.get(i).getBalance() < b){
                result.add(acctList.get(i));
            }
        }
        return result;
    }
}
