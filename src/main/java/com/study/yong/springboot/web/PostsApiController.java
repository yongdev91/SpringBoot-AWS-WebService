package com.study.yong.springboot.web;

import com.study.yong.springboot.service.posts.PostsService;
import com.study.yong.springboot.web.dto.PostsResponseDto;
import com.study.yong.springboot.web.dto.PostsSaveRequestDto;
import com.study.yong.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

// lombok 어노테이션으로 final이 선언된 모든 필드를 인자값으로 받는 생성자를 해당 어노테이션이 생성해준다.
// @Autowired는 권장하지 않는다.
@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    /**
     * 등록
     * @param requestDto
     * @return
     */
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    /**
     * 수정
     *
     * @param id
     * @param reqeustDto
     * @return
     */
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto reqeustDto) {
        return postsService.update(id, reqeustDto);
    }

    /**
     * 조회
     * @param id
     * @return
     */
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
