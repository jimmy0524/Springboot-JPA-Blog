package min.blog.service;

import min.blog.config.auth.PrincipalDetail;
import min.blog.model.Board;
import min.blog.model.RoleType;
import min.blog.model.User;
import min.blog.repository.BoardRepository;
import min.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;


    @Transactional
    public void 글쓰기(Board board,  User user) {
        board.setCount(0);
        board.setUser(user);
        boardRepository.save(board);
    }
}
