package zhongzhi_pingshen.service.impl;

import zhongzhi_pingshen.mapper.ScoreMapper;
import zhongzhi_pingshen.pojo.OpusScore;
import zhongzhi_pingshen.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public void score(OpusScore opusScore) {
        scoreMapper.score(opusScore);
    }
}
