package com.hmy.advance.shiro;

import com.hmy.advance.util.StringUtil;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken uToken = (UsernamePasswordToken) token;
        String inPassword = new String(uToken.getPassword());
        String dbPassword = (String) info.getCredentials();
        return dbPassword.equals(StringUtil.string2MD5(inPassword));
    }
}
