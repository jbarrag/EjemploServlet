/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.controller;

import com.bancodebogota.fdm.dao.LoginDao;
import com.bancodebogota.fdm.dto.UserDto;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Familia
 */
public class LoginAction extends ActionSupport {
    
    private UserDto userDto;
@Override
    public String execute() {
    
        
        userDto = LoginDao.obtenerUsuario(userDto);
       
            return SUCCESS;
       
        
        //userDto = new UserDto() ;
        
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
