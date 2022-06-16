package com.sydevelop.ArrayList;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Costumers> costumersList;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.costumersList = new ArrayList<Costumers>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Costumers> getCostumersList() {
        return costumersList;
    }

    public boolean newCostumer(String costumerName, double initialAmount) {
        if (findCostumer(costumerName) == null) {
            this.costumersList.add(new Costumers(costumerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCostumerTransaction(String costumerName, double amount) {
        Costumers existingCostumer = findCostumer(costumerName);
        if (existingCostumer != null) {
            existingCostumer.addTransation(amount);
            return true;
        }
        return false;
    }

    private Costumers findCostumer(String costumerName) {
        for (int i = 0; i < this.costumersList.size(); i++) {
            Costumers checkedCostumer = this.costumersList.get(i);
            if (checkedCostumer.getName().equals(costumerName)) {
                return checkedCostumer;
            }
        }
        return null;
    }
}
