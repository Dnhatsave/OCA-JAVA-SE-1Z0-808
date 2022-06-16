package com.sydevelop.ArrayList;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBrach(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCostumer(String branchName, String costumerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCostumer(costumerName, initialAmount);
        }
        return false;
    }

    public boolean addCostumerTransaction(String branchName, String costumerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCostumerTransaction(costumerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch existsBranch = this.branches.get(i);
            if (existsBranch.getBranchName().equals(branchName)) {
                return existsBranch;
            }
        }
        return null;
    }

    public boolean listCostumers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Costumer details for branch " + branch.getBranchName());
            ArrayList<Costumers> branchCostumers = branch.getCostumersList();
            //Get list of all costumer of particular branch
            for (int i = 0; i < branchCostumers.size(); i++) {
                Costumers branchCostumer = branchCostumers.get(i);
                System.out.println("Costumer: " + branchCostumer.getName() + "[" + i + "]");
                // Optionaly show the transactions list of that costumer
                if (showTransactions) {
                    ArrayList<Double> transactions = branchCostumer.getTransations();
                    //Geting list of all transaction of particular costumer in that branch

                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            System.out.println("No brach found...");
            return false;
        }
    }
}
