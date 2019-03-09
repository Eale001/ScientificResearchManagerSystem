package com.eale.scientificresearchmanagersystem.system.service;

import com.eale.scientificresearchmanagersystem.system.bean.system.SystemMenu;
import com.eale.scientificresearchmanagersystem.system.bean.user.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface SystemMenuService {
    List<SystemMenu> findAllSystemMenu(User user);
}
