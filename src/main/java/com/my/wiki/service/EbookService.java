package com.my.wiki.service;

import com.my.wiki.domain.Ebook;
import com.my.wiki.domain.EbookExample;
import com.my.wiki.mapper.EbookMapper;
import com.my.wiki.req.EbookReq;
import com.my.wiki.resp.EbookResp;
import org.springframework.stereotype.Service;
import util.CopyUtil;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
//    @Autowired
    private EbookMapper ebookMapper;


    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        return CopyUtil.copyList(ebookList,EbookResp.class);

    }


}
