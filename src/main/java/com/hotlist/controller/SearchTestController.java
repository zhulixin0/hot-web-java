package com.hotlist.controller;

import com.hotlist.common.R;
import com.hotlist.common.dto.SearchDto;
import com.hotlist.service.SearchService;
import com.hotlist.utils.ESPageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/s")
public class SearchTestController {

    @Resource
    private SearchService searchService;
    @GetMapping("/search")
    public R search(SearchDto searchDto) throws IOException {
        ESPageUtil esPageUtil = searchService.searchResult(searchDto);
        return R.ok().put("data", esPageUtil);
    }


}
