package min.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor //fianl 붙은 애들에 대한 생성자 생성
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;
}
