package zhongzhi_pingshen.service;

import zhongzhi_pingshen.pojo.Opus;
import zhongzhi_pingshen.pojo.PageBean;

import java.time.LocalDateTime;

public interface OpusService {
    void upload(Opus opus);

    PageBean page(String opusName, Integer page, Integer pageSize);
}
