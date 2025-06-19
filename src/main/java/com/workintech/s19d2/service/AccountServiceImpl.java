package com.workintech.s19d2.service;

import com.workintech.s19d2.repository.AccountRepository;
import com.workintech.s19d2.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService{
    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account save(Account account) {
        Account accountCreate=  accountRepository.save(account);
        return accountCreate;
    }

    @Override
    public Account update(Account account){
        return  accountRepository.save(account);
    }

    @Override
    public Account find(long id) {
        Optional<Account> account=accountRepository.findById(id);
        if(account.isPresent()){
            return account.get();
        }
        return null;
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
