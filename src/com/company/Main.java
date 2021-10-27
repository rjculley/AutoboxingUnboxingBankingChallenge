package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Suntrust");

        bank.addBranch("LakeNona");

        bank.addCustomer("LakeNona", "RJ", 50.05);
        bank.addCustomer("LakeNona", "Mike", 175.34);
        bank.addCustomer("LakeNona", "Andrea", 220.15);

        bank.addBranch("Hunters Creek");
        bank.addCustomer("Hunter's Creek", "Bob", 150.14);


    }
}
