package com.jikewang.send.domain;

import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: LoanInfo
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:49
 * @Version: 1.0
 */
public class LoanInfo {
    private LoanFill loan;
    private List<Payment> payments;
    private List<Repaymentplan> repaymentPlans;
    private Customer customer;
    private List<Contact> contacts;

    public LoanFill getLoan() { return this.loan; }



    public void setLoan(LoanFill loan) { this.loan = loan; }



    public List<Payment> getPayments() { return this.payments; }



    public void setPayments(List<Payment> payments) { this.payments = payments; }



    public List<Repaymentplan> getRepaymentPlans() { return this.repaymentPlans; }



    public void setRepaymentPlans(List<Repaymentplan> repaymentPlans) { this.repaymentPlans = repaymentPlans; }



    public Customer getCustomer() { return this.customer; }



    public void setCustomer(Customer customer) { this.customer = customer; }



    public List<Contact> getContacts() { return this.contacts; }



    public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
}
