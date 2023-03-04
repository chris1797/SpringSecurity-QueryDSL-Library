package com.zaritalk.demo.likeTest;


import com.zaritalk.demo.entity.Article;
import com.zaritalk.demo.entity.Member;
import com.zaritalk.demo.service.LikeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Transactional
@AutoConfigureMockMvc
public class LikeTest {

    @Autowired
    LikeService likeService;

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("좋아요 테스트")
    void addlikeTest() throws Exception {
        Article article = createArticle();

        mockMvc.perform(post("/board/like" + article.getArticle_id())).andExpect(status().isOk());
    }

    private Article createArticle() throws Exception {
        Article article = Article.builder()
                .title("Title test")
                .content("Content test")
                .member(createMember())
                .build();

        return article;
    }

    private Member createMember() throws Exception {
        Member member =  Member.builder()
                .nickName("닉네임")
                .account_id("test id")
                .build();

        return member;
    }
}
