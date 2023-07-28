package min.blog.controller.api;

import min.blog.Dto.ResponseDto;
import min.blog.model.User;
import min.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/auth/joinProc")
    public ResponseDto<Integer> save(@RequestBody User user) {
        System.out.println("UserApiController : save 호출됨");
        userService.회원가입(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

   /* @PostMapping("/auth/loginForm")
    public ResponseDto<Integer> login(@RequestBody User user,HttpSession httpSession) {
        System.out.println("UserApiController : login 호출됨");
        User principal = userService.로그인(user);
        if(principal!=null){
            httpSession.setAttribute("principal",principal);
        }
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }*/
}
