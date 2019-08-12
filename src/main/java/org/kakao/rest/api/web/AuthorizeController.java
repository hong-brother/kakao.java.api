package org.kakao.rest.api.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizeController {

    @RequestMapping(value = "/authorize", method = RequestMethod.GET)
    public void getAuthorizeForKakao(){
        
    }
}
