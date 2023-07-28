package min.blog.test;

import org.springframework.web.bind.annotation.*;

//사용자가 요청->응답(HTML 파일)
//@Controller

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllertes {

    //인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.

    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get 요청:"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
    }
    @PostMapping("/http/post")
    public String postTest(){
        return "post 요청";
    }
    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }
    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
