package min.blog.controller.api;

import min.blog.Dto.ResponseDto;
import min.blog.config.auth.PrincipalDetail;
import min.blog.model.Board;
import min.blog.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardApiController {

    @Autowired
    private BoardService boardService;


    @PostMapping(value = "/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board,@AuthenticationPrincipal PrincipalDetail principalDetail) {
        System.out.println("BoardApiController : save 호출됨");
        boardService.글쓰기(board,principalDetail.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}