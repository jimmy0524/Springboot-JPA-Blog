package min.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/auth/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }

    @GetMapping("/auth/kakao/callback")
    public @ResponseBody  String kakaoCallback(String code){ //Data를 리턴해주는 컨트롤러 함수
        //P
        return "카카오 인증 완료:코드값"+code;
    }
    @GetMapping("/auth/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }
}
