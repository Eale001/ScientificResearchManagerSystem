package com.eale.scientificresearchmanagersystem.system.service;

import com.eale.scientificresearchmanagersystem.system.bean.user.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface UserService {
    User checkUserExits(User user);
}
